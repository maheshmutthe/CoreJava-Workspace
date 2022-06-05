package lambda01;

@FunctionalInterface
interface I1{
	void meth1();
	default void meth2() {
		System.out.println("Default Method...");
	}
	default void meth4() {
		System.out.println("Default Method2...");
	}
	static void meth3() {
		System.out.println("Static Method...");
	}static void meth5() {
		System.out.println("Static Method2...");
	}
}

class C1 implements I1 {
	@Override
	public void meth1() {
		System.out.println("meth1 from class C1");
	}
}

public class Test {

	public static void main(String[] args) {
		I1 obj = new C1();
		obj.meth1();
		
		I1 obj2 = new I1() {
			@Override
			public void meth1() {
			System.out.println("Meth1 from anonymous inner class");	
			}
		};
		obj2.meth1();
		

	}

}
