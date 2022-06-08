package com.morningstar;
//1. The method doOperation should accept 3 arguments
//2. First & last argument should be string
//3. Second argument should be operator
//4. doOperation("Morningstar", "+", "India") => then it should return MorningstarIndia
//5. doOperation("HelloWorld", "-", "World") => then it should return Hello
//6. doOperation("Morningstar", "-", "India") => then it should return Morningstar
//7. doOperation("Morningstar", "*", "India") => then it should throw IllegalArgumentException

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringManipulationTest {

StringManipulation target = null;
	
	@Before
	public void setup()
	{
		target = new StringManipulation();
	}
	
	@Test
	public void testDoOperationshouldReturnConcatinationOfTwoStrings() 
	{
		
		String result = target.doOperation("Morningstar", "+", "India");
		assertEquals( "MorningstarIndia",result);
	}
	
	@Test
	public void testDoOperationshouldMinusSecondStringFromFirstString() 
	{
		String result = target.doOperation("HelloWorld", "-", "World");
		assertEquals("Hello",result);
		assertEquals("Morningstar",target.doOperation("Morningstar", "-", "World"));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testDoOperationshouldThrowIllegalArgumentException() 
	{
		String result = target.doOperation("Morningstar", "*", "India");
	}

}