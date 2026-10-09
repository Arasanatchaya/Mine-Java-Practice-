package com.conditionalstmt;

import java.util.Scanner;

public class Q9LoginValidation {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Username : ");
		String un=sc.next();
		
		System.out.println("Enter Password : ");
		int pwd=sc.nextInt();
		
		int pass=1234;
		String user="admin";
		
		if(un.equals(user) && pwd==pass)
		{
			System.out.println("Login Successful");
		}
		else
		{
			System.out.println("Error");
		}
	}

}
