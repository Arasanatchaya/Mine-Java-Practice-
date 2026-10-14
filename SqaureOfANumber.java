package com.Method;

import java.util.Scanner;

public class SqaureOfANumber {
	
	static int sqaure(int num)
	{
		return num*num;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
				
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		
		int square=sqaure(num);
		System.out.println("Square: "+square);
	}

}
