package com.Method;

import java.util.Scanner;

public class StudentGradeCalculator {
	
	static int total(int tamil,int english,int maths)
	{
		return tamil+english+maths;
	}
	static int avg(int total)
	{
		int ag=total/3;
		return ag;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Tamil mark: ");
		int t_mark=sc.nextInt();
		
		System.out.print("Enter English mark: ");
		int e_mark=sc.nextInt();
		
		System.out.print("Enter Maths mark: ");
		int m_mark=sc.nextInt();
		
		
		int total=total(t_mark,e_mark,m_mark);
		System.out.println("Total: "+total);
		
		double avg=avg(total);
		System.out.println("Average: "+avg);
	}
}
