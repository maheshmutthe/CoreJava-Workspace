package oop02;

class A{
	public void print() {
		System.out.println("class A");
	}
	 void print2() {
		System.out.println("class A2");
	}
	 public Object print3() {
		System.out.println("class A3");
		return null; 
	}
}
class B extends A{
	public void print() {
		System.out.println("class B");
	}
	public void print2() {
		System.out.println("class B2");
	}
	public B print3() {
		System.out.println("class B3");
		return null;
	}
}
// public->protected-> default-> private


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj1 = new B();
		obj1.print();

	}

}
