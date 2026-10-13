package com.Collections;

import java.util.HashMap;
import java.util.Scanner;

public class StudentMark {
	public static void main(String[] args) {
		
		HashMap<Integer, Integer> student=new HashMap<Integer, Integer>();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How Many Student: ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter Student ID & Mark: ");
			student.put(sc.nextInt(), sc.nextInt());
		}
		System.out.println("Enter Id for Details: ");
		int showdet=sc.nextInt();
		if(student.containsKey(showdet))
		{
			System.out.println("Mark: "+student.get(showdet));
		}
		else
		{
			System.out.println("Student Not Found");
		}
	}

}
