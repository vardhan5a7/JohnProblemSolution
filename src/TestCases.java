import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCases {

	@Test
	void test() {
		CodingAssignment ca = new CodingAssignment();	
		
		assertEquals(1, ca.noOfPossibleWays(0));
		assertEquals(1, ca.noOfPossibleWays(1));
		assertEquals(2, ca.noOfPossibleWays(2));
		assertEquals(4, ca.noOfPossibleWays(3));
		assertEquals(44, ca.noOfPossibleWays(7));
		assertEquals(5768, ca.noOfPossibleWays(15));		
	}
}
