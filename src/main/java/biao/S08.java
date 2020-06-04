package biao;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

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

	public static void main(String[] args) {
		System.out.println(binarySum("10", "11"));
		//int[] array = { 1, 4,4, 2, 3, 3,5,6,7,5,7,2, 1,1 };
		//getSingle(array);
		int [] array1= {1,2,3,4};
		int [] array2= {3,4,5,8};
		mergeSorted(array1,array2);
	}

	public static String binarySum(String left, String right) {
		// throw new UnsupportedOperationException("Not yet implemented");
		if (left.length() != right.length())
			throw new UnsupportedOperationException("lenght arrays diffent");
		int len = right.length() - 1;
		int[] bin_array_left = new int[left.length()];
		int[] bin_array_right = new int[right.length()];
		int[] bin_array = new int[right.length()];

		for (int i = 0; i < left.length(); i++) {
			bin_array_left[len - i] = Character.getNumericValue(left.charAt(i));
			bin_array_right[len - i] = Character.getNumericValue(right.charAt(i));

		}
		int rip = 0;
		for (int i = 0; i < right.length(); i++) {
			if (bin_array_left[i] + bin_array_right[i] == 2) {
				bin_array[i] = 0;
				if (rip == 1) {
					bin_array[i] = 1;
				}
				rip = 1;
			} else {
				bin_array[i] = bin_array_left[i] + bin_array_right[i];
				if (rip == 1) {
					if (bin_array[i] == 1) {
						bin_array[i] = 0;
						rip = 1;
					} else {
						bin_array[i] = 1;
						rip = 0;
					}
				} else {
					rip = 0;
				}

			}
		}
		int[] array = new int[right.length() + 1];
		for (int i = 0; i < bin_array.length; i++) {
			array[bin_array.length - i] = bin_array[i];
		}

		if (rip == 1) {
			array[0] = 1;
		} else {
			array[0] = 0;
		}
		String str = Arrays.toString(array);

		return str;
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
		
		//throw new UnsupportedOperationException("Not yet implemented");
		int [] array =new int[left.length + right.length];
		int i=0;
		int j=0;
		while (i<left.length ) {
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

	public static void QuickSort(int[] v, int in, int fin) {
		if (fin <= in)
			return;
		int pos = partiziona(v, in, fin);
		QuickSort(v, in, pos - 1);
		QuickSort(v, pos + 1, fin);
	}

	public static int partiziona(int[] v, int in, int fin) {
		int i = in + 1, j = fin;
		while (i <= j) {
			while ((i <= fin) && (v[i] <= v[in]))
				i++;
			while (v[j] > v[in])
				j--;
			if (i <= j) {

				int t = v[i];
				v[i] = v[j];
				v[j] = t;
			}
		}
		int tt = v[in];
		v[in] = v[i - 1];
		v[i - 1] = tt;

		return i - 1;
	}

	public static int getSingle(int[] values) {
		// throw new UnsupportedOperationException("Not yet implemented");
		System.out.println(Arrays.toString(values));
		
		
		QuickSort(values, 0, values.length - 1);
		System.out.println(Arrays.toString(values));
		for(int i=1; i<values.length-1;i++) {
			if( values[i-1] != values[i]  && values[i] != values[i+1]) {
				System.out.println(values[i]);
				
			}
			
		}
		if(values[0]!=values[1]) {
			System.out.println( values[0]);
		}
		if(values[values.length-1]!=values[values.length-2]) {
			System.out.println( values[values.length-1]);
		}
		
		return 0;
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
		int[] arrayAlfabeto = new int[21];
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case 'a':
				arrayAlfabeto[0]++;
				break;
			case 'b':
				arrayAlfabeto[1]++;
				break;
			case 'c':
				arrayAlfabeto[2]++;
				break;
			case 'd':
				arrayAlfabeto[3]++;
				break;
			case 'e':
				arrayAlfabeto[4]++;
				break;
			case 'f':
				arrayAlfabeto[5]++;
				break;
			case 'g':
				arrayAlfabeto[6]++;
				break;
			case 'h':
				arrayAlfabeto[7]++;
				break;
			case 'i':
				arrayAlfabeto[8]++;
				break;
			case 'l':
				arrayAlfabeto[9]++;
				break;
			case 'm':
				arrayAlfabeto[10]++;
				break;
			case 'n':
				arrayAlfabeto[11]++;
				break;
			case 'o':
				arrayAlfabeto[12]++;
				break;
			case 'p':
				arrayAlfabeto[13]++;
				break;
			case 'q':
				arrayAlfabeto[14]++;
				break;
			case 'r':
				arrayAlfabeto[15]++;
				break;
			case 's':
				arrayAlfabeto[16]++;
				break;
			case 't':
				arrayAlfabeto[17]++;
				break;
			case 'u':
				arrayAlfabeto[18]++;
				break;
			case 'v':
				arrayAlfabeto[19]++;
				break;
			case 'z':
				arrayAlfabeto[20]++;
				break;
			}
			
			for (int j = 0; j < 21; j++) {
				if (arrayAlfabeto[j] > 1) {
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
