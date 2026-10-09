package com.conditionalstmt;

import java.util.Scanner;

public class Q3PosiOrNegOrZero {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number :");
		int num=sc.nextInt();
		
		if(num>=1)
		{
			System.out.println(num+" - Positive Number");
		}
		else if(num==0)
		{
			System.out.println(num+" - Zero");
		}
		else {
			System.out.println(num+" - Negative");
		}
	}

}
