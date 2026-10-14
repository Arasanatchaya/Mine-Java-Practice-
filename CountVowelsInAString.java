package com.Method;

import java.util.Scanner;

public class CountVowelsInAString {
	
	static int countVowels(String text)
	{
		int count=0;
		for(int i=0;i<text.length();i++)
		{
			if(text.charAt(i)=='A' || text.charAt(i)=='E' || text.charAt(i)=='I' ||text.charAt(i)=='O' || text.charAt(i)=='U')
			{
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Word: ");
		String txt=sc.next();
		int count=countVowels(txt.toUpperCase());
		System.out.println("Vowels: "+count);
		
		
	}

}
