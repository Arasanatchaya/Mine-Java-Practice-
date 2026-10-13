package com.Collections;

import java.util.Scanner;

public class WordFrequency {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1 Line Sentence: ");
		String sen=sc.nextLine();
		String[] words=sen.split(" ");
		for(int i=0;i<words.length;i++)
		{
			System.out.println(words[i]);
		}
		
		
	}
}
