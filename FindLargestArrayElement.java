package com.Method;

public class FindLargestArrayElement {
	
	static int findLar(int[] arr)
	{
		int lar=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>lar)
			{
				lar=arr[i];
			}
		}
		
		return lar;
	}
	
	public static void main(String[] args) {
		
		int[] num= {10,20,30,40,56,30,36};
		
		int large=findLar(num);
		System.out.println("Largest: "+large);
		
	}

}
