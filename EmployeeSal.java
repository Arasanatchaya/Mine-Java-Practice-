package com.Polymorphism;

public class EmployeeSal {
	void calsal(int basic)
	{
		System.out.println(basic);
	}
	void calsal(int basic,int bonus)
	{
		System.out.println(basic+bonus);
	}
	void calsal(double basic,double bonus)
	{
		System.out.println(basic+bonus);
	}
	public static void main(String[] args) {
		EmployeeSal e=new EmployeeSal();
		e.calsal(20000);
		e.calsal(20000, 5000);
		e.calsal(20000.50, 2500.50);
	}
}
