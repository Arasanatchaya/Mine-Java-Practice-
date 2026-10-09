package com.method;

public class Q9Calculator {
	
	static int add(int a,int b)
	{
		return a+b;
	}
	static int sub(int a,int b)
	{
		return a-b;
	}
	static int mul(int a,int b)
	{
		return a*b;
	}
	static int div(int a,int b)
	{
		return a/b;
	}

	public static void main(String[] args) {
		
		int addition=add(20, 10);
		int Subtr=sub(20,3);
		int Mul=mul(8,8);
		int Divide=div(25,5);
		System.out.println("Addition: "+addition);
		System.out.println("Subtraction: "+Subtr);
		System.out.println("Multiplication: "+Mul);
		System.out.println("Division: "+Divide);
	}
}
