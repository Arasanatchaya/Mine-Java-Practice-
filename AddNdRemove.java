package com.Collections;

import java.util.LinkedList;

public class AddNdRemove {

	public static void main(String[] args) {
		
		LinkedList<String> city=new LinkedList<String>();
		
		city.add("Covai");
		city.add("Trichy");
		city.add("Madurai");
		city.add("Kochi");
		
		System.out.println(city);
		
		city.removeFirst();
		System.out.println(city);
		city.addFirst("Hyd");
		System.out.println(city);
	}
}
