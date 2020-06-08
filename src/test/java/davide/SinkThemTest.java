package davide;

import static org.hamcrest.Matchers.is;


import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SinkThemTest {
	
	private SinkThem table;
	
	 @BeforeEach
	    void init() {
		 table = new SinkThem(4);
		 table.place(0,0);
		 table.place(1,1);
		 table.place(1,0);
	    }
	
	@Test
	void testIsPossiblePlace00() {
		boolean isPossible = table.place(0,0);
		assertThat(isPossible, is(false));	
	}
	
	@Test
	void testIsPossiblePlace01() {
		boolean isPossible = table.place(0,1);
		assertThat(isPossible, is(true));	
	}
	
	@Test
	void testIsPossiblePlace11() {
		boolean isPossible = table.place(1,1);
		assertThat(isPossible, is(false));
	}
	
	@Test
	void testShootIn00() {
		table.shoot(0,0);
		int points = this.table.getPoints();
		assertThat(points, is(5));
	}
	
	@Test
	void testShootIn11() {
		table.shoot(1,1);
		int points = this.table.getPoints();
		assertThat(points, is(5));
	}
	

	@Test
	void testTripleShoot() {
		table.shoot(0,0);
		table.shoot(1,1);
		table.shoot(1, 0);
		int points = this.table.getPoints();
		assertThat(points, is(15));
	}
	
	@Test
	void test3Point() {
		table.shoot(0,0);
		table.shoot(1,3);
		table.shoot(1,2);
		int points = this.table.getPoints();
		assertThat(points, is(3));
	}

}
