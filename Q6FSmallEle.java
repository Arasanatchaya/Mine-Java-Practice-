package com.Array;

public class Q6FSmallEle {
		
	public static void main(String[] args) {
		
		int[] num= {25,80,45,10,35};
		
		int min=num[0];
		for(int i=0;i<num.length;i++)
		{
			if(num[i]<min)
			{
				min=num[i];
			}
		}
		System.out.println(min);
	}
}
