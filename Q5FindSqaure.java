package com.method;

import java.util.Scanner;

public class Q5FindSqaure {
	static int findsqaure(int num) {
		return num*num;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int sqaure=findsqaure(sc.nextInt());
		System.out.println(sqaure);
		
	}

}
