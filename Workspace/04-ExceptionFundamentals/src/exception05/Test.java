package exception05;

//password, email, fullname, mobile, pancard 

public class Test {
	public static void checkName(String name) throws InvalidNameException{
		boolean result = name.matches("[A-Z][a-z]+");
		if (!result) {
			InvalidNameException e = new InvalidNameException("Invalid Name: "+name);
			throw e;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Makrand1#";
		try { 
			checkName(name);
			System.out.println("Valid Name: "+name);
		}catch (InvalidNameException e) {
			System.out.println(e.getMessage());
		}
		}

	

}
