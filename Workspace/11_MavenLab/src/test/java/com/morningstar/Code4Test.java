package com.morningstar;

import static org.junit.Assert.*;

import org.junit.Test;

public class Code4Test {

	@Test
	public void testMonth() {
		Code4 obj=new Code4();
		
		String result=obj.month(2);
		
		assertEquals("March",result);
	
	}

}
