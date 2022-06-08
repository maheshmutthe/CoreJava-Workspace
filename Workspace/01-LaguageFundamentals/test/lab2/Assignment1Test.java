package lab2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Assignment1Test {

	@Test
	public void testSumOfDigitsInNumber() {
		
		Assignment1 c=new Assignment1();
		int result=c.sumCube(12);
		assertEquals(18, result);
	}

}
