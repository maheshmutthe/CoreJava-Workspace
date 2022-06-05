package Lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Que7 {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Map<String,String> map=new LinkedHashMap<>();
		map.put("siddheshwar", "9975242845");
		map.put("Mahesh", "878585858596");
		map.put("Aman", "784585785452");
		
	System.out.println("Enter the name");
	String name=sc.next();
	System.out.println(map.get(name));
	}
}