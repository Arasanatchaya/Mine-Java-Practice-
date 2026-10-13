package com.loop;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int rev=0;
		int ori=num;
		
		while(num!=0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(rev==ori)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
