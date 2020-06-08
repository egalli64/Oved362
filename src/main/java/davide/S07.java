package davide;

public class S07 {
	/**
	 * 
	 * @param value
	 * @return true if value is a perfect number. A perfect number is a positive
	 *         integer that is equal to the sum of its positive divisors, excluding
	 *         the number itself. Example: 6 = 1 + 2 + 3 28 = 1 + 2 + 4 + 7 + 14
	 */
	public static boolean isPerfect(int value) {
		value = Math.abs(value);
		int sumDivisors = 0;
		for (int i = 1; i < value; i++) {
			if (value % i == 0) {
				sumDivisors += i;
			}
		}

		return value == sumDivisors;
	}

	/**
	 * 
	 * @param value
	 * @return true if value is an abundant number. An abundant number or excessive
	 *         number is a number for which the sum of its proper divisors is
	 *         greater than the number itself.
	 */
	public static boolean isAbundant(int value) {
		value = Math.abs(value);
		int sumDivisors = 0;
		for (int i = 1; i < value; i++) {
			if (value % i == 0) {
				sumDivisors += i;
			}
		}
		return sumDivisors > value;
	}

	/**
	 * 
	 * @param value
	 * @return true if value is a deficient number. A deficient number or defective
	 *         number is a number for which the sum of its proper divisors is less
	 *         than the number itself.
	 */
	public static boolean isDeficient(int value) {
		value = Math.abs(value);
		int sumDivisors = 0;
		for (int i = 1; i < value; i++) {
			if (value % i == 0) {
				sumDivisors += i;
			}
		}
		return sumDivisors < value;
	}
}
