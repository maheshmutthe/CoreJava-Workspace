package lab;
import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String x = "Shakespeare";
		String s1 = x.toLowerCase();
		String y = "keshareapes";
		String s2 = y.toLowerCase();
		
				
		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean result = Arrays.equals(a, b);
		if( result == true)
		{
			System.out.println("Given String is Anagram");
		}
		else
		{
			System.out.println("Given String is not an Anagram");
		}
	}}
