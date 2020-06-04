package biao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class S08Test {
	
	@Test
	void checkIsPerfect() {
		boolean actual =  S08.hasOnlyUnique("hefdaslo");
		assertTrue(actual);
	}

}
