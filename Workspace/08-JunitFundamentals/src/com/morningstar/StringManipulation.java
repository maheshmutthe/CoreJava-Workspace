package com.morningstar;

public class StringManipulation {

	//1. The method doOperation should accept 3 arguments
		//2. First & last argument should be string
		//3. Second argument should be operator
		//4. doOperation("Morningstar", "+", "India") => then it should return MorningstarIndia
		//5. doOperation("HelloWorld", "-", "World") => then it should return Hello
		//6. doOperation("Morningstar", "-", "India") => then it should return Morningstar
		//7. doOperation("Morningstar", "*", "India") => then it should throw IllegalArgumentException

	public String doOperation(String str1, String operator, String str2)
	{
		String result = null;
		switch(operator)
		{
		case "+": 
			result = str1 + str2; 
			break;
		case "-":
			result = str1.replaceAll(str2,"");
			break;
		default :
			throw new IllegalArgumentException("+ and - operator are allowed only");
		}
		return result;
		
	}	
}