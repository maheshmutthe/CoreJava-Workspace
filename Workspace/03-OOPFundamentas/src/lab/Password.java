package lab;

import java.util.Scanner;

public class Password {
	public static void main(String[] args) {
		
	

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter ur password 2 time :");
	String pass = sc.next();
	String confirmpass = sc.next();
	
	boolean check = pass.equals(confirmpass);
		
		if(check)
			System.out.println("Authantication pass");
		else
			System.out.println("Authantication fail");
	}
}
