package lab2;
	import java.util.*;

	public class Assignment1 {
		
//		public class Cube {
			public int sumCube(int num) {
				int cube=num* num* num;
				int sum =0;

				while(cube!=0) 
				{
					sum=sum+cube%10;
					cube=cube/10;
				}
				return sum;
				}

		
//
//		public static void main(String args[]){
//
//		System.out.println("Enter a number");
//		Scanner sc = new Scanner(System.in);   
//		 int number= sc.nextInt();
//		int sum=0;
//
//		while(number!=0)
//		{
//		int digit= number%10;
//		sum=sum+digit*digit*digit;
//		number=number/10;
//		}
//		System.out.println("The sum of cubes of digits of the given number is " +sum);
//
//
//		}
//		

}
