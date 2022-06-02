package oop06gc;

public class Test {
	public static void main(String[] args) {
		Test t = new Test();
// making t eligible for garbage collection
//		Test t2 = t; //now it will not call finalize it still hold the ref now
		t = null;
// calling garbage collector
		System.gc();
		System.out.println("end main");
	}

	@Override
	protected void finalize() {
		System.out.println("finalize method called");
	}
}
