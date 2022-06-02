package exception05;


public class Mobile {
	public static void checkPass(String mobile) throws InvalidNumberException{
		boolean result = mobile.matches("[7-9][0-9]{9}");
		if (!result) {
			InvalidNumberException e = new InvalidNumberException("Invalid Mobile: "+mobile);
			throw e;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mobile = "9988776655";
		try { 
			checkPass(mobile);
			System.out.println("Valid Mobile: "+mobile);
		}catch (InvalidNumberException e) {
			System.out.println(e.getMessage());
		}
		}

}

