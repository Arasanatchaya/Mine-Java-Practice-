package com.conditionalstmt;

import java.util.Scanner;

public class Q2PassOrFail {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Mark : ");
		int mark=sc.nextInt();
		
		if(mark>=40)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
