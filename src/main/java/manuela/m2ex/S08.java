package  manuela.m2ex;

import java.util.Arrays;

public class S08 {
	/**
	 * Binary addition on strings
	 * 
	 * <pre>
	 * "10" + "11" = "101"
	 * </pre>
	 * 
	 * @param left  binary represented on string
	 * @param right binary represented on string
	 * 
	 * @return left + right as binary on string
	 * @throws IllegalArgumentException different sizes
	 */
	public static String binarySum(String left, String right) {
		throw new UnsupportedOperationException("Not yet implemented");
	}

	/**
	 * Merge sorted arrays in a new array still sorted
	 * 
	 * <pre>
	 * [1,2,4,6,7], [3,4,4,6] -> [1,2,3,4,4,4,6,6,7]
	 * </pre>
	 * 
	 * @param left  a sorted array
	 * @param right a sorted array
	 * 
	 * @return a merge of the two input parameters
	 */
	public static int[] mergeSorted(int[] left, int[] right) {
//
    	int [] array =new int[left.length + right.length];
		int i=0;
		int j=0;

			while(j<right.length  && i<left.length ) {
				System.out.println(i);	
				System.out.println(j);	
				if(left[i] <= right[j]){
					array[i+j]=left[i];
					i++;
				}else {
					array[i+j]=right[j];
					j++;
				}
		}
		while(i<left.length) {
			array[i+j]=left[i];
			i++;
		}
		while(j<right.length) {
			array[i+j]=right[j];
			j++;
		}		
		System.out.println(Arrays.toString(array));
		return array;
	}

	/**
	 * Get the only single value in an array of couples
	 * 
	 * <pre>
	 * [1,4,2,3,3,2,1] -> 4
	 * </pre>
	 * 
	 * @param values an array
	 * 
	 * @return the only single value
	 */
	public static int getSingle(int[] values) {
		throw new UnsupportedOperationException("Not yet implemented");
	}

	/**
	 * Check for duplicate characters in a string
	 * 
	 * <pre>
	 * "hello" -> false, "helo" -> true
	 * </pre>
	 * 
	 * @param s a string
	 * 
	 * @return true if no duplicates in
	 */
	public static boolean hasOnlyUnique(String s) {
		
		int[] arrayAlphabet = new int[21];
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case 'a':
				arrayAlphabet[0]++;
				break;
			case 'b':
				arrayAlphabet[1]++;
				break;
			case 'c':
				arrayAlphabet[2]++;
				break;
			case 'd':
				arrayAlphabet[3]++;
				break;
			case 'e':
				arrayAlphabet[4]++;
				break;
			case 'f':
				arrayAlphabet[5]++;
				break;
			case 'g':
				arrayAlphabet[6]++;
				break;
			case 'h':
				arrayAlphabet[7]++;
				break;
			case 'i':
				arrayAlphabet[8]++;
				break;
			case 'l':
				arrayAlphabet[9]++;
				break;
			case 'm':
				arrayAlphabet[10]++;
				break;
			case 'n':
				arrayAlphabet[11]++;
				break;
			case 'o':
				arrayAlphabet[12]++;
				break;
			case 'p':
				arrayAlphabet[13]++;
				break;
			case 'q':
				arrayAlphabet[14]++;
				break;
			case 'r':
				arrayAlphabet[15]++;
				break;
			case 's':
				arrayAlphabet[16]++;
				break;
			case 't':
				arrayAlphabet[17]++;
				break;
			case 'u':
				arrayAlphabet[18]++;
				break;
			case 'v':
				arrayAlphabet[19]++;
				break;
			case 'z':
				arrayAlphabet[20]++;
				break;
		}
		
		for (int j = 0; j < 21; j++) {
			if (arrayAlphabet[j] > 1) {
				System.out.println(j);
				return false;	
			}
		}
			
	}
		return true;
	}



	/**
	 * Check for anagram
	 * 
	 * @param s
	 * @param t
	 * @return true if s is an anagram of t
	 */
	public static boolean isAnagram(String s, String t) {
		throw new UnsupportedOperationException("Not yet implemented");
	}
}
