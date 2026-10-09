package com.method;

public class Q6EmployeeSal {
	
	static int calculateSalary(int sal,int bonus)
	{
		return sal+bonus;
	}
	
	public static void main(String[] args) {
		
		int Total=calculateSalary(30000, 5000);
		System.out.println(Total);
	}

}
