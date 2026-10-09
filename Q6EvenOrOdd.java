package com.conditionalstmt;

import java.util.Scanner;

public class Q6EvenOrOdd {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		int num=sc.nextInt();
		
		if(num%2==0)
		{
			if(num>=0)
			{
				System.out.println("Postive Even");
			}
			else {
				System.out.println("Negative Even");
			}
		}
		else
		{
			if(num>=1)
			{
				System.out.println("Positive Odd");
			}
			else
			{
				System.out.println("Negative Odd");
			}
		}
	}

}
