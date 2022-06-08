package lab1;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import Lab.Assignment5;


class Assignment5Test {

	

	@Test
	void testFactorialNumber() {
		Assignment5 target= new Assignment5();
		
		int result = target.factorial(4);
		assertEquals(24, result);
	}

}
