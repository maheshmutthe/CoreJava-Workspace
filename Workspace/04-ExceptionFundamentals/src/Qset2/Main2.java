package Qset2;

class Main extends Exception {
}

public class Main2 {
static public void meth1() throws Main{
System.out.println("meth1 Called");
throw new Main();
}

	public static void main(String args[]) { 
		try {
			Main2.meth1();
		} catch (Main t) {
			System.out.println("Got the Test Exception");
		} finally {
			System.out.println("Inside finally block ");
		}
	}
}

//
//class Test extends Exception { }
//class Main {
//static public void meth1(){
//System.out.println(“meth1 Called”);
//throw new Test();
//}
//public static void main(String args[]) {
//try {
//Main.meth1();
//}
//catch(Test t) {
//System.out.println("Got the Test Exception");
//}
//finally {
//System.out.println("Inside finally block ");
//}
//}
//}