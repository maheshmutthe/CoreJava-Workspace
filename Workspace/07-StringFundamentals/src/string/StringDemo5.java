package string;

public class StringDemo5 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		StringBuffer str1 = new StringBuffer("MorningStar");
		for(int i=1; i<=1000000; i++) {
			str1 = str1.append("Hello");
		}
		System.out.println(str1.substring(0, 14).toString());
		
		long end = System.currentTimeMillis();
		System.out.println("Time taken: "+(end-start)/1000.0);
	}
}
