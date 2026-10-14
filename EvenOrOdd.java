package com.Method;

import java.util.Scanner;

public class EvenOrOdd {

	static void checkEvenOdd(int num)
	{
		if(num%2==0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd number");
		}
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num=sc.nextInt();
		checkEvenOdd(num);
	}
}
