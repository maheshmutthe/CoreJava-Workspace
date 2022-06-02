package oop05;

interface I1{
	void fun();
}  
class C1 implements I1{
	@Override
	public void fun() {
		System.out.println("C1: fun");
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		I1 ref = new C1();
		ref.fun();

	}

}
