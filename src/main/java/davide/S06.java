package davide;

public class S06 {
	/**
	 * 
	 * enum used in yahtzee funcion for specific combination of the game
	 *
	 */
	public enum Category {
		DICE_1, DICE_2, DICE_3, DICE_4, DICE_5, DICE_6, BONUS, 
		SMALL_STRAIGHT, LARGE_STRAIGHT, TRIS, FOUR_DICE, FULL, 
		YAHTZEE, CHANCE
	}
	
	
	/**
	 * 
	 * @param value
	 * @return true if value is prime number
	 */
	public static boolean isPrime (int value) {
		return false;
	}
	
	/**
	 * 
	 * @param value
	 * @return return true if value is Armstrong number
	 */
	public static boolean isArmstrong (int value) {
		return false;
	}
	
	/**
	 * 
	 * @param s (a short sentence)
	 * @return true if input string is using every letter of a given alphabet at least once
	 * 
	 * Input -> "Che tempi brevi zio, quando solfeggi" Output -> true
	 */
	public static boolean isPangram (String s) {
		return false;
	}
	
	/**
	 * 
	 * @param s1
	 * @param s2
	 * s1 and s2 must have same lenght
	 * @return the number of positions at which the corresponding symbols are different. 
	 * In other words, it measures the minimum number of substitutions required to change 
	 * one string into the other
	 * 
	 * Input: s1 -> 100, s2 -> 001 Output -> 2
	 */
	public static int hammingDistance (String s1, String s2) {
		return 0;
	}
	
	/**
	 * 
	 * @param s
	 * @return string containing the acronym of s
	 * 
	 * Input -> Model View Control Output -> MVC
	 */
	public static String acronym (String s) {
		return null;
	}
	
	/**
	 * 
	 * @param dice array containing dice's results
	 * @param cat enum associated to a specific available combination in the game
	 * @return 
	 */
	public static int yahtzee (int[] dice, Category cat) {
		return 0;
	}
}
