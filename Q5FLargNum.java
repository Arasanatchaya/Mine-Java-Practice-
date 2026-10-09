package com.Array;

import java.util.Iterator;

public class Q5FLargNum {
	
	public static void main(String[] args) {
		
		int[] num= {25,80,45,90,35};
		int lar=0;
		
		for(int i=0;i<num.length;i++) {
			if(num[i]>lar)
			{
				lar=num[i];
			}
		}
		System.out.println("Largest = "+lar);
		
	}

}
