package lab1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Lab.HelloWorld;

class HelloWorldTest {

	@Test
	void testHelloWorld() {
		HelloWorld target = new HelloWorld();
		String result = target.hello();
		assertEquals("\"Hello World!\"", result);
		
	}

}
	