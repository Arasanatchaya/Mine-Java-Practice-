package com.Method;

import java.util.Scanner;

public class ReverseAString {
	
	static String reverseString(String text)
	{
		String rev="";
		
		for(int i=text.length()-1;i>=0;i--)
		{
			
			rev=rev+text.charAt(i);
			
		}
		
		return rev;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a Word: ");
		String txt=sc.next();
		
		String rev=reverseString(txt);
		System.out.println("Revered: "+rev);
	}

}
