package lab;

import java.util.Arrays;

@FunctionalInterface
interface AddSpace
{
	public String addSpace(String str);
}
public class Q2 {

	public static void main(String[] args) {
		
		AddSpace s1 = (s)->{
			
			String str ="";
			for(int i=0;i<s.length();i++)
			{
				
				str = str+s.charAt(i)+" ";
			}
			return str;
		};
		
		
		AddSpace s2 = (s)->{
			String[] chararr = s.split("");
			StringBuffer str= new StringBuffer("");
			for(int i=0;i<chararr.length;i++)
			{
				str.append(chararr[i]+" ");
			}
			return new String(str);
		};
		
		System.out.println(s1.addSpace("TEST"));
		System.out.println(s2.addSpace("TEST"));
		
	}
}