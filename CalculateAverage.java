package com.Array;

public class CalculateAverage {

	public static void main(String[] args) {
		
		int[] arr= {60,70,80,90,100};
		int size=arr.length;
		double avg=0;
		
		for(int i=0;i<size;i++)
		{
			avg=avg+arr[i];
		}
		System.out.println("Average: "+avg/size);
	}
}
