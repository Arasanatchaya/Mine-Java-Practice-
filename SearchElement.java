package com.Array;

public class SearchElement {

	public static void main(String[] args) {
		
		int[] arr= {10,20,30,40,50};
		
		boolean found=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==30)
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
			System.out.println("Element Found");
		}
		else
		{
			System.out.println("Element Not Found");
		}
	}
}
