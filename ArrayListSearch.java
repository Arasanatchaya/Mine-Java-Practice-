package com.Collections;

import java.util.ArrayList;

public class ArrayListSearch {
	
	public static void main(String[] args) {
		
		ArrayList<String> name=new ArrayList<String>();
		
		name.add("Achu");
		name.add("Mugil");
		name.add("Kavi");
		
		System.out.println("Names: "+name);
		
		System.out.println("Achu is there: "+name.contains("Achu"));
	}

}
