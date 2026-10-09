package com.Array;

public class Q4FinDAverage {
	
	public static void main(String[] args) {
		
		int[] num= {80,70,90,60,100};
		int count=num.length;
		int sum=0;
		for(int i=0;i<count;i++)
		{
			sum=num[i]+sum;
		}
		double avg=(double) sum/num.length;
		System.out.println(avg);
		
		
	}
	

}
