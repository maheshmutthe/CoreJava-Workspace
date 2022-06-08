package com.morningstar;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FirstJunitTest {
	@Before
	public void setup() {
		System.out.println("before every test cases");
	}

	@After
	public void teardown() {
		System.out.println("After every test cases");
	}
	@Test
	public void test() {
		System.out.println("Test case 1");
	//	fail("Not yet implemented");
	}
	@Test
	public void test2() {
	//	fail("Not yet implemented");

		System.out.println("Test case 2");

	}
	@Test
	public void test3() {
		//System.out.println("Test case3 got pass");

	//	fail("Not yet implemented");
		System.out.println("Test case 3");

	}
	

}
