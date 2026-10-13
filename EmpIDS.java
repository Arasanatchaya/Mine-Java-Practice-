package com.Collections;

import java.util.Scanner;
import java.util.TreeSet;

public class EmpIDS {

	public static void main(String[] args) {
		
		TreeSet<Integer> id=new TreeSet<Integer>();
		
//		id.add(101);
//		id.add(201);
//		id.add(101);
//		id.add(303);
//		id.add(98);
//		System.out.println(id);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("How many datas want: ");
		int nd=sc.nextInt();
		
		for(int i=0;i<nd;i++)
		{
			System.out.println("Enter id: ");
			id.add(sc.nextInt());
			
		}
		System.out.println(id);
	}
}
