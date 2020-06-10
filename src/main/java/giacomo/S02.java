package giacomo;

public class S02 {
	/**
	 * Average speed
	 * 
	 * @param distance in meters
	 * @param time     in seconds
	 * @return speed in meters per second
	 */
	public static double speed(double distance, double time) {
		// TODO
		return distance / time;
	}

	/**
	 * Distance between (x0, y0) and (x1, y1)
	 * 
	 * @param x0 first point x
	 * @param y0 first point y
	 * @param x1 second point x
	 * @param y1 second point y
	 * @return distance
	 */
	public static double distance(int x0, int y0, int x1, int y1) {
		// TODO
		return Math.sqrt(Math.pow(Math.abs(x0 - x1), 2) + Math.pow(Math.abs(y0 - y1), 2));
	}

	/**
	 * Engine capacity
	 * 
	 * @param bore   in mm
	 * @param stroke in mm
	 * @param nr     number of cylinders
	 * @return the engine capacity in cm^3
	 */
	public static double engineCapacity(double bore, double stroke, int nr) {
		// TODO
		final double CYLBORE = 0.7854;
		bore /= 10;
		stroke /= 10;
		return CYLBORE * bore * bore * stroke * nr;
	}

	/**
	 * Add up all the digits in an integer
	 * 
	 * @param value
	 * @return sum of digits
	 */
	public static int digitSum(int value) {
		// TODO
		int numdigit = 0;
		while (value != 0) {
			numdigit += (value % 10);
			value /= 10;
		}
		return Math.abs(numdigit);
	}

	/**
	 * Score based on distance from (0, 0) [1, 5, 10] -> [10, 5, 1, 0]
	 *
	 * @param x
	 * @param y
	 *
	 * @return
	 */
	public static int score(double x, double y) {
		// TODO
		double scorex = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		scorex = (scorex < 1) ? 10 : (scorex < 5) ? 5 : (scorex < 10) ? 1 : 0;
		return (int) scorex;

	}
}
