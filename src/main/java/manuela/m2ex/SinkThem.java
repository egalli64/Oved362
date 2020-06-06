package  manuela.m2ex;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

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
    //method to create grid
    public SinkThem(int dimension) {
        board = new char[dimension][dimension];
        for (int i = 0; i < dimension; i++)
        	for (int j = 0; j < dimension; j++)
        		board[i][j] = EMPTY;
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
    	//build board' s position
    	StringBuilder sb = new StringBuilder();
    	for (int i = 0; i < getBoardSize(); i++) {
        	for (int j = 0; j < getBoardSize(); j++) {
        		char actual = board[i][j];
        		if (actual == WRECK || actual == MISS)
        			sb.append(actual);
        		else
        			sb.append(UNKNOWN);
        		sb.append("\t");
        	}
        	sb.append("\n");
    	}
        return sb.toString();
    }
    
    private boolean isOkay(int row, int col) {
    	return row >= 0 && row < getBoardSize() &&
    			col >= 0 && col < getBoardSize();
    }

    /**
     * Place a ship on the board
     * 
     * @param row
     * @param col
     * @return false if it can't be placed
     */
    public boolean place(int row, int col) {
    	//
        if(!isOkay(row, col)) {
        	return false;
        } else if (board[row][col] == EMPTY) {
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
    	//if you are outside the limits of the grid
    	
    	if(!isOkay(row, col)) {
    		System.out.println("you're out of bounds!");
        	return false;
    	}
    	
    	//if you take a ship or a wreck, add points and decrement counter 
    	if (board[row][col] == SHIP) {
    		board[row][col] = WRECK;
    		points += POINTS_FOR_SINK;
    		counter--;
    		System.out.println("STRICKEN!");
    		return true;
    	}
    	//if you miss a ship, add point in point_for_miss
	    	board[row][col] = MISS;
	    	points += POINTS_FOR_MISS;
	    	System.out.println("FAILED!");
	        return false;
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
        //use Scanner for user interaction
    	int dim = 0;
    	Scanner scan = new Scanner(System.in);
    	System.out.print("Please insert a dimension for board: ");
        if (scan.hasNext()) {
        	if (scan.hasNextInt())
        		dim = scan.nextInt();
        	else
        		scan.next();
        }
        
        SinkThem st = new SinkThem(dim);
        
        ThreadLocalRandom rand = ThreadLocalRandom.current();
        int num = rand.nextInt(1, dim*dim-1);
        System.out.println("have been created "+num+" ships");
        for (int i = 0; i < num; i++) {
        	st.place(rand.nextInt(dim), rand.nextInt(dim));
        }
        
        while (!st.done()) {
        	System.out.println("Shoot the ship! (i,j)");
        	if (scan.hasNext()) {
            	String s = scan.next();
            	String split[] = s.split(",");
            	int i, j;
            	try {
					i = Integer.parseInt(split[0]);
					j = Integer.parseInt(split[1]);
				} catch (NumberFormatException | ArrayIndexOutOfBoundsException ex) {
					System.out.println("Sorry!This format is incompatible");
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
