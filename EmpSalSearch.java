package com.Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpSalSearch {

	public static void main(String[] args) {
		
		ArrayList<Integer> sal=new ArrayList<Integer>();
		
		sal.add(25000);
		sal.add(30000);
		sal.add(35000);
		sal.add(40000);
		
		boolean found=false;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Salary:");
		int usal=sc.nextInt();
		
		for(int i=0;i<sal.size();i++)
		{
			if(sal.contains(usal))
			{
				found=true;
				break;
			}
			else
			{
				found=false;
			}
		}
		if(found)
		{
			System.out.println("Salary Found");
		}
		else
		{
			System.out.println("Salary Not Found");
		}
	}
}
