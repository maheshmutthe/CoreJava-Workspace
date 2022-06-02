package exception05;

public class Email {

		public static void checkPass(String email) throws InvalidEmailException{
			boolean result = email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
			if (!result) {
				InvalidEmailException e = new InvalidEmailException("Invalid Email: "+email);
				throw e;
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String email = "mahesh1@gmail.com";
			try { 
				checkPass(email);
				System.out.println("Valid Email: "+email);
			}catch (InvalidEmailException e) {
				System.out.println(e.getMessage());
			}
			}

	}

