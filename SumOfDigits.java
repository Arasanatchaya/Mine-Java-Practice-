package com.Method;

import java.util.Scanner;

public class SumOfDigits {
	
	static int sumDigits(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		
		int sum=sumDigits(n);
		System.out.println("Sum: "+sum);
		
		
	}

}
