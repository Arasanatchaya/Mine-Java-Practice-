package com.Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpListId {

	public static void main(String[] args) {
		
		ArrayList<Integer> id=new ArrayList<Integer>();
		
		id.add(101);
		id.add(102);
		id.add(103);
		id.add(104);
//		System.out.println(id);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter UserId: ");
		int uid=sc.nextInt();
		boolean found=false;
		for(int i=0;i<id.size();i++)
		{
			if(id.get(i)==uid)
			{
				found=true;
				break;
			}
			else
			{
				found=false;
			}
			
		}
		if(found) {
			System.out.println("Employee Found");
			
		}
		else
		{
			System.out.println("Employee Not Found");
		}
	}
}
