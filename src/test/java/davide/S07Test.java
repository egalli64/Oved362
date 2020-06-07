package davide;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Test;

class S07Test {

	@Test
	void testIsPerfect() {
		boolean actual = S07.isPerfect(28);

		assertThat(actual, is(true));
	}

	@Test
	void testIsNegativePerfect() {
		boolean actual = S07.isPerfect(-28);

		assertThat(actual, is(true));
	}

	@Test
	void testIsNotPerfect() {
		boolean actual = S07.isPerfect(42);

		assertThat(actual, is(false));
	}

	@Test
	void testIsAbundant() {
		boolean actual = S07.isAbundant(12);

		assertThat(actual, is(true));
	}
	
	@Test
	void testIsNegativeAbundant() {
		boolean actual = S07.isAbundant(-12);

		assertThat(actual, is(true));
	}
	
	@Test
	void testIsNotAbundant() {
		boolean actual = S07.isAbundant(17);

		assertThat(actual, is(false));
	}

	@Test
	void testIsDeficient() {
		boolean actual = S07.isDeficient(10);

		assertThat(actual, is(true));
	}
	
	@Test
	void testIsNegativeDeficient() {
		boolean actual = S07.isDeficient(-10);

		assertThat(actual, is(true));
	}
	
	@Test
	void testIsNotDeficient() {
		boolean actual = S07.isDeficient(40);

		assertThat(actual, is(false));
	}
}
