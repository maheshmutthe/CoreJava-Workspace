package string;

public class StringDemo4 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		String str1 = new String("MorningStar");
		for(int i=1; i<=1000000; i++) {	//Appends Multiple Hello
			str1 = str1 + "Hello";
		}
		System.out.println(str1.substring(0, 14));
		
		long end = System.currentTimeMillis();
		System.out.println("Time taken: "+(end-start)/1000.0);
	}
}
