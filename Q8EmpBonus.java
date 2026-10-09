package com.conditionalstmt;

import java.util.Scanner;

public class Q8EmpBonus {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Salary :");
		int sal=sc.nextInt();
		int f_sal=0;
		
		if(sal>=50000)
		{
			int bonus=sal/10;
			
			f_sal=sal+bonus;
			System.err.println(f_sal);
		}
		else
		{
			System.out.println(sal);
			
		}
	}

}
