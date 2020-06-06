package rocco;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

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
		int i = left.length() - 1;
		int j = right.length() - 1 ;
		int riporto = 0;
		StringBuilder sb = new StringBuilder();
		while(i >= 0 && j >= 0) {
				int sum = riporto;
				int c1 = Character.digit(left.charAt(i), 10);
				int c2 = Character.digit(right.charAt(j), 10);
				sum = c1 + c2;
				i--;
				j--;
				sb.append(sum%2);
				riporto = sum/2;
		}
		if(riporto != 0) {
			sb.append(riporto);
		}
		return sb.reverse().toString();
		
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
		int i = 0;
		int j = 0;
		int k = 0;
		while(i < left.length && j < right.length) {
			if(left[i] < right[j]) {
				result[k] = left[i];
				i++;
				k++;
			} else if(right[j] < left[i]) {
				result[k] = right[j];
				j++;
				k++;
			} else {
				result[k] = left[i];
				result[k+1] = right[j];
				k+=2;
				j++;
				i++;
			}
		}
		while(i < left.length) {
			result[i+j] = left[i];
			i++;
		}
		while(j < right.length) {
			result[i+j] = right[j];
			j++;
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
		int[] arrayIndex = new int[9];
		for (int i = 0; i < values.length; i++) {
			int value = values[i];
			arrayIndex[value]++;
		}
		for (int j = 0; j < arrayIndex.length; j++) {
			if(arrayIndex[j] == 1) {
				return j;
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
		if(s.length() != t.length()) {
			throw new UnsupportedOperationException("Le srtringhe devono avere la stessa lunghezza");
		}
		s = s.toLowerCase();
		t = t.toLowerCase();
		Set<Character> set = new TreeSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		int dimension = t.length();
		for (int j = 0; j < t.length(); j++) {
			if(set.contains(t.charAt(j))) {
				dimension--;
			}
		}
		if(dimension == 0) {
			return true;
		}
		return false;
	}
}
