package com.Array;

public class SmallestElement {

	public static void main(String[] args) {
		
		int[] arr= {12,32,43,6,34,2,98};
		int sml=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<sml)
			{
				sml=arr[i];
			}
		}
		System.out.println("Smallest: "+sml);
	}
}
