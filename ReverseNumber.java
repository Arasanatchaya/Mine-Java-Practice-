package com.Method;

import java.util.Scanner;

public class ReverseNumber {
	
	static int reverseNumber(int n)
	{
		int rev=0;
		while(n!=0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num=sc.nextInt();
		
		int rev=reverseNumber(num);
		
		System.out.println("Reversed: "+rev);
	}

}
