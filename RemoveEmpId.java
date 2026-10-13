package com.Collections;

import java.util.LinkedList;
import java.util.Scanner;

public class RemoveEmpId {

	public static void main(String[] args) {
		
		LinkedList<Integer> id=new LinkedList<Integer>();
		
		id.add(101);
		id.add(102);
		id.add(103);
		id.add(104);
		id.add(105);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID: ");
		int uid=sc.nextInt();
		
		boolean found=id.contains(uid);
		
		if(found)
		{
			id.remove(Integer.valueOf(uid));
			System.out.println("Updated: "+id);
		}
		else
		{
			System.out.println("Employee D not Found");
		}
		
	}
}
