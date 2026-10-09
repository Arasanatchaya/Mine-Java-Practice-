package com.constructoe;

public class Emp {

	String name;
	int sal;
	
	Emp(){
		
		System.out.println("Nothing");
	}
	Emp(String name){
		this.name=name;
	}
	Emp(String name,int sal){
		this.name=name;
		this.sal=sal;
	}
	
	
	public static void main(String[] args) {
		
		Emp e=new Emp();
		System.out.println(e);
		
		Emp e2=new Emp("Atchaya");
		System.out.println(e2.name);
		System.out.println(e2.sal);
		
		Emp e3=new Emp("Ammu",2000);
		System.out.println(e3.name);
		System.out.println(e3.sal);
		
		
	}
	
}
