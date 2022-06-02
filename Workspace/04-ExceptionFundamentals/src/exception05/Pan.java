package exception05;

public class Pan {

	public static void checkPass(String pan) throws InvalidEmailException{
		boolean result = pan.matches("^[A-Z]{5}[0-9]{4}[A-Z]{1}");
		if (!result) {
			InvalidEmailException e = new InvalidEmailException("Invalid Pan: "+pan);
			throw e;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pan = "FOXPM0387A";
		try { 
			checkPass(pan);
			System.out.println("Valid Pan: "+pan);
		}catch (InvalidEmailException e) {
			System.out.println(e.getMessage());
		}
		}

}


