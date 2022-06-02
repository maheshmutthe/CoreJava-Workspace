package Lab;
import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter 4 digit number= ");
		  int number = sc.nextInt();

		  int sum = 0;
		  while (number != 0) {
		   sum = sum + number % 10;
		   number = number / 10;
		  }
		  System.out.println("sum is " + sum);

	}

}
