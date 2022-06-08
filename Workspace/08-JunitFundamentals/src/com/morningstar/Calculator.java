package com.morningstar;

public class Calculator {
	public int addition(int number1, int number2) {
		return number1 + number2;
	}
	public int sumOfArguments(int ... number)// throws IllegalArgumentException
	{
		if( number.length <= 1)
			throw new IllegalArgumentException("Enter Number");
		int sum =0;
		for(int i : number)
		{
			sum += i;
		}
		return sum;
	}
	

}
