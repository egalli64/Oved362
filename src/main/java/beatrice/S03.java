package beatrice;

import java.util.*;

public class S03 {
    
    //SEGNO
    /**
     * Check if the parameter is positive, negative, or zero
     * 
     * @param value an integer
     * @return "positive", "negative", or "zero"
     */
    public static String checkSign(int value) {
        if (value == 0) {
            return "zero";
        }
        else if (Math.abs(value) == value) {
            return "positive";
        }
        return "negative";
    }

//    //PROVA SEGNO
//    public static void main (String[] args) {
//        int value = 90;
//        System.out.println("Sign is: " +checkSign(value));
//    } 
    
    //PARI E DISPARI
    /**
     * Check if the parameter is odd
     * 
     * @param value an integer
     * @return "odd" or "even"
     */
    public static boolean isOdd(int value) {
        if (value%2 != 0)
            return true;
        return false;
    }
    
//    //PROVA PARI E DISPARI
//    public static void main (String[] args) {
//        int value = -23;
//        System.out.println("This number is odd. True or False? " +isOdd(value));
//    }

    //asWORD
    /**
     * Convert the parameter to its English name, if it is in [0..9]
     * 
     * @param value an integer
     * @return "zero" for 0 ... "nine" for 9, or "other"
     */
    public static String asWord(int value) {
        switch(value) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 0:
                return "zero";
            }
        return "other";
        }
//  //PROVA INT TO WORD
//  public static void main (String[] args) {
//      int value =23;
//      System.out.println(asWord(value));
//  }
    
    //VOTO
    /**
     * Convert a value in the interval [0, 100] to a letter in [A, F]
     * 
     * A if value > 90 B if value in (80, 90] ... F if value <= 50
     * 
     * @param percentile in [0, 100]
     * @return a letter in [A, F]
     */
    public static char vote(double percentile) {
        if ((percentile > 90) && (percentile <= 100)){
            return 'A';
        } 
        else if ((percentile > 80) && (percentile <= 90)){
            return 'B';            
        }
        else if ((percentile > 70) && (percentile <= 80)){
            return 'C';   
        }
        else if ((percentile > 60) && (percentile <= 70)){
            return 'D';   
        }
        else if ((percentile > 50) && (percentile <= 60)){
            return 'E';
        }
        return 'F';  
        // why not: return 'Are you sure you entered a vote?';
        // DOUBT - Devo far tornare un char, ma se in input ho un double maggiore di 100 o negativo?
    }

    // LEAP YEAR
    /**
     * Leap year checker
     * 
     * @param year;
     * @return true if leap year
     */
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        else if ((year % 4 == 0) && (year % 100 != 0)) {
            return true;
        }
        return false;
    }

//    // PROVA LEAP YEAR
//    public static void main (String[] args) {
//        int year = 1900;
//        System.out.println("Year " + year + " is leap: " + isLeapYear(year));
//    }
    
    // SORT ALGORITHM - Bea version
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
        if ((a<b)&&(a<c)) {
            if(b<c) {
                result[0]=a;
                result[1]=b;
                result[2]=c;
            } else {
            result[0]=a;
            result[1]=c;
            result[2]=b;
            }
        }
            
        else if((b<a)&&(b<c)) {
            if (a<c) {
                result[0]=b;
                result[1]=a;
                result[2]=c;
            } else {
            result[0]=b;
            result[1]=c;
            result[2]=a;
            }
        }
        else if ((c<a)&&(c<b)) {
            if (a<b) {
                result[0]=c;
                result[1]=a;
                result[2]=b;
            } else {
            result[0]=c;
            result[1]=b;
            result[2]=a;
            }
        }
        return result;
    }

// PROVA SORT
    // DOMANDA X EMANUELE : perchè dentro main devo sempre mettere String[] args?
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int c = 1;
        System.out.println(Arrays.toString(sort(a,b,c)));
    }
}