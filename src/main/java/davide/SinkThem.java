package davide;

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
        board = new char[dimension][dimension];
        
        for (int i = 0; i < board.length; i++) {
        	for (int j = 0; j < board.length; j++) {
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
        StringBuilder boardRep = new StringBuilder();
        
        for (int i = 0; i < getBoardSize(); i++) {
        	for (int j = 0; j < getBoardSize(); j++) {
        		char cell = board[i][j];
        		if (cell == MISS || cell == WRECK) {
        			boardRep.append(cell);
        		} else {
        			boardRep.append(UNKNOWN);
        		}
        		boardRep.append("\t");
        	}
        	boardRep.append("\n");
        }
        return boardRep.toString();
    }
    
    private boolean isRightCoordinate (int row, int col) {
    	if ((row >= 0 && row < getBoardSize()) && (col >= 0 && col < getBoardSize())) {
    		return true;
    	} else {
    		return false;
    	}
    }

    /**
     * Place a ship on the board
     * 
     * @param row
     * @param col
     * @return false if it can't be placed
     */
    public boolean place(int row, int col) {
        if (!isRightCoordinate(row, col)) {
        	return false;
        } 
        
        if (board[row][col] == EMPTY) {
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
    	if (!isRightCoordinate(row, col)) {
    		System.out.println("Coordinate non valide!");
    		return false;
    	} 
    	
    	if (board[row][col] == SHIP) {
    		board[row][col] = WRECK;
    		points += POINTS_FOR_SINK;
    		counter--;
    		System.out.println("COLPITO!");
    		return true;
    	} else {
    		board[row][col] = MISS;
    		points -= POINTS_FOR_MISS;
    		System.out.println("Mancato!");
    		return false;
    	}
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
        int size = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci una dimensione per la board: ");
        
        if (scan.hasNextInt()) {
        	size = scan.nextInt();
        } else {
        	scan.next();
        }
        
        
        SinkThem st = new SinkThem(size);
        Random random = new Random();
        
        int shipsNumber = random.nextInt((size*size-1) + 1);
        System.out.println("Ho creato " + shipsNumber + " navi.");
        
        for (int i = 0; i < shipsNumber; i++) {
        	@SuppressWarnings("unused")
			boolean flag = st.place(random.nextInt(size), random.nextInt(size));
        }
        
        while(!st.done()) {
        	System.out.println("SPARA! (riga, colonna)");
        	
        	if (scan.hasNext()) {
            	String s = scan.next();
            	String split[] = s.split(",");
            	int i, j;
            	try {
					i = Integer.parseInt(split[0]);
					j = Integer.parseInt(split[1]);
				} catch (NumberFormatException | ArrayIndexOutOfBoundsException ex) {
					System.out.println("Formato non accettabile");
					continue;
				}
            	st.shoot(i, j);
            }
        }

        scan.close();
        System.out.println(st);
        System.out.println("You scored " + st.getPoints());
    }
}
