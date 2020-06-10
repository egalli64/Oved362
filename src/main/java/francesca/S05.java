package francesca;

public class S05 {
	
	public static void main(String[] args) {
//		String prova = reverse("ciao");
//		System.out.println(prova);
		
		System.out.println(isPalindrome("anna"));
	}
	/**
	 * Reverse a string
	 * 
	 * @param s
	 * @return the input reversed
	 */
	public static String reverse(String s) {

		StringBuilder res = new StringBuilder(s.length());
		
		for(int i = s.length() - 1; i >= 0; i--) {
			res.append(s.charAt(i));
		}
		return res.toString();
	}

	/**
	 * Check if the parameter is a palindrome
	 * 
	 * @param s
	 * @return true if the parameter is a palindrome
	 */
	public static boolean isPalindrome(String s) {	
		System.out.print(s.length()/2);
		
		String meta1 = s.substring(0, s.length()/2);
		String meta2 = s.substring(s.length()/2, s.length());
		
		return meta1.equals(S05.reverse(meta2));
		
//		//Mia sol
//		String contrario = reverse(s);
//		boolean pal = true;
//		
//		for(int i = 0; i < s.length(); i++) {
//			if(!s.equals(contrario))
//				pal = false;
//		}
//		return pal;
		

		
//		StringBuilder res = new StringBuilder("");
//		
//		for (int i = s.length() - 1; i >= 0; i--) {
//			res.append(s.charAt(i));
//		}
//
//		return res.toString();
	}

	/**
	 * Remove vowels from the parameter
	 * 
	 * @param s
	 * @return a string, same of input but without vowels
	 */
	public static String removeVowels(String s) {
		StringBuilder res = new StringBuilder();
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
					||  c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
			else {
				res.append(c);
			}
		}

		return res.toString();
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
		if(s == null || s.isEmpty()) {
			throw new IllegalArgumentException("s input parameters");
		}
		
		int res = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '1') {
				res += Math.pow(2, i);
			}
		}
		
		return res;
		
//		//SOL Zambo
//		String bin = s.replaceAll("[^0|1]", "");
//		if(bin.isBlank()) {
//			throw new IllegalArgumentException("Invalid String");
//		}
//		
//		int exp = 0, sum = 0;
//		for(int i = bin.length()-1; i >= 0; i--) {
//			if(bin.charAt(i) == '1') {
//				sum += Math.pow(2, exp);
//			}
//			exp++;
//		}
//		
//		return sum;
	}

	/**
	 * Reverse an array of integers
	 * 
	 * @param data
	 * @return a new array holding the same elements of input, in reversed order
	 */
	public static int[] reverse(int[] data) {
		int[] result = new int[data.length];

		for(int i = 0; i < data.length; i++) {
			result[i] = data[data.length -i-1];
		}

		return result;
	}

	/**
	 * Calculate the average
	 * 
	 * @param data
	 * @return the average
	 */
	public static double average(int[] data) {
		double res = 0.0;
		int n = data.length;
		
		for(int i = 0; i < n; i++) {
			res += data[i];
		}
		
		return res/n;
	}

	/**
	 * Find the largest value
	 * 
	 * @param data
	 * @return the largest value
	 */
	public static int max(int[] data) {
//		int max = data[0];
//		
//		for(int i = 0; i < data.length; i++) {
//			if(data[i] > max)
//				max = data[i];
//		}
//		return max;
		
		//Altra sol
		int result = Integer.MIN_VALUE;
		for(int current : data) {
			result = (current > result) ? current : result;
		}
		return result;
	}
}
