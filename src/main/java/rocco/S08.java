package rocco;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


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
		if(left.length() != right.length()) {
			throw new UnsupportedOperationException("Not yet implemented");
		}
		return "";
		
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
		int[] result = new int[left.length + right.length];
		result = changeLastDigit(left, right, result);
		int i = 0;
		int j = 0;
		int k= 0;
		while(i < left.length  && j < right.length) {
			if(left[i] < right[j]) {
				result[k] = left[i];
				i++;
				k++;
			} else if(right[j] < left[i]) {
				result[k] = right[j];
				k++;
				j++;
			} else {
				result[k] = left[i];
				result[k+1] = right[j];
				i++;
				k+=2;
				j++;
			}
		}
		return result;
	}
	
	/**
	 * changeLastDigit replaces the last elements if one array
	 * is longer than another
	 * 
	 * <pre>
	 * [*,*,*,*,7], [*,*,*,*] -> [*,*,*,*,*,*,*,*,7]
	 * </pre>
	 * 
	 */
	
	private static int[] changeLastDigit(int[] left, int[] right, int[] result) {
		int leftSize = left.length;
		int rightSize = right.length;
		int rest = leftSize - rightSize;
		int resultsize = result.length;
		if(rest > 0) {
			while(rest >= 0) {
				result[resultsize - 1] = left[leftSize - 1];
				leftSize--;
				resultsize--;
				rest--;
			}
		}
		if(rest < 0) {
			rest = rest * -1;
			while(rest >= 0) {
				result[resultsize - 1] = right[rightSize - 1];
				rightSize--;
				resultsize--;
				rest--;
			}
		}
		return result;
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
		Arrays.sort(values);
		for (int i = 0; i < values.length -1; i+=2) {
			System.out.println(values[i]);
			if(values[i] != values[i+1]) {
				return values[i];
			}
		}
		return -1;
		
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
		Set<Character> charSet = new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			charSet.add(s.charAt(i));
		}
		return charSet.size() == s.length();
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
