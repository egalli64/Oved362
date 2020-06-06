package m2ex;

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
		this.points = 0;
		board = new char[dimension][dimension];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				this.board[i][j] = EMPTY;
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
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				char cell = this.board[i][j];
				if (cell == MISS || cell == WRECK) {
					sb.append(cell);
				} else {
					sb.append(UNKNOWN);
				}
				sb.append("\t");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	/**
	 * Place a ship on the board
	 * 
	 * @param row
	 * @param col
	 * @return false if it can't be placed
	 */
	public boolean place(int row, int col) {
		if (row < this.getBoardSize() && col < this.getBoardSize() && (row >= 0 && col >= 0)) {
			this.board[row][col] = SHIP;
			counter++;
			return true;
		}
		return false;
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
		if (row < this.getBoardSize() && col < this.getBoardSize() && (row >= 0 && col >= 0)
				&& this.board[row][col] == SHIP) {
			this.board[row][col] = WRECK;
			this.points += POINTS_FOR_SINK;
			counter--;
			System.out.println("COLPITO!");
			return true;
		}
		this.board[row][col] = MISS;
		this.points -= POINTS_FOR_MISS;
		System.out.println("MANCATO!");
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
		// TODO: use Scanner for user interaction
		System.out.println("Inserisci una dimensione valida");
		Scanner scanner = new Scanner(System.in);
		SinkThem st = null;
		int dim = 0;
		if (scanner.hasNext()) {
			if (scanner.hasNextInt()) {
				dim = scanner.nextInt();
				while (dim <= 0) {
					System.out.println("IUnserisci la dimensione corretta");
					dim = scanner.nextInt();
				}
			} else {
				scanner.next();
			}
		}
		st = new SinkThem(dim);

		// TODO: let the player choose for a (sensible) board size
		Random random = new Random();
		int index = random.nextInt(st.getBoardSize() * st.getBoardSize() - 1);
		System.out.println("Ho creato: " + index + " navi");
		for (int i = 0; i < index; i++) {
			st.place(random.nextInt(st.getBoardSize()), random.nextInt(st.getBoardSize()));
			System.out.println(st.getBoard());
		}
	
		while (!st.done()) {
			System.out.println("Inserisci delle coordfinate (i,j) separate dalla virgola");
			if (scanner.hasNext()) {
				String result = scanner.nextLine();
				String[] coordinate = result.split(",");
				int x, y;
				try {
					x = Integer.parseInt(coordinate[0]);
					y = Integer.parseInt(coordinate[1]);
				} catch (NumberFormatException e) {
					System.out.println("Formato non accettabile");
					continue;
				}
				st.shoot(x, y);

			}
		}
		scanner.close();
		System.out.println(st.getBoard());
		System.out.println("You scored " + st.getPoints());
	}
}
