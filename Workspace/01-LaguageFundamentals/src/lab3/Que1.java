package lab3;
import java.util.*;

public class Que1 {

	 static int computesum(int n)
	 {
			int sum=0;
			for(int i=1;i<=n;i++)
			{
				if(i%4==0||i%7==0)
				{
					sum+=i;
				}
			}
			
			return sum;
	 }
		
		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the N");
			int n=sc.nextInt();
		
	 
			System.out.println(Que1.computesum(n));
		}

	}
