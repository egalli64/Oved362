package m2ex;

public class S04 {
	/**
	 * Add up all the numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the numbers, or zero
	 */
	public static long sum(int first, int last) {
		long res = 0;
		
		if (last < first)
			return res;
		
		for (int i = first; i <= last; i++) {
			res += i;
		}
		
		return Math.abs(res);
	}

	/**
	 * Add up only the even numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the even numbers, or zero
	 */
	public static long evenSum(int first, int last) {
		long res = 0;
		
		if (last < first)
			return res;
		
		for(int i = first; i <= last; i++) {
			if(i % 2 == 0)
				res += i;
		}
		return res;
	}

	/**
	 * Square root using Newton method
	 * Epsilon should be set to 0.001
	 *  
	 * @param value
	 * @return calculated square root
	 */
	public static double sqrt(double value) {
		if(value == 0)
			return 0;
		
		double x = value / 2;
		double res = 1/2 * (x + value/x);
		
		while(Math.abs(res - x) < 0.001) {
			x = res;
			res = 1/2 * (x + value / x);
		}
		
		return res;
		

//	    value = Math.abs(value);
//		if (value == 0)
//			return 0;
//		double oldroot = value;
//		double newroot = (oldroot / 2 + value / (oldroot * 2));
//
//		while (((oldroot - newroot) > 0.001)) {
//
//			oldroot = newroot;
//			newroot = 0.5 * (oldroot + value / oldroot);
//
//		}
//
//		return newroot;
	}

	/**
     * Square root using Newton method
     * 
	 * @param value
	 * @param epsilon stop iterating when gain is less than this value
	 * @return calculated square root
	 */
    public static double sqrt(double value, double epsilon) {
    	if(value == 0)
			return 0;
		
		double x = value / 2;
		double res = 1/2 * (x + value/x);
		
		while(Math.abs(res - x) < epsilon) {
			x = res;
			res = 1/2 * (x + value / x);
		}
		
		return res;
		
//    	value = Math.abs(value);
//		if (value == 0)
//			return 0;
//		double oldroot = value;
//		double newroot = 0.5 * (oldroot + value / oldroot);
//
//		while (((oldroot - newroot) > epsilon)) {
//
//			oldroot = newroot;
//			newroot = 0.5 * (oldroot + value / oldroot);
//
//		}
//
//		return newroot;
    	
    }
	
	/**
	 * Factorial
	 * 
	 * @param value
	 * @return factorial of input value, or zero
	 */
	public static long factorial(int value) {
		long res = 1;
		if(value == 0) //0! = 1
			return res;
		else if(value < 0) //-n! = 0
			res = 0;
		
		for(int i = value; i > 0; i--) { //n(n-1)(n-2)...1
			res *= i;
		}
		return res;
	}

	/**
	 * Fibonacci number (0, 1, 1, 2, 3, 5, 8, �)
	 * 
	 * @param value
	 * @return the Fibonacci number of value, or zero
	 */
	public static long fibonacci(int value) { //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233,377
		long res = 0;
		
		if(value <= 0) {
			res = 0;
		}else if(value == 1 || value == 2) {
			res = 1;
		}else {
			long f0 = 0;
			long f1 = 1;
			
			for(int i = 2; i <= value; i++) {
				res = f0 + f1; 
				f0 = f1; 
				f1 = res; 
			}
		}

		return res;
	}

	/**
	 * Multiplication table
	 * 
	 * @param value
	 * @return The multiplication table for value, when possible
	 */
	public static int[][] multiplicationTable(int value) {
		int[][] result = new int[value][value];
		
		for(int i = 0; i < value; i++) {
			for(int j = 0; j < value; j++) {
				result[i][j] = (i+1) * (j+1);
			}
		}
		
		return result;
	}
}
