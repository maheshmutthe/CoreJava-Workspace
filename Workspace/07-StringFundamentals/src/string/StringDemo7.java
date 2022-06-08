package string;

public class StringDemo7 {

	public boolean isValidFirstName2(String firstName) {
		boolean flag = true;
		for(int i=0; i<firstName.length(); i++) {
			char ch = firstName.charAt(i);
			// find ch is non-alphabet
		}
		return flag;
	}
	
	public static boolean isValidFirstName(String firstName) {
		String regex = "[A-Za-z]+";
		return firstName.matches(regex);
	}
	
	public static boolean isValidMobile(String mobile) {
		String regex = "[0-9]{10}";
		return mobile.matches(regex);
	}
	
	public static boolean isValidFullName(String fullName) {
		String regex = "[A-Za-z]+\\s[A-Za-z]+";
		return fullName.matches(regex);
	}
	public static void main(String[] args) {
		String firstName = "Makarand";
		String mobile = "9821225699";
		String fullName = "Makarand Bhoir";
		
		
		System.out.println("Is Valid First Name: "+(isValidFirstName(firstName) ? "Valid" : "Invalid"));
		System.out.println("Is Valid Mobile: "+(isValidMobile(mobile) ? "Valid" : "Invalid"));
		System.out.println("Is Valid Full Name: "+(isValidFullName(fullName) ? "Valid" : "Invalid"));
	}

}
