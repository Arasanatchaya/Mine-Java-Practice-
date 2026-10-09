package com.Array;

public class Q7CountEvenOdd {
	
	public static void main(String[] args) {
		
		int[] num= {10,15,20,25,30};
		
		int even=0;
		int odd=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println("Even = "+even);
		System.out.println("Odd = "+odd);
	}

}
