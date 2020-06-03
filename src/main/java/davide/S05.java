package m2ex;

public class S05 {
	/**
	 * Reverse a string
	 * 
	 * @param s
	 * @return the input reversed
	 */
	public static String reverse(String s) {
		char[] current = s.toCharArray();
		char[] reverse = new char[s.length()];
		int j = current.length - 1;
		
		for(int i = 0; i < current.length; i++) {
			reverse[i] = current[j];
			j--;
		}
		return new String(reverse);
	}

	/**
	 * Check if the parameter is a palindrome
	 * 
	 * @param s
	 * @return true if the parameter is a palindrome
	 */
	public static boolean isPalindrome(String s) {
		return s.equals(S05.reverse(s));
	}

	/**
	 * Remove vowels from the parameter
	 * 
	 * @param s
	 * @return a string, same of input but without vowels
	 */
	public static String removeVowels(String s) {
		char[] current = s.toCharArray();
		char[] withNoVowels = new char[s.length()];
		int j = 0;
		
		for(int i = 0; i < current.length; i++) {
			if(current[i] != 'a' && current[i] != 'e' && current[i] != 'i' && current[i] != 'o' && current[i] != 'u') {
				withNoVowels[j] = current[i];
				j++;
			}
		}
	           
		return new String(withNoVowels).trim();
	}

	/**
	 * Convert from binary to decimal
	 * 
	 * @param s a string that contains the binary representation of an integer
	 * @return the converted integer
	 */
	public static int bin2dec(String s) {
		// [1][0][0][0][1]
	    // 43_210
	    // 2
		return 0;
	}

	/**
	 * Reverse an array of integers
	 * 
	 * @param data
	 * @return a new array holding the same elements of input, in reversed order
	 */
	public static int[] reverse(int[] data) {
		int[] result = new int[0];

		// TODO

		return result;
	}

	/**
	 * Calculate the average
	 * 
	 * @param data
	 * @return the average
	 */
	public static double average(int[] data) {
		// TODO
		return 0;
	}

	/**
	 * Find the largest value
	 * 
	 * @param data
	 * @return the largest value
	 */
	public static int max(int[] data) {
		// TODO
		return Integer.MIN_VALUE;
	}
}
