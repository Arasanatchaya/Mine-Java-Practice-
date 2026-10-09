package com.Array;

public class Q9CountNumber {
	public static void main(String[] args) {
		int[] num= {10,20,30,10,40,10};
		
		int count=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]==10)
			{
				count++;
			
			}
		}
		System.out.println("10 Occurs "+count+" times");
	}

}
