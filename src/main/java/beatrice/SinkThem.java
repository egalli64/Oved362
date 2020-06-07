package beatrice;

import java.util.Arrays;
import java.util.*;

public class SinkThem {
    static public final char SHIP = 'S';
    static public final char WRECK = 'W';
    static public final char MISS = 'M';
    static public final char EMPTY = '_';
    static public final char UNKNOWN = '?';

    static public final int POINTS_FOR_SINK = 5;
    static public final int POINTS_FOR_MISS = -1;

    /** the battlefield */
    private char[][] board;
    /** ships on board */
    private int counter;
    /** current player score */
    private int points;

    /**
     * Create the squared board game filled with EMPTY cells
     * 
     * @param dimension board size
     */
    public SinkThem(int dimension) {
        board = new char[dimension][dimension];
        for (int i=0; i<dimension; i++) {
            for(int j=0; j<dimension;j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    /**
     * @return the current score
     */
    public int getPoints() {
        return points;
    }

    /**
     * @return true if no more ships
     */
    public boolean done() {
        return counter == 0;
    }

    /**
     * The board is a square
     * 
     * @return board size
     */
    public int getBoardSize() {
        return board.length;
    }

    /**
     * A user representation for the board
     * 
     * Only MISS and WRECK should be shown
     * 
     * UNKNOWN should hide EMPTY and SHIP
     * 
     * @return a string
     */
    public String getBoard() {
        StringBuilder board_visible = new StringBuilder();
        for (int i=0; i>getBoardSize();i++) {
            board_visible.append(i);
            
        }
        for (int i=0; i<getBoardSize(); i++) {
            for(int j=0; j<getBoardSize();j++) {
                char board_i_j = board[i][j];
                if (board_i_j == WRECK || board_i_j == MISS){
                    board_visible.append(board_i_j);
                } else {
                    board_visible.append(UNKNOWN);
                }
                board_visible.append("\t");
            }
            board_visible.append("\n");
        }
        return board_visible.toString();
    }

    /**
     * Place a ship on the board
     * 
     * @param row
     * @param col
     * @return false if it can't be placed
     */
    public boolean place(int row, int col) {
        if (board[row][col] == EMPTY ){
            board[row][col] = SHIP;
            counter++;
            return true;
        } else {
        return false;
        }
    }

    /**
     * Shoot to a cell
     * 
     * a miss would cost POINTS_FOR_MISS, a center would give POINTS_FOR_SINK
     * 
     * @param row
     * @param col
     * @return true for a sink
     */
    public boolean shoot(int row, int col) {
        if (board[row][col] == SHIP) {
            board[row][col] = WRECK;
            points += POINTS_FOR_SINK;
            counter--;
            System.out.println("WRECKED!");
            return true;
        }
        board[row][col] = MISS;
        points += POINTS_FOR_MISS;
        System.out.println("...missed...");
        return false;
    }

    public static int randInt(int dimension) {
        Random rand = new Random();
        return rand.nextInt(dimension-1);
    }
    
    
    @Override
    public String toString() {
        return Arrays.deepToString(board);
    }

    /**
     * Apply a simple strategy to the game
     * 
     * @param st the game
     */
    public static void shootAll(SinkThem st) {
        for (int i = 0; i < st.getBoardSize(); i++) {
            for (int j = 0; j < st.getBoardSize(); j++) {
                System.out.println(st.getBoard());
                if (st.shoot(i, j)) {
                    System.out.println("Hit!");
                    if (st.done()) {
                        System.out.println("You win!");
                        return;
                    }
                } else {
                    System.out.println("Miss ...");
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int dimension = 0;
        
        System.out.println("Benvenuto! Inserisci un numero intero da 3 a 9\n");
        Scanner scan = new Scanner(System.in);
        dimension = scan.nextInt();        
        
        SinkThem st = new SinkThem(dimension);
        
        for (int j=0;j<=(dimension*dimension*0.6);j++) {
            int rand_num1 = randInt(dimension);
            int rand_num2 = randInt(dimension);
            st.place(rand_num1, rand_num2);
        }
        System.out.println(st.getBoard());
        
        //DOMANDA: io volevo fare !done() ma mi dava errore perchè done non è static,
        // e ho risolto facendo st.done() perchè? NON ho capito bene static.
        while (!st.done()) {
            System.out.println("Inserisci le coordinate del lancio...");
            if (scan.hasNext()){
                try {
                    Integer riga = scan.nextInt();
                    Integer colonna = scan.nextInt();
                    st.shoot(riga,colonna);
                    System.out.println(st.getBoard());
                    System.out.println("Your actual score is " + st.getPoints());
                } catch (IndexOutOfBoundsException | NumberFormatException ex) {
                    System.out.println("Insert coordinate from 0 to " + (dimension-1));
                }
            }
        }
        scan.close();
            
        System.out.println(st);
        System.out.println("YOU WRECKED ALL SHIPS! You scored is " + st.getPoints());
    }
}
