package com.morningstar;

import static org.junit.Assert.*;

import org.junit.Test;

public class Assignment1Test {

	@Test
	public void testSumOfDigitsInNumber() {
		
		Assignment1 c=new Assignment1();
		int result=c.sumCube(12);
		assertEquals(18, result);
	}

}
