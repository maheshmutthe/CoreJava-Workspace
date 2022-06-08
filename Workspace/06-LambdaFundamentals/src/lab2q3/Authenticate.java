package lab2q3;

public class Authenticate {

	public static void main(String[] args) {
		I1 ref = (uName, pass) -> {
			if("Sameer".equals(uName) && "sam@07".equals(pass))
				System.out.println("Correct credentials: ");
			else
				System.out.println("wrong credentials: ");
		};
		ref.authenticate("Sameer", "sam@07");

	}

}
