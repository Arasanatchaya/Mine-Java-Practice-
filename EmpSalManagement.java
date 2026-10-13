package com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmpSalManagement {

	public static void main(String[] args) {
		
		ArrayList<Integer> sal=new ArrayList<Integer>();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter How many Employee Salary: ");
		int emp=sc.nextInt();
		
		for(int i=1;i<=emp;i++)
		{
			System.out.println("Enter Sal "+i+" : ");
			sal.add(sc.nextInt());
		}
		System.out.println("Maximum Salary: "+Collections.max(sal));
		Collections.sort(sal);
		System.out.println("Salary: "+sal);
		
	}
}
