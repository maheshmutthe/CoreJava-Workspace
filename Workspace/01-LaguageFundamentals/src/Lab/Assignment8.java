package Lab;
import java.util.Scanner;
public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter a number= ");
		  int number = sc.nextInt();
		  
		  if (number == 1 || number == 0) {
			  System.out.println("This is not a a prime or composite number");
		  }
		  else {
			    boolean flag = false;
			    for (int i = 2; i <= number / 2; ++i) {
			      // condition for non prime number
			      if (number % i == 0) {
			        flag = true;
			        break;
			      }
			    }

			    if (!flag)
			      System.out.println(number + " is a prime number.");
			    else
			      System.out.println(number + " is not a prime number.");
			  }
			}
		  

	}


