package m2ex;

public class S03 {
	/**
	 * Check if the parameter is positive, negative, or zero
	 * 
	 * @param value an integer
	 * @return "positive", "negative", or "zero"
	 */
	public static String checkSign(int value) {
		if (value > 0)
			return "positive";
		else if (value < 0)
			return "negative";
		else
			return "zero";
	}

	/**
	 * Check if the parameter is odd DISPARI
	 * 
	 * @param value an integer
	 * @return "odd" or "even"
	 */
	public static boolean isOdd(int value) {
		if (value % 2 == 0)
			return false; // even
		else
			return true; // odd
	}

	/**
	 * Convert the parameter to its English name, if it is in [0..9]
	 * 
	 * @param value an integer
	 * @return "zero" for 0 ... "nine" for 9, or "other"
	 */
	public static String asWord(int value) {
		String res = "";
		switch (value) {
		case 0:
			res = "zero";
			break;
		case 1:
			res = "one";
			break;
		case 2:
			res = "two";
			break;
		case 3:
			res = "three";
			break;
		case 4:
			res = "four";
			break;
		case 5:
			res = "five";
			break;
		case 6:
			res = "six";
			break;
		case 7:
			res = "seven";
			break;
		case 8:
			res = "eight";
			break;
		case 9:
			res = "nine";
			break;
		default:
			res = "other";
			break;
		}
		return res;
	}

	/**
	 * Convert a value in the interval [0, 100] to a letter in [A, F]
	 * 
	 * A if value > 90 B if value in (80, 90] ... F if value <= 50
	 * 
	 * @param percentile in [0, 100]
	 * @return a letter in [A, F]
	 */
	public static char vote(double percentile) {

		if (percentile > 90 && percentile <= 100) {
			return 'A';
		} else if (percentile > 80 && percentile <= 90) {
			return 'B';
		} else if (percentile > 70 && percentile <= 80) {
			return 'C';
		} else if (percentile > 60 && percentile <= 70) {
			return 'D';
		} else if (percentile > 50 && percentile <= 60) {
			return 'E';
		} else if (percentile <= 50 && percentile >= 0) {
			return 'F';
		} else {
			return 'O'; //ERRORE
		}

	}

	/**
	 * Leap year checker
	 * 
	 * @param year
	 * @return true if leap year
	 */
	public static boolean isLeapYear(int year) {
		if(year > 1584 && ( (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) ))
			return true;
		return false;
	}
	

	/**
	 * Sort the input parameters
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return a sorted array
	 */
	public static int[] sort(int a, int b, int c) {
		
		int[] result = new int[3];
		
		
		int max = a, min = b;
		
		if(b >= a && b >= c) {
			max = b;
		}else if(c >= a && c >= b) {
			max = c;
		}
		
		if(a <= b && a <= c) {
			min = a;
		}else if(c <= a && c <= b) {
			min = c;
		}
		
		result[0] = min;
		result[2] = max;
		if(min == a && max == b) { //acb
			result[1] = c;
		}else if(min == a && max == c) { //abc
			result[1] = b;
		}else if(min == b && max == a) { //bca
			result[1] = c;
		}else if(min == b && max == c) { //bac
			result[1] = a;
		}else if(min == c && max == b) { //cab
			result[1] = a;
		}else if(min == c && max == a) { //cba
			result[1] = b;
		}
		
		
		/*SOL ALTRA
		result[0] = Math.min(a, Math.min(b, c));
		if(result[0] == a) {
			result[1] = Math.min(b, c);
			result[2] = Math.max(b, c);
		}else if(result[0] == b) {
			result[1] = Math.min(a, c);
			result[2] = Math.max(a, c);
		}else {
			result[1] = Math.min(a, b);
			result[2] = Math.max(a, b);
		}*/
		
		
		/* OK
		result[0] = a;
		result[1] = b;
		result[2] = c;
		
		Arrays.sort(result);*/

		return result;
	}
}
