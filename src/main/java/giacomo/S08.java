package giacomo;



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
		StringBuilder totalsum = new StringBuilder();
		/*
		 * if(left.length() != right.length()) { throw new
		 * IllegalArgumentException("Different Sizes!"); } else {
		 */
		totalsum.append(Integer.parseInt(left) + Integer.parseInt(right));
		totalsum.reverse();
		int report = 0;
		for (int i = 0; i < totalsum.length(); i++) {
			switch (totalsum.charAt(i)) {
			case '0':
				continue;

			case '1':
				if (i == totalsum.length() - 2) {
					totalsum.replace(totalsum.length(), totalsum.length() + 1, String.valueOf(0));
				}
				continue;

			case '2':
				if (i == totalsum.length() - 2) {
					totalsum.replace(totalsum.length(), totalsum.length() + 1, String.valueOf(0));
				}
				totalsum.replace(i, i + 1, String.valueOf(report));
				report = 1;
				totalsum.replace(i + 1, i + 2,
						String.valueOf(Integer.sum(report, Character.getNumericValue(totalsum.charAt(i + 1)))));
				report = 0;
				continue;

			case '3':
				if (i == totalsum.length() - 2) {
					totalsum.replace(totalsum.length(), totalsum.length() + 1, String.valueOf(0));
					report = 1;
				}
				report = 1;
				totalsum.replace(i, i + 1, String.valueOf(report));
				totalsum.replace(i + 1, i + 2,
						String.valueOf(Integer.sum(report, Character.getNumericValue(totalsum.charAt(i + 1)))));
				report = 1;
				continue;
			}
		}
		totalsum.reverse();
		// }
		while (totalsum.charAt(0) == '0') {
			totalsum.replace(0, 1, "");
		}
		String result = new String(totalsum);
		return result;
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
		throw new UnsupportedOperationException("Not yet implemented");
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
		int[] numericindex = new int[9];
		for (int singleindex = 0; singleindex < values.length; singleindex++) {
			numericindex[values[singleindex]]++;
		}
		Integer seekunique = null;
		for (int singlecheck = 0; singlecheck < numericindex.length; singlecheck++) {
			if (numericindex[singlecheck] == 1) {
				if (seekunique == null) {
					seekunique = singlecheck;
				} else {
					throw new UnsupportedOperationException("More than one Unique");
				}
			}
		}
		if (seekunique == null) {
			throw new UnsupportedOperationException("There's not Unique!");
		} else {
			return seekunique;
		}
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
		int[] alphaindex = new int[26];
		for (int indexs = 0; indexs < s.length(); indexs++) {
			alphaindex[s.charAt(indexs) - 'a']++;
		}
		for (int uniquecheck : alphaindex) {
			if (uniquecheck > 1) {
				return false;
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
		int[] alphaindex = new int[26];
		for (int indexs = 0; indexs < s.length(); indexs++) {
			alphaindex[s.charAt(indexs) - 'a']++;
		}
		for (int indext = 0; indext < t.length(); indext++) {
			alphaindex[t.charAt(indext) - 'a']--;
		}
		for (int anagramcheck : alphaindex) {
			if (anagramcheck != 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Get the only duplicate values in an array of couples and singles
	 * 
	 * <pre>
	 * [1,4,2,3,3,2,1] -> [1,2,3]
	 * </pre>
	 * 
	 * @param values an array
	 * 
	 * @return the only duplicate values
	 */
	public static int[] duplicates(int[] values) {
		int[] numericindex = new int[9];
		for (int singleindex = 0; singleindex < values.length; singleindex++) {
			numericindex[values[singleindex]]++;
		}
		Integer[] seekunique = new Integer[numericindex.length];
		for (int indexseek = 0, singlecheck = 0; singlecheck < numericindex.length; singlecheck++) {
			if (numericindex[singlecheck] >= 2) {
				boolean boolunique = true;
				for (Integer checkunique : seekunique) {
					if (checkunique != null) {
						if (singlecheck == checkunique) {
							boolunique = false;
						} else {
							boolunique = true;
						}
					}
				}
				if (boolunique == true) {
					seekunique[indexseek] = singlecheck;
					indexseek++;
				}
			}
		}
		int dim = 0;
		for (Integer checkuseless : seekunique) {
			if (checkuseless != null) {
				dim++;
			}
		}
		int[] returner = new int[dim];
		for (int returnindex = 0; returnindex < returner.length; returnindex++) {
			returner[returnindex] = seekunique[returnindex];
		}
		if (seekunique[0] == null) {
			throw new UnsupportedOperationException("There's not Duplicates!");
		} else {
			return returner;
		}
	}

}
