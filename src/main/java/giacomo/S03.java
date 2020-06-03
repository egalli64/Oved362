package giacomo;

import java.util.Arrays;

public class S03 {
    /**
     * Check if the parameter is positive, negative, or zero
     * 
     * @param value an integer
     * @return "positive", "negative", or "zero"
     */
    public static String checkSign(int value) {
        // TODO
        return (-value>0)?"negative":(value==0)?"zero":"positive";
    }

    /**
     * Check if the parameter is odd
     * 
     * @param value an integer
     * @return "odd" or "even"
     */
    public static boolean isOdd(int value) {
        // TODO
        return (value%2!=0)?true:false;
    }

    /**
     * Convert the parameter to its English name, if it is in [0..9]
     * 
     * @param value an integer
     * @return "zero" for 0 ... "nine" for 9, or "other"
     */
    public static String asWord(int value) {
        // TODO
        return (value<0)?"other":(value==0)?"zero":(value==1)?"one":
        		(value==2)?"two":(value==3)?"three":(value==4)?"four":
        			(value==5)?"five":(value==6)?"six":(value==7)?"seven":
        				(value==8)?"eight":(value==9)?"nine":"other";
    }

    /**
     * Convert a value in the interval [0, 100] to a letter in [A, F]
     * 
     * A if value > 90 B if value in (80, 90] ... F if value <= 50
     * 
     * @param percentile in [0, 100]
     * @return a letter in [A, F]
     */
    public static char vote(double percentile) {
        // TODO
        return (percentile>90)?'A':(percentile<=90 && percentile>80)?'B':
        		(percentile<=80 && percentile>70)?'C':(percentile<=70 && percentile>60)?'D':
        			(percentile<=60 && percentile>50)?'E':'F';
    }

    /**
     * Leap year checker
     * 
     * @param year
     * @return true if leap year
     */
    public static boolean isLeapYear(int year) {
        // TODO
    	final int LEAPCONST=4;
    	final int SECULAR=100;
        return (year%100!=0 && year%LEAPCONST==0)?true:
        		(year%(LEAPCONST*SECULAR)==0)?true:false;
    }

    /**
     * Sort the input parameters
     * 
     * @param a
     * @param b
     * @param c
     * @return a sorted array
     */
    public static int[] sort(int a, int b, int c) {
        int[] result = new int[3];
        // TODO
        result[0]=a;
        result[1]=b;
        result[2]=c;
        Arrays.sort(result);
        return result;
    }
}
