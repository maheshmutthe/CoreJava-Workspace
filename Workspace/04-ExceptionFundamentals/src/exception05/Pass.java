package exception05;

public class Pass {
	public static void checkPass(String pass) throws InvalidPassException{
		boolean result = pass.matches("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
		if (!result) {
			InvalidPassException e = new InvalidPassException("Invalid Pass: "+pass);
			throw e;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pass = "Makrand1";
		try { 
			checkPass(pass);
			System.out.println("Valid Pass: "+pass);
		}catch (InvalidPassException e) {
			System.out.println(e.getMessage());
		}
		}

}
