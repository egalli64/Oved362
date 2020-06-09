package _exercises.giacomo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class S08Test {

	@Test
	void BinaryPlainSum() {
		String sum = giacomo.S08.binarySum("101", "010");
		assertThat(sum, is("111"));
	}

	@Test
	void BinaryMoreDigits() {
		String sum = giacomo.S08.binarySum("111", "010");
		assertThat(sum, is("1001"));
	}

	@Test
	void BinaryFiveDigits() {
		String sum = giacomo.S08.binarySum("11011", "10010");
		assertThat(sum, is("101101"));
	}

	@Test
	void BinaryAllOneFiveDigits() {
		String sum = giacomo.S08.binarySum("11111", "11111");
		assertThat(sum, is("111110"));
	}

	/*
	 * @Test void BinaryDifferentDigits() {
	 * assertThrows(IllegalArgumentException.class,()->{ S08.binarySum("1110",
	 * "010"); }); }
	 */

	@Test
	void BinaryAllOneDigits() {
		String sum = giacomo.S08.binarySum("111", "111");
		assertThat(sum, is("1110"));
	}

	@Test
	void BinaryMOneDigits() {
		String sum = giacomo.S08.binarySum("1111", "111");
		assertThat(sum, is("11110"));
	}

	@Test
	void PlainSingle() {
		int sing = giacomo.S08.getSingle(new int[] { 1, 2, 1, 2, 3, 4, 5, 4, 5 });
		assertThat(sing, is(3));
	}

	@Test
	void PlainNotSingle() {
		assertThrows(UnsupportedOperationException.class, () -> {
			giacomo.S08.getSingle(new int[] { 1, 2, 1, 2, 2, 4, 5, 4, 5 });
		});
	}

	@Test
	void PlainUnique() {
		boolean uni = giacomo.S08.hasOnlyUnique("abe");
		assertThat(uni, is(true));
	}

	@Test
	void PlainNotUnique() {
		boolean uni = giacomo.S08.hasOnlyUnique("aba");
		assertThat(uni, is(false));
	}

	@Test
	void PlainAnagram() {
		boolean ana = giacomo.S08.isAnagram("abba", "baab");
		assertThat(ana, is(true));
	}

	@Test
	void PlainNotAnagram() {
		boolean ana = giacomo.S08.isAnagram("abba", "bab");
		assertThat(ana, is(false));
	}

	@Test
	void NotAnagram() {
		boolean ana = giacomo.S08.isAnagram("abba", "sbba");
		assertThat(ana, is(false));
	}

	@Test
	void PlainDuplicates() {
		int[] dup = giacomo.S08.duplicates(new int[] { 1, 2, 1, 2, 3, 4, 5, 4, 5 });
		assertArrayEquals(new int[] { 1, 2, 4, 5 }, dup);
	}

	@Test
	void PlainNotDuplicates() {
		assertThrows(UnsupportedOperationException.class, () -> {
			giacomo.S08.getSingle(new int[] { 1, 2, 1, 2, 2, 4, 5, 4, 5 });
		});
	}

}
