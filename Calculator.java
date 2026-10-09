package com.Polymorphism;

public class Calculator {
	int add(int a,int b)
	{
		return a+b;
	}
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
	int mul(int a,int b)
	{
		return a*b;
	}
	double mul(double a,double b)
	{
		return a*b;
	}
	public static void main(String[] args) {
		
		Calculator c=new Calculator();
		System.out.println(c.add(10,20));
		System.out.println(c.add(10,20,20));
		System.out.println(c.mul(5.2, 2));
		System.out.println(c.mul(10, 20));
	}
}
