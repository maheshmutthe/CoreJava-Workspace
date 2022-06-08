package lab2q2;

public class WordSpace {
	static String str=" ";
	public static void main(String[] args) {
		 
		I1 ref = s1 -> {
			char[] abc =s1.toCharArray();
			for(int i = 0 ; i<s1.length(); i++) {
				 str += abc[i]+" ";
			}
			 return str;
		};
		System.out.println(ref.word("GulabJamun")); 

	}

}

