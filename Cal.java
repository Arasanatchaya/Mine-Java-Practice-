package com.Polymorphism;

public class Cal {

	int add(int a,int b)
	{
		return a+b;
	}
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
	public static void main(String[] args) {
		
		Cal c=new Cal();
		System.out.println(c.add(10, 20));
		System.out.println(c.add(20,30,10));
		
	}
}
