package com.Array;

public class LargestElement {

	public static void main(String[] args) {
		
		int[] arr= {12,34,54,54,64,64,23,43};
		
		int lar=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>lar)
			{
				lar=arr[i];
			}
		}
		System.out.println("Largest: "+lar);
	}
}
