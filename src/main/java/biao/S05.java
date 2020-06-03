package biao;

import java.lang.Math;

public class S05 {
    /**
     * Reverse a string
     * 
     * @param s
     * @return the input reversed
     */

    public static void main(String[] args) {
        // System.out.println(isPalindrome("anlpna"));
        // int[] array = { 1, 2, 3, 4 };
        // System.out.println(Arrays.toString(reverse(array)));

    }

    public static String reverse(String s) {
        char[] str = s.toCharArray();
        StringBuilder result = new StringBuilder("");
        for (int i = str.length - 1; 0 <= i; i--) {
            result.append(str[i]);
        }
        String r = result.toString();
        return r;
    }

    public static String reverse1(String s) {

        StringBuilder result = new StringBuilder("");
        for (int i = s.length() - 1; 0 <= i; i--) {
            result.append(s.charAt(i));
        }
        String r = result.toString();
        return r;
    }

    /**
     * Check if the parameter is a palindrome
     * 
     * @param s
     * @return true if the parameter is a palindrome
     */
    public static boolean isPalindrome(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        int position_last = s.length();
        int position_middle = position_last / 2;

        for (int i = 0; i < position_middle; i++) {
            if (s.charAt(i) != s.charAt(position_last - i - 1)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Remove vowels from the parameter
     * 
     * @param s
     * @return a string, same of input but without vowels
     */
    public static String removeVowels(String s) {
        String vowels = "aeiouAEIOU";
        StringBuilder result = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {
            if (!vowels.contains(String.valueOf(s.charAt(i)))) {
                result.append(s.charAt(i));
            }
        }
        String r = result.toString();
        return r;
    }

    public static String removeVowels1(String s) {
        char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };

        String result = "";
        for (int i = 0; i < s.length(); i++) {
            boolean find = false;
            for (int j = 0; j < vowels.length; j++) {
                if (vowels[j] == s.charAt(i)) {
                    find = true;
                }
            }
            if (!find) {
                result = result + s.charAt(i);
            }
        }
        return result;
    }

    /**
     * Convert from binary to decimal
     * 
     * @param s a string that contains the binary representation of an integer
     * @return the converted integer
     */
    public static int bin2dec(String s) {
        // char [] bin_array_char=new char[s.length()];
        int[] bin_array_int = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            bin_array_int[i] = Character.getNumericValue(s.charAt(i));

        }
        int sum = 0;

        for (int i = 0; i < bin_array_int.length; i++) {
            sum = (int) (sum + bin_array_int[i] * Math.pow(2, bin_array_int.length - i - 1));
        }
        return sum;
    }

    /**
     * Reverse an array of integers
     * 
     * @param data
     * @return a new array holding the same elements of input, in reversed order
     */
    public static int[] reverse(int[] data) {
        int[] result = new int[data.length];

        for (int i = 0; i < data.length; i++) {
            result[data.length - i - 1] = data[i];
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
        double average = 0;
        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum = sum + data[i];
        }
        average = sum / data.length;
        return average;
    }

    /**
     * Find the largest value
     * 
     * @param data
     * @return the largest value
     */
    public static int max(int[] data) {
        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (max < data[i]) {
                max = data[i];
            }
        }
        return max;
    }
}
