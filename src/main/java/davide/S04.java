package davide;

public class S04 {
    /**
     * Add up all the numbers in the passed closed interval
     * 
     * @param first the left limit
     * @param last  the right limit
     * @return the sum of all the numbers, or zero
     */
    public static long sum(int first, int last) {
        long sum = 0;
        if (first > last) {
            return sum;
        } else {
            for (int i = first; i <= last; i++) {
                sum += i;
            }
            return sum;
        }
    }

    /**
     * Add up only the even numbers in the passed closed interval
     * 
     * @param first the left limit
     * @param last  the right limit
     * @return the sum of all the even numbers, or zero
     */
    public static long evenSum(int first, int last) {
        long sum = 0;
        if (first > last) {
            return sum;
        } else {
            for (int i = first; i <= last; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
            return sum;
        }
    }

    /**
     * Square root using Newton method Epsilon should be set to 0.001
     * 
     * @param value
     * @return calculated square root
     */
//	public static double sqrt(double value) {	    
//	    final double EPSILON = 0.001;
//	    
//	    
//	    while(prev - succ > EPSILON) {
// 	    	
//	    } 	    
//	    return succ;
//	}

    /**
     * Square root using Newton method
     * 
     * @param value
     * @param epsilon stop iterating when gain is less than this value
     * @return calculated square root
     */
    public static double sqrt(double value, double epsilon) {
        // TODO
        return 0.0;
    }

    /**
     * Factorial
     * 
     * @param value
     * @return factorial of input value, or zero
     */
    public static long factorial(int value) {
        if (value < 0) {
            return 0;
        } else {
            long fact = 1;
            int temp = value;
            while (value != 0 && value != 1 && temp > 1) {
                fact *= temp--;
            }
            return fact;
        }
    }

    /**
     * Fibonacci number (0, 1, 1, 2, 3, 5, 8, �)
     * 
     * @param value
     * @return the Fibonacci number of value, or zero
     */
    public static long fibonacci(int value) {
        if (value == 0) {
            return 0;
        } else if (value == 1) {
            return 1;
        } else {
            return fibonacci(value - 1) + fibonacci(value - 2);
        }
    }

    /**
     * Multiplication table
     * 
     * @param value
     * @return The multiplication table for value, when possible
     */
    public static int[][] multiplicationTable(int value) {
        int[][] result = new int[value][value];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                result[i][j] = (i + 1) * (j + 1);
            }
        }

        return result;
    }
}
