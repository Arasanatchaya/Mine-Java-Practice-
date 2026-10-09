package com.method;

import java.util.Scanner;

public class Q7StudentResult {
	static String checkResult(int marks)
	{
		if(marks>=40)
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Marks: ");
	String res=	checkResult(sc.nextInt());
	System.out.println(res);
		
	}

}
