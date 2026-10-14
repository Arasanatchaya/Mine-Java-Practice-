package com.Method;

import java.util.Scanner;

public class CheckPalindromeString {
	
	static boolean isPalindrome(String text)
	{
		boolean palind=false;
		String ori=text;
		String rev="";
		for(int i=text.length()-1;i>=0;i--)
		{
			rev=rev+text.charAt(i);
		}
		if(rev.equals(ori))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Word: ");
		String text=sc.next();
		boolean palind=isPalindrome(text.toLowerCase());
		
		if(palind)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}
}
