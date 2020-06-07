package davide;

public class S06 {
	/**
	 * 
	 * enum used in yahtzee function for specific combination of the game
	 *
	 */
	public enum Category {
		DICE_1, DICE_2, DICE_3, DICE_4, DICE_5, DICE_6, BONUS, SMALL_STRAIGHT, LARGE_STRAIGHT, TRIS, FOUR_DICE, FULL,
		YAHTZEE, CHANCE
	}

	/**
	 * 
	 * @param value
	 * @return true if value is prime number
	 */
	public static boolean isPrime(int value) {
		value = Math.abs(value);

		if (value < 2) {
			return false;
		} else if (value <= 3) {
			return true;
		} else if (value % 2 == 0) {
			return false;
		} else {
			for (int i = 3; i < value; i += 2) {
				if (value % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * 
	 * @param value
	 * @return return true if value is Armstrong number
	 */
	public static boolean isArmstrong(int value) {
		value = Math.abs(value);
		int len = String.valueOf(value).length();

		if (value < 10) {
			return true;
		} else {
			int sum = 0;
			int temp = value;

			while (temp > 0) {
				sum += Math.pow(temp % 10, len);
				temp /= 10;
			}

			if (value == sum) {
				return true;
			} else {
				return false;
			}
		}
	}

	/**
	 * 
	 * @param s (a short sentence)
	 * @return true if input string is using every letter of a given alphabet (italian) at
	 *         least once
	 * 
	 *         Input -> "Che tempi brevi zio, quando solfeggi" Output -> true
	 */
	public static boolean isPangram(String s) {
		int[] lettersIndex = new int[21];
		char[] input = s.toCharArray();

		for (int i = 0; i < input.length; i++) {
			int digit = Character.getNumericValue(input[i]);
			if (digit >= 10 && digit <= 18) {
				lettersIndex[digit - 10]++;
			} else if (digit >= 21 && digit <= 31) {
				lettersIndex[digit - 12]++;
			} else if (digit == 35) {
				lettersIndex[20]++;
			}
		}
		
		for (int i = 0; i < lettersIndex.length; i++) {
			if (lettersIndex[i] == 0) {
				return false;
			}
		}
		
		return true;
	}

	/**
	 * 
	 * @param s1
	 * @param s2 s1 and s2 must have same length
	 * @return the number of positions at which the corresponding symbols are
	 *         different. In other words, it measures the minimum number of
	 *         substitutions required to change one string into the other
	 * 
	 *         Input: s1 -> 100, s2 -> 001 Output: 2
	 */
	public static int hammingDistance(String s1, String s2) {
		if (s1.equals(s2)) {
			return 0;
		} else {
			//TODO
			return 1;
		}
	}

	/**
	 * 
	 * @param s
	 * @return string containing the acronym of s
	 * 
	 *         Input -> Model View Control Output -> MVC
	 */
	public static String acronym(String s) {
		return null;
	}

	/**
	 * 
	 * @param dice array containing dice's results
	 * @param cat  enum associated to a specific available combination in the game
	 * @return score based on the category
	 */
	public static int yahtzee(int[] dice, Category cat) {
		return 0;
	}
}
