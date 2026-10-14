package com.Method;

import java.util.Scanner;

public class AdditionUsingAMethod {
	
	static void add(int a,int b) {
		System.out.println("Sum: "+(a+b));
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int num1=sc.nextInt();
		
		System.out.print("Enter second number: ");
		int num2=sc.nextInt();
		
		add(num1,num2);
		
	}

}
