package Lab;


/*
 The Fibonacci sequence is defined by the following rule.
 The first 2 values in the sequence are 1,
 1. Every subsequent value is the sum of the 2 values preceding it.
 Write a Java program that uses both recursive and non-recursive functions to print the nth value of the Fibonacci 
sequence?
 */

public class Assignment3 {
	int a=0,b=1;
	int c =0;
	public boolean fibona(int n)
	{
		if( n == 1 ) 
		{
			return true;
		}
			c = a + b;
			System.out.println("Fibonacci series is " + c);
			a=b;
			b=c;
			return fibona(n-1);	
	}
	
//	public static void main(String[] args) {
//		int a=0,b=1;
//		System.out.println(a + " " + b);
//		Que3 q = new Que3();
//		q.fibona(5);
//	}
}