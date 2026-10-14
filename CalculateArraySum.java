package com.Method;

public class CalculateArraySum {
	
	static int arraySum(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		int[] arr= {10,20,30,40};
		int sum=arraySum(arr);
		System.out.println("Total: "+sum);
		
	}

}
