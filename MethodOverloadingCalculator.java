package com.Method;

public class MethodOverloadingCalculator {
	
	static int calculator(int a,int b)
	{
		return a+b;
	}
	static int calculator(int a,int b,int c)
	{
		return a+b+c;
	}
	static double calculator(double a,double b)
	{
		return a+b;
	}
	public static void main(String[] args) {
		
		int twoval=calculator(10, 20);
		int threeval=calculator(20, 20, 20);
		double val=calculator(4, 4);
		System.out.println(twoval);
		System.out.println(threeval);
		System.out.println(val);
		
		
	}
}
