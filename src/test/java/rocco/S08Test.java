package rocco;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S08Test {

	@Test
	void binarySum() {
		String left = "10";
		String right = "11";
		String result = "101";
		assertThat(S08.binarySum(left, right), is(result));
	}
	
	@Test
	void binarySumWithDifferenceLength() {
		String left = "1010";
		String right = "1010000";
		Assertions.assertThrows(UnsupportedOperationException.class, () -> {
			S08.binarySum(left, right);
		});
	}
	
	@Test
	void mergeSorted() {
		int[] left = new int[] {1,2,4,6,7,8,9};
		int[] right = new int[] {3,4,4,6,10};
		int[] expected = new int[] {1,2,3,4,4,4,6,6,7,8,9,10};
		int[] actual = S08.mergeSorted(left, right);
		assertThat(actual, is(expected));
	}
	
	@Test
	void findSingleInSortedArray() {
		int[] values = new int[] {1,1,2,2,3,3,4,5,5,6,6};
		int actual = S08.getSingle(values);
		assertThat(actual, is(4));
	}
	
	@Test
	void tryFindSingle() {
		int[] values = new int[] {1,1,2,2,3,3,4,4,5,5,6,6};
		int actual = S08.getSingle(values);
		assertThat(actual, is(-1));
	}
	
	@Test
	void isNotOnlyUnique() {
		boolean actual = S08.hasOnlyUnique("Hello");
		assertThat(actual, is(false));
	}
	
	@Test
	void isOnlyUnique() {
		boolean actual = S08.hasOnlyUnique("Helo");
		assertThat(actual, is(true));
	}
	
	@Test
	void isAnagram() {
		boolean actual = S08.isAnagram("ciao", "Caio");
		assertThat(actual, is(true));
	}
	
	@Test
	void isNotAnagram() {
		boolean actual = S08.isAnagram("ciao", "puff");
		assertThat(actual, is(false));
	}
	@Test
	void isNotPossibleAnagram() {
		Assertions.assertThrows(UnsupportedOperationException.class, () -> {
			S08.isAnagram("ciao", "sjkfvnbsilvnsl");
		});
	}
}