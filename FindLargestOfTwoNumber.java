package com.Method;

import java.util.Scanner;

public class FindLargestOfTwoNumber {

	static void findlargest(int num1,int num2)
	{
		if(num1>num2)
		{
			System.out.println("Largest: "+num1);
		}
		else
		{
			System.out.println("Largest: "+num2);
		}
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num1=sc.nextInt();
		
		System.out.print("Enter a number: ");
		int num2=sc.nextInt();
		
		findlargest(num1, num2);
	}
}
