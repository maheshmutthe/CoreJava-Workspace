package lab2;
import java.util.Scanner;

public class program02 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a choice");
		String s=sc.nextLine();
		switch(s)
		{
			case "Red":
				System.out.println("Stop");
				break;
			case "red":
				System.out.println("Stop");
				break;
				
			case "Yellow" :
				System.out.println("Ready");
				break;
			case "yellow" :
				System.out.println("Ready");
				break;
		    
			case "Green":
				System.out.println("Go");
				break;
			case "green":
				System.out.println("Go");
				break;
				
			default:
				System.out.println("You have entered a wrong choice");
		}

	}

}
