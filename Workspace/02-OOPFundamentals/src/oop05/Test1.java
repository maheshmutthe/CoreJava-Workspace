package oop05;

class A{
	public A() {
		System.out.println("A()");
	}
	public A(int a) {
		this();
		System.out.println("A (int(a))");
		
	}
}
class B extends A {
	public B(){
		super(100);
		System.out.println("B()");
	}
	public B(int a) {
		super(a);
		System.out.println("B (int(b))");
		
	}
}


public class Test1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	A obj1 = new A();
	//	B obj2 = new B();
		B obj3 = new B(100);		

	}

}
