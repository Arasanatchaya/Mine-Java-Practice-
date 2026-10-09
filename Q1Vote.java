package com.conditionalstmt;

import java.util.Scanner;

public class Q1Vote {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter you Age: ");
		int age=sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("Eligiable for Vote");
		}
		else
		{
			System.out.println("Not Eligiable");
		}
	}

}
