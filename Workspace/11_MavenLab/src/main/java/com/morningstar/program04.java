package com.morningstar;

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

}
