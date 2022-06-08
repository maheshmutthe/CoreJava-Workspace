package com.morningstar;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	Calculator target = null;
	
	@Before
	public void Calculator() {
		target = new Calculator();
	}


	@Test
	public void testAdditionShouldReturnSumOfTwoTest() {
		Calculator target = new Calculator();
		int result = target.addition(1000, 2000);
		assertEquals(3000, result);
		assertEquals(1200, target.addition(1000, 200));	
	}	
	@Test
	public void testAdditionShouldReturnSumOfArguments() {
		Calculator target = new Calculator();
		int result = target.sumOfArguments(10, 20, 30, 40);
		assertEquals(100, result);
		assertEquals(15, target.sumOfArguments(1,2,3,4,5));
		assertEquals(3, target.sumOfArguments(1,2));
	}
	@Test(expected=IllegalArgumentException.class)
	public void testSumShouldThrowIllegalArgumentException() {
		Calculator target = new Calculator();
		target.sumOfArguments(10);
	}	
	

}
