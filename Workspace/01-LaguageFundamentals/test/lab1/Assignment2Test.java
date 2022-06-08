package lab1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Lab.Assignment2;

class Assignment2Test {

	@Test
	void testPositiveNegativeNumber() {
		Assignment2 target = new Assignment2();
		String result = target.checkPN(23);
		assertEquals("Positive Number", result);
		
	}

}
