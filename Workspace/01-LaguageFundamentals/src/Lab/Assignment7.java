package Lab;

import java.util.Scanner;

public class Assignment7
{
	public int getSum(int number)
	{
		int sum = 0;
		if ( number > 999 && number < 10000)
		{
			while(number != 0)
			{
				sum = sum + number%10;
				number = number/10;
			}
			
			System.out.println(sum);
		}
		else
		{
			System.out.println("Enter only 4 digit number");
		}
		return sum;
	}
}


