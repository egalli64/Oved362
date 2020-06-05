package davide;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class S06Test {

	@Test
	void testIsPrimeZero() {
		boolean actual = S06.isPrime(0);
		
		assertThat(actual, is(false));
	}
	
	@Test
	void testIsPrimeOne() {
		boolean actual = S06.isPrime(1);
		
		assertThat(actual, is(false));
	}
	
	@Test
	void testIsPrimeTwo() {
		boolean actual = S06.isPrime(2);
		
		assertThat(actual, is(true));
	}
	
	@Test
	void testIsPrimeThree() {
		boolean actual = S06.isPrime(3);
		
		assertThat(actual, is(true));
	}
	
	@Test
	void testIsPrime() {
		boolean actual = S06.isPrime(89);
		
		assertThat(actual, is(true));
	}
	
	@Test
	void testIsPrimeNegative() {
		boolean actual = S06.isPrime(-89);
		
		assertThat(actual, is(true));
	}

	@Test
	void testIsArmstrongSimple() {
		boolean actual = S06.isArmstrong(5);
		
		assertThat(actual, is(true));
	}
	
	@Test
	void testIsArmstrongNegative() {
		boolean actual = S06.isArmstrong(-7);
		
		assertThat(actual, is(true));
	}
	
	@Test
	void testIsArmstrong() {
		boolean actual = S06.isArmstrong(153);
		
		assertThat(actual, is(true));
	}
	
	@Test
	void testIsArmstrongFalse() {
		boolean actual = S06.isArmstrong(65);
		
		assertThat(actual, is(false));
	}

	@Test
	void testIsPangram() {
		boolean actual = S06.isPangram("Che tempi brevi zio, quando solfeggi");
		
		assertThat(actual, is(true));
	}
	
	@Test
	void testIsPangram2() {
		boolean actual = S06.isPangram("Ciao mi chiamo Davide.");
		
		assertThat(actual, is(false));
	}

	@Test
	void testHammingDistance() {
		fail("Not implemented yet");
	}

	@Test
	void testAcronym() {
		fail("Not implemented yet");
	}

	@Test
	void testYahtzee() {
		fail("Not implemented yet");
	}
}
