package lab1;


import static org.junit.Assert.*;

import org.junit.Test;

import Lab.Assignment7;

public class Assignment7Test {

	@Test
	public void test() {
		Assignment7 target = new Assignment7();
		int result = target.getSum(1234);
		assertEquals(10, result);
	}
}