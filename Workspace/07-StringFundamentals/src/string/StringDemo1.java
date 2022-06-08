package string;

public class StringDemo1 {
	public static void main(String[] args) {
		String str1 = new String("Capgemini");
		String str2 = "Capgemini";

		System.out.println("Lower case str1: " + str1.toLowerCase());
		System.out.println("Lower case str2: " + str2.toLowerCase());

		System.out.println("Upper case str1: " + str1.toUpperCase());
		System.out.println("Upper case str2: " + str2.toUpperCase());

		System.out.println("Lenght of str1: " + str1.length());
		System.out.println("Lenght of str2: " + str2.length());

		System.out.println("Chat At 0 index: " + str1.charAt(0));
		System.out.println("Index Of n char: " + str2.indexOf('n'));

		for (int i = 0; i < str1.length(); i++) {
			System.out.println("Char At " + i + " index is " + str1.charAt(i));
		}
	}
}

/*
 * toLowerCase toUpperCase lenth charAt indexOf substr
 */
