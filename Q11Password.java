package com.loops;

import java.util.Scanner;

public class Q11Password {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int crtpwd=12345;
		
	
		int pwd=0;
		while(pwd!=crtpwd)
		{
			System.out.println("Enter password : ");
			pwd=sc.nextInt();
			
			if(pwd==crtpwd)
			{
				System.out.println("Login Successful");
			}
			else {
				System.out.println("Wrong Pwd");
			}
		}
		
	}

}
