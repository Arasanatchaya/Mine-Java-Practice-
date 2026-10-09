package com.conditionalstmt;

import java.util.Scanner;

public class Q7ElectriBill {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Units : ");
		int units=sc.nextInt();
		
		if(units>=0 && units<=100)
		{
			System.out.println("Low Usage");
		}
		else if(units>=101 && units<=200)
		{
			System.out.println("Medium Usage");
		}
		else if (units>=201 && units<=500)
		{
			System.out.println("High Usage");
		}
		else {
			System.out.println("Very High Usage");
		}
	}
	

}
