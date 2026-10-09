package com.Array;

public class Q8SearchEleme {
	public static void main(String[] args) {
		
		int[] num= {10,20,30,40,50};
		boolean found=false;
		for(int i=0;i<num.length;i++) {
			if(num[i]==35)
			{
				found=true;
				break;
			}
			}
		if(found)
		{
			System.out.println("30 Found");
		}
		else
		{
			System.out.println("Not Found");
		}
	}

}
