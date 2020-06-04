package rocco;

public class S03 {
    /**
     * Check if the parameter is positive, negative, or zero
     * 
     * @param value an integer
     * @return "positive", "negative", or "zero"
     */
    public static String checkSign(int value) {
      String sign = "zero";
      if(value > 0) {
    	  return "positive";
      } else if(value < 0) {
    	  return "negative";
      }
      return sign;
    }

    /**
     * Check if the parameter is odd
     * 
     * @param value an integer
     * @return "odd" or "even"
     */
    public static boolean isOdd(int value) {
       int resto = value%2;
       if(resto > 0) {
    	   return true;
       }
       return false;
    }

    /**
     * Convert the parameter to its English name, if it is in [0..9]
     * 
     * @param value an integer
     * @return "zero" for 0 ... "nine" for 9, or "other"
     */
    public static String asWord(int value) {
        switch (value) {
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
		case 6: 
			return "six";
		case 7: 
			return "seven";
		case 8: 
			return "eight";
		case 9: 
			return "nine";
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
        if(percentile < 0 || percentile > 100) {
        	throw new IllegalArgumentException("This percentile is not ammissible for vote");
        }
    	char vote = 'A';
    	if(percentile <= 90 && percentile > 80) {
    		vote = 'B';
    	} else if(percentile <= 80 && percentile > 70) {
    		vote = 'C';
    	} else if(percentile <= 70 && percentile > 60) {
    		vote = 'D';
    	} else if(percentile <= 60 && percentile > 50) {
    		vote = 'E';
    	} else if(percentile <= 50){
    		vote = 'F';
    	}
        return vote;
    }

    /**
     * Leap year checker
     * 
     * @param year
     * @return true if leap year
     */
    public static boolean isLeapYear(int year) {
    	if (year % 4 != 0) {
    	    return false;
    	  } else if (year % 400 == 0) {
    	    return true;
    	  } else if (year % 100 == 0) {
    	    return false;
    	  } else {
    	    return true;
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
