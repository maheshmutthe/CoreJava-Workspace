package com.morningstar;
	import java.util.*;

	public class Assignment1 {
		
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


}
