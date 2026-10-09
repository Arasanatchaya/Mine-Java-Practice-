package com.ClassndObject;

public class Employee {
	
	String name;
	int salary;
	
	void display(){
		
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
	}
	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.name="Atchaya";
		e1.salary=23000;
		e1.display();
		System.out.println("------------------");
		Employee e2=new Employee();
		e2.name="Kavin";
		e2.salary=30000;
		e2.display();
				
	}
}
