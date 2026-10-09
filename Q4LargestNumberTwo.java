package com.conditionalstmt;

import java.util.Scanner;

public class Q4LargestNumberTwo {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number:");
		int num1=sc.nextInt();
		
		System.out.println("Enter Number:");
		int num2=sc.nextInt();
		
		if(num1>=num2)
		{
			System.out.println("Num1 is Largest Number");
		}
		else
		{
			System.out.println("Num2 is Largest Number");
		}
	}
}
