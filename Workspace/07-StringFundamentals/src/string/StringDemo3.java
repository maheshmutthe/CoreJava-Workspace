package string;

public class StringDemo3 {
	public static void main(String[] args) {
		String str1 = new String("Capgemini");
		
		System.out.println(str1);
		str1 = str1 + " Mumbai";	// Appended a string
		str1 = str1.substring(0, 8);
		System.out.println(str1);	// prints from 0-C to n
		
	}
}
