package m2ex;

import java.lang.Math;

public class S04 {
	/**
	 * Add up all the numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the numbers, or zero
	 */

	public static void main(String[] args) {
		System.out.println(sqrt(81));
		System.out.println(fibonacci(11));
		

	}

	public static long sum(int first, int last) {
		if (last < first)
			return 0;
		long sum = 0;
		for (int i = first; i <= last; i++) {
			sum = sum + i;
		}
		return Math.abs(sum);
	}

	/**
	 * Add up only the even numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the even numbers, or zero
	 */
	public static long evenSum(int first, int last) {
		if (last < first)
			return 0;
		long sum = 0;
		for (int i = first; i <= last; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	/**
	 * Square root using Newton method Epsilon should be set to 0.001
	 * 
	 * @param value
	 * @return calculated square root
	 */
	public static double sqrt(double value) {
		value = Math.abs(value);
		if (value == 0)
			return 0;
		double oldroot = value;
		double newroot = (oldroot / 2 + value / (oldroot * 2));

		while (((oldroot - newroot) > 0.001)) {

			oldroot = newroot;
			newroot = 0.5 * (oldroot + value / oldroot);

		}

		return newroot;
	}

	/**
	 * Square root using Newton method
	 * 
	 * @param value
	 * @param epsilon stop iterating when gain is less than this value
	 * @return calculated square root
	 */
	public static double sqrt(double value, double epsilon) {
		value = Math.abs(value);
		if (value == 0)
			return 0;
		double oldroot = value;
		double newroot = 0.5 * (oldroot + value / oldroot);

		while (((oldroot - newroot) > epsilon)) {

			oldroot = newroot;
			newroot = 0.5 * (oldroot + value / oldroot);

		}

		return newroot;
	}

	/**
	 * Factorial
	 * 
	 * @param value
	 * @return factorial of input value, or zero
	 */
	public static long factorial(int value) {
		if (value < 0)
			return 0;
		int sum = 1;
		for (int i = value; i > 0; i--) {
			sum = sum * i;
		}
		return sum;
	}

	/**
	 * Fibonacci number (0, 1, 1, 2, 3, 5, 8, �)
	 * 
	 * @param value
	 * @return the Fibonacci number of value, or zero
	 */
	public static long fibonacci(int value) {
		if(value == 0) {
			return 0;
		}
		if(value == 1 || value ==2) {
			return 1;
		}
		
		long f0=1;
		long f1=1;
		long sum=0;
		for (int i=2; i<value; i++) {
			sum = f0 + f1;
			f0=f1;
			f1=sum;
		}
		return sum;
	}

	/**
	 * Multiplication table
	 * 
	 * @param value
	 * @return The multiplication table for value, when possible
	 */
	public static int[][] multiplicationTable(int value) {
		int[][] result = new int[value][value];
		for (int i = 0; i<value; i++) {
			for (int j=0; j<value; j++) {
				result[i][j]=(i+1)*(j+1);
			}
		}
		
		return result;
	}
}
