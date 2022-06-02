package exception;

public class Test {
	
	public static void meth() //throws NullPointerException
	{
		System.out.println("Start of method");
		boolean flag = true;
		if(flag)
			throw new NullPointerException();
	}
	
	public static void main(String[] args) {
		try {
			Test.meth();
		}catch(NullPointerException e) {
			System.out.println("Null POinter");
		}
		System.out.println("End of program.");
	}
}
