package com.Collections;

import java.util.TreeSet;

public class EmpId {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> id=new TreeSet<Integer>();
		
		id.add(1);
		id.add(2);
		id.add(3);
		id.add(4);
		id.add(2);
		id.add(1);
		System.out.println(id);
	}

}
