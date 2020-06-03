package  manuela/m2ex;

//import java.util.Arrays;

public class S03 {
    /**
     * Check if the parameter is positive, negative, or zero
     * 
     * @param value an integer
     * @return "positive", "negative", or "zero"
     */
    public static String checkSign(int value) {
    	
        int result = value;
        
        if(result == 0) {
        	
        	return "zero";
        	
        }if(result > 0) {	
        	
        	return "positive";
        	
        }else{  	
        	
        	return "negative";
        }
    }

    /**
     * Check if the parameter is odd
     * 
     * @param value an integer
     * @return "odd" or "even"
     */
    public static boolean isOdd(int value) {
    	
        int number = value;
        
        if(number % 2 != 0) {     	
        	
        	return true;
        	
        }else {   
        	
        	return false;
        }
        
    }

    /**
     * Convert the parameter to its English name, if it is in [0..9]
     * 
     * @param value an integer
     * @return "zero" for 0 ... "nine" for 9, or "other"
     */
    public static String asWord(int value) {
    	
    	int result = value;
    	
    	switch (result) {
    	case 0:
    		return "zero";
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
  
        default:
            return "other";

        }
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
    	
    	if (percentile <= 50) {
    		return 'F';
    	}else if (percentile <= 60 && percentile >50 ) {
    		return 'E';
    	}else if (percentile <= 70 && percentile >60 ) {
    		return 'D';
    	}else if (percentile <= 80 && percentile >70 ) {
    		return 'C';
    	}else if (percentile <= 90 && percentile >80 ) {
    		return 'B';
    	}else 
    		return 'A';
    }

    /**
     * Leap year checker
     * 
     * @param year
     * @return true if leap year
     */
    public static boolean isLeapYear(int year) {
    	
    	int actual = year;
    	if (actual >1584 && (actual % 400==0) ||(actual % 4 == 0 && actual % 100 !=0)) {
    		return true;
    	}else {
    		return false;
    	}
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
        
        if(a < b && a < c) {
        	
         	result[0] = a;
         	
         	if(b < c) {
         		
         		result[1] = b;
         		result[2] = c;
         	} else {
         		
         		result[1] = c;
         		result[2] = b;
         	}
         }
         if(b < c && b < a) {
        	 
         	result[0] = b;
         	if(a < c) {
         		
         		result[1] = a;
         		result[2] = b;
         	} else {
         		
         		result[1] = b;
         		result[2] = c;
         	}
         }
         if(c < a && c < b) {
         	result[0] = c;
         	if(a < b) {
         		
         		result[1] = a;
         		result[2] = b;
         	} else {
         		
         		result[1] = b;
         		result[2] = a;
         	}
         }
         return result;
    }
}


