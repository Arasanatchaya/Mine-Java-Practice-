package com.Method;

import java.util.Scanner;

public class Palindrome {
	
	static int isPalindrome(int n)
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
		
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		
		int rev=isPalindrome(num);
		
		if(num==rev)
		{
			System.out.println("Palindrome number");
		}
		else
		{
			System.out.println("Not a Palindrome number");
		}
	}

}
