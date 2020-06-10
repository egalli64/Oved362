package francesca;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SinkThem {
    static public final char SHIP = 'S';
    static public final char WRECK = 'W';
    static public final char MISS = 'M';
    static public final char EMPTY = '_';
    static public final char UNKNOWN = '?';

    static public final int POINTS_FOR_SINK = 5;
    static public final int POINTS_FOR_MISS = 1;

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
        // TODO
        board = new char[dimension][dimension]; //dimension
        
        for(int i = 0; i < board.length; i++) {
        	for(int j = 0; j < board.length; j++) {
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
     * UNKWNOWN should hide EMPTY and SHIP
     * 
     * @return a string
     */
    public String getBoard() {
        // TODO
    	StringBuilder stampa = new StringBuilder();
    	for(int i = 0; i < getBoardSize(); i++) {
    		
    		for(int j = 0; j < getBoardSize(); j++) {
    			
    			if(board[i][j] == MISS || board[i][j] == WRECK) {
    				stampa.append(board[i][j] + "\t");
    			}else if(board[i][j] == EMPTY || board[i][j] == SHIP) {
    				stampa.append(UNKNOWN + "\t");
    			}else{
    				System.out.print("ELSE");
    			}
    		}
    		stampa.append("\n");
    	}
    	
    	System.out.print(stampa.toString());
    	
        return stampa.toString() + "\n\n* * *\n* * *\n* * *\n\n";
    }

    /**
     * Place a ship on the board
     * increment counter if placing succeeded.
     * 
     * @param row
     * @param col
     * @return false if it can't be placed
     */
    public boolean place(int row, int col) {
    	if(row < 0 || row > board.length || col < 0 || col > board.length)
    		throw new IllegalArgumentException("Place input parameters");
    	
    	boolean res = false;
    	
        if(board[row][col] == EMPTY) {
        	board[row][col] = SHIP;
        	counter++;
        	res = true;
        }
        return res;
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
    	// TODO
    	if(row < 0 || row > board.length || col < 0 || col > board.length)
    		throw new IllegalArgumentException("Place input parameters");
        
    	boolean res = false;
    	
    	if(board[row][col] == SHIP) {
    		board[row][col] = WRECK;
    		points += POINTS_FOR_SINK;
    		counter--;
    		System.out.println("WRECK!");
    		res = true;
    	}else if(board[row][col] == EMPTY) {
    		board[row][col] = MISS;
    		points -= POINTS_FOR_MISS;
    		System.out.println("MISS!");
    		res = false;
    	}
    		
        return res;
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
        // TODO: use Scanner for user interaction
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Insert board dimension: ");
    	int dim = 0;
    	if(scanner.hasNextInt()) {
    		dim = scanner.nextInt();
    	}
        // TODO: let the player choose for a (sensible) board size
        SinkThem st = new SinkThem(dim);

        // TODO: place the ships randomly instead
//        st.place(0, 2);
//        st.place(1, 1);
//        st.place(2, 0);
        
        System.out.println("How many ships do you want to place? ");
        int num = 0;
    	if(scanner.hasNextInt()) {
    		num = scanner.nextInt();
    	}
    	
    	Random r = new Random();
        for(int i = 0; i < num; i++) {
        	st.place(r.nextInt(dim), r.nextInt(dim));
        }
 
        // TODO: use Scanner instead
//        shootAll(st);
        while(!st.done()) {
        	System.out.println("Insert row: ");
        	
        	int x = -1, y = -1;
        	if(scanner.hasNextInt()) {
        		y = scanner.nextInt();
        	}
        	
        	System.out.println("Insert col: ");
        	if(scanner.hasNextInt()) {
        		x = scanner.nextInt();
        	}
        	
        	st.shoot(y, x);
        	st.getBoard();
        }
        
        scanner.close();
       
        System.out.println(st);
        System.out.println("You scored " + st.getPoints());
    }
}
