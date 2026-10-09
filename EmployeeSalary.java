package com.Polymorphism;

public class EmployeeSalary {
	
	void calSal(int basic)
	{
		System.out.println(basic);
	}
	void calsal(int basic,int bonus)
	{
		System.out.println(basic+bonus);
	}
	public static void main(String[] args) {
		
		EmployeeSalary e=new EmployeeSalary();
		e.calSal(20000);
		e.calsal(20000, 5000);
	}

}

