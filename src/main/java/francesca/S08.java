package m2ex;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class S08 {
	
	public static void main(String[] args) {
		
//		System.out.println(binarySum("101", "110"));
		
		int left[] = {1,2,4,6,7};
		int right[] = {3,4,4,6};
		System.out.println(mergeSorted(left, right));
		
//		int values[] = {1,4,4,5,6,2,3,3,2,1,5};
//		System.out.println(getSingle(values));
		
//		int left[] = {1,2,4,6,7};
//		int right[] = {3,4,4,6};
//		
//		mergeSorted(left, right);
		

		
//		System.out.println(hasOnlyUnique("hellol"));
//		System.out.println(isAnagram("ciaooo", "oiacco"));
		
		
	}
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
		if(left.length() != right.length())
			throw new IllegalArgumentException("left and right have different sizes");
		
		String res = "";
		boolean resto = false;
		
		for(int i = left.length()-1; i >= 0; i--) {
			if(left.charAt(i) == '0' && right.charAt(i) == '0') {
				if(!resto) {
					res += "0";
				}else {
					res += "1";
				}
				resto = false;
			}else if(left.charAt(i) == '1' && right.charAt(i) == '1') {
				if(!resto) {
					res += "0";
					resto = true;
				}else {
					res += "11";
					resto = false;
				}
				
			}else { //0 1 o 1 0
				//((left.charAt(i) == '1' && right.charAt(i) == '0') || 
				//(left.charAt(i) == '0' && right.charAt(i) == '0'))
				if(!resto) {
					res += "1";
				}else {
					res += "01";
				}
				resto = false;
			}
				
		}
		
		if(resto)
			res += "1";
		
		res = S05.reverse(res);
		
		return res;
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
//		throw new UnsupportedOperationException("Not yet implemented");
		int[] res = new int[left.length + right.length];
		int i = 0, j = 0, k = 0;
	
		while(i < left.length && j < right.length) {
			if(left[i] < right[j]) {
				res[k] = left[i];
				i++;
				k++;
			}else if(right[j] < left[i]) {
				res[k] = right[j];
				j++;
				k++;
			}else { //==
				res[k] = left[i];
				res[k+1] = right[j];
				i++;
				j++;
				k += 2;
			}
		}
		
		while(i < left.length) {
			res[i+j] = left[i];
			i++;
		}
		while(j < right.length) {
			res[i+j] = right[j];
			j++;
		}
		
		for(int z = 0; z < res.length; z++) {
			System.out.print(res[z]);
		}
		
		return res;
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
		int count[] = new int[9];
		int res = -1;
		
		for(int i = 0; i < values.length; i++) {
			count[values[i]]++; //conto occorrenze dei numeri da 1 a 9 presenti in values
		}
		
		for(int i = 0; i < count.length; i++) {
			if(count[i] == 1) {
				res = i;
			}
		}

		return res;
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
		Set<Character> chars = new HashSet<Character>();
		boolean res = false;
		
		for(int i = 0; i < s.length(); i++) {
			chars.add(s.charAt(i));
		}
		
		if(chars.size() == s.length())
			res = true;			
		
		return res;
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
			throw new UnsupportedOperationException("Different lengths");
		}
		boolean res = false;
		
		Map<Character, Integer> charsS = new TreeMap<Character, Integer>();
		Map<Character, Integer> charsT = new TreeMap<Character, Integer>();
		for(int i = 0; i < s.length(); i++) {
			if(charsS.containsKey(s.charAt(i))) {
				charsS.put(s.charAt(i), charsS.get(s.charAt(i))+1);
			}else {
				charsS.put(s.charAt(i), 1);
			}
		}
	
		for(int i = 0; i < t.length(); i++) {
			if(charsT.containsKey(t.charAt(i))) {
				charsT.put(t.charAt(i), charsT.get(t.charAt(i))+1);
			}else {
				charsT.put(t.charAt(i), 1);
			}
		}
		
		if(charsS.equals(charsT))
			res = true;
		
		return res;
	}
}
