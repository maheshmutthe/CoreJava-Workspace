package oop01;

public class Test {
	public double area(int radius) {
		final double PI = 3.14;
		return PI * radius * radius;
	}
	int area(int l, int b) {
		return l * b;
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		System.out.println("Area of Circle: "+test.area(5));
		System.out.println("Area of Rectangle: "+test.area(10, 8));
	}
}
