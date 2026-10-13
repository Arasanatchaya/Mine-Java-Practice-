package com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductPrice {

	public static void main(String[] args) {
		
		ArrayList<Integer> price=new ArrayList<Integer>();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many products: ");
		int c_pro=sc.nextInt();
		
		for(int i=0;i<c_pro;i++)
		{
			System.out.println("Product Price: ");
			price.add(sc.nextInt());
		}
		Collections.sort(price);
		System.out.println(price);
	}
}
