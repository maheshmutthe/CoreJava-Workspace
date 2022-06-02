package exception03;
public class Test6 {
	public static int meth1(){
		int result = 0;
		try {
			result = 1;
			System.out.println("return value");
			return result;
		}
		finally {
			System.out.println("In finally");
		}
	}
	public static void main(String[] args) {
		int result = Test6.meth1();
		System.out.println(result);
	}
}
