package com.constructoe;

public class Employee {
	
	int id;
	String name;
	int salary;
	String dept;
	
	Employee(int i,String n,int s,String d){
		id=i;
		name=n;
		salary=s;
		dept=d;
	}
	void display() 
	{
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("Department: "+dept);
	}
	
	public static void main(String[] args) {
		
	Employee e1=new Employee(1,"Atchaya",30000,"Java Dev");
	Employee e2=new Employee(2,"Naveen",40000,"Web Dev");
	Employee e3=new Employee(3,"Kavi",50000,"AI Dev");
	e1.display();
	e2.display();
	e3.display();
	}
	

}
