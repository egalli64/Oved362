package manuela.m2ex;

public class S05 {
	/**
	 * Reverse a string
	 * 
	 * @param s
	 * @return the input reversed
	 */
	public static String reverse(String s) {
		
		StringBuilder reverse = new StringBuilder();
		
		for (int i = s.length() - 1; i >= 0; i--) {
			
			reverse.append(s.charAt(i));
		}
		
		return reverse.toString();
	}

	/**
	 * Check if the parameter is a palindrome
	 * 
	 * @param s
	 * @return true if the parameter is a palindrome
	 */
	public static boolean isPalindrome(String s) {
		
		int l=s.length();
		
		if (l<2) {
		    return true;
		    
		}else if(!s.substring(0,1).equals(s.substring(l-1,l))) {
			
			return false;
			
		}else {
			
			return true;
		}
		
	}

	/**
	 * Remove vowels from the parameter
	 * 
	 * @param s
	 * @return a string, same of input but without vowels
	 */
	public static String removeVowels(String s) {
		//new mutable string
		StringBuilder str = new StringBuilder();
		//for on string s 
		for (int i = 0; i < s.length(); i++) {
			
			char actual = s.charAt(i);
			
			if (actual == 'a' || actual == 'e' || actual == 'i' || actual == 'o' || actual == 'u') {
				continue;
			}
			str.append(actual);
		}
		return str.toString();
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
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			char actual = s.charAt(i);
			if (actual == '1') {
				result += (Math.pow(2, i));
			}
		}
		return result;
	}

	/**
	 * Reverse an array of integers
	 * 
	 * @param data
	 * @return a new array holding the same elements of input, in reversed order
	 */
	public static int[] reverse(int[] data) {
	
		for (int i = 0; i < data.length; i++) {
			data[i] = data[data.length-1- i];
		}

		return data;
	}

	

	/**
	 * Calculate the average
	 * 
	 * @param data
	 * @return the average
	 */
	public static double average(int[] data) {
		int sum = 0;
 
		for(int i=0; i<data.length; i++) {
			sum += data[i];
		}
		int average = sum /data.length;
		return average ;
	}

	/**
	 * Find the largest value
	 * 
	 * @param data
	 * @return the largest value
	 */
	public static int max(int[] data) {
		
		int max = data[0];
		for (int i = 0; i < data.length; i++) {
			if(data[i] > max) {
				max = data[i];
			}
		}
		return max;
	}
}
