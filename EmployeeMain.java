package com.Inheritance;

class Employee{
	String name="Atchaya";
	int salary=30000;
	
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
	}
}
class Developer extends Employee{
	
	void write(){
		
		display();
		System.out.println("Employee details displayed →");
		System.out.println("Developer is writing code");
		
	}
}

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		Developer d=new Developer();
		
		d.write();
	}

}
