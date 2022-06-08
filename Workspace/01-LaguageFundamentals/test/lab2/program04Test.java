package lab2;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.After;
//import org.junit.Before;
import org.junit.jupiter.api.Test;
import lab2.program04;

class program04Test {

//	program04 target = null;
//	@Before
//	public void setup() {
//		target = new program04();
//	}
//	
//	@After
//	public void teardown() {
//		target=null;
//	}
	
	
	@Test
	public void testIsPrimeShouldReturnNumberIsPrimeOrNot() {
		program04 target = new program04();
		
		boolean result = target.isPrime(107);
		assertEquals(true, result);
	}}
