package lab2;
import java.util.Scanner;

public class program03 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int a=sc.nextInt();
		
		System.out.println(findnthterm( a));
		

	}
	
	static int findnthterm(int a)
	{
		int[] arr=new int[a];
		arr[0]=0;
		arr[1]=1;
		
		int first=0;
		int second=1;
		int result = 0;
		for(int i=2;i<a;i++)
		{
			result=first+second;
			arr[i]=result;
			first=second;
			second=result;
		}
			return  result;
	}
	

}
