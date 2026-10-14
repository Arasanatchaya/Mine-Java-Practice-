package com.Method;

import java.util.Scanner;

public class SimpleCalculatorUsingMethods {
	
	 static void add(int a,int b) {
		 
		 System.out.println("Addtion: "+(a+b));
	 }
	 static void sub(int a,int b)
	 {
		 System.out.println("Subtraction: "+(a-b));
	 }
	 
	 static void mul(int a,int b)
	 {
		 System.out.println("Multiplicaton: "+(a*b));
	 }
	 static void div(int a,int b)
	 {
		 System.out.println("Division: "+(a/b));
	 }
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Value: ");
		int num1=sc.nextInt();
		
		System.out.println("Enter a Value: ");
		int num2=sc.nextInt();
		add(num1, num2);
		sub(num1,num2);
		mul(num1,num2);
		div(num1,num2);
		
		
		
	}
}
