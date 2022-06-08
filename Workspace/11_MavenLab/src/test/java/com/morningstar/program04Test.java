package com.morningstar;

//import org.junit.After;
//import org.junit.Before;
import static org.junit.Assert.*;

import org.junit.Test;
//import lab2.program04;

class program04Test {

	
	
	@Test
	public void testIsPrimeShouldReturnNumberIsPrimeOrNot() {
		program04 target = new program04();
		
		boolean result = target.isPrime(107);
		assertEquals(true, result);
	}
	}
