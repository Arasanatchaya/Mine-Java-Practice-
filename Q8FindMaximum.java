package com.method;

public class Q8FindMaximum {
	
	static int findMax(int a,int b)
	{
		if(a>b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	
	public static void main(String[] args) {
	int max=	findMax(20, 10);
	System.out.println("Maximum: "+max);
	
		
	}

}
