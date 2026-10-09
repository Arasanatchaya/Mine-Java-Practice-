package com.Abstraction;

abstract class Employee{
	abstract void calculateSal(double sal);
}
class FullTimeEmployee extends Employee{
	
	void calculateSal(double sal) {
		System.out.println("Full-Time salary: "+sal);
	}

}
class PartTimeEmployee extends Employee{
	
	void calculateSal(double sal) {
		
		int hour=40;
		double total=sal*hour;
		System.out.println("Part-time Salary: "+total);
		
	}
}

public class EmployeSal {
	public static void main(String[] args) {
		
		Employee e=new FullTimeEmployee();
		e.calculateSal(30000.0);
		Employee e2=new PartTimeEmployee();
		e2.calculateSal(200);
		
		
		
	}

}
