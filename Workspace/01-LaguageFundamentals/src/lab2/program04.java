package lab2;
import java.util.Scanner;

public class program04 
{
	public boolean isPrime(int num) {
		boolean flag=true;
				
				if(num==0 || num==1)
				{
					flag=false;
				}
				for (int i=2;i<=num/2;i++)
				{
					if(num%i==0)
					{
						flag=false;
						break;
					}
					
				}
				return flag;
				
			}

//	public static void main(String[] args)
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Number");
//		int a=sc.nextInt();
//		findPrimes(a);
//
//	}
//	
//	static void findPrimes(int a)
//	{
//		for(int i=2;i<=a;i++)
//		{
//			if(checkPrime(i))
//			{
//				System.out.print(i+ " ");
//			}
//			
//		}
//	}
//	
//	static boolean checkPrime(int num)
//	{
//		for(int i=2;i<=(num/2);i++)
//		{
//			if(num%i==0)
//				return false;
//			
//		}
//		return true;
//	}

}
