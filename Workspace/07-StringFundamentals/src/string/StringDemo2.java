package string;

public class StringDemo2 {

	public static void main(String[] args) {
		String str1 = new String("Capgemini");
		String str2 = "Capgemini";
		String str3 = "Capgemini";
		
		if(str1 == str2) {		//compare string and reference both
			System.out.println("Both are same");
		}else {
			System.out.println("Both are different");
		}

		if(str2 == str3) {
			System.out.println("Both are same");
		}else {
			System.out.println("Both are different");
		}
		
		System.out.println("-----------------------------------------------------");
		
		if(str1.equals(str2)) {		//compare string only
			System.out.println("Both are same");
		}else {
			System.out.println("Both are different");
		}

		if(str2.equals(str3)) {
			System.out.println("Both are same");
		}else {
			System.out.println("Both are different");
		}
		
	}

}
