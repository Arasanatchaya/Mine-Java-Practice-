package com.Collections;

import java.util.HashMap;

public class Productde {

	public static void main(String[] args) {
		HashMap<Integer, String> product=new HashMap<Integer, String>();
		
		product.put(1, "Laptop");
		product.put(2, "Mouse");
		product.put(3, "Keyboard");
		product.put(4, "");
		System.out.println(product);
		if(product.containsKey(4))
		{
			System.out.println(product.get(4));
		}
		else
		{
			System.out.println("Product not found");
		}
	}
	
	
}
