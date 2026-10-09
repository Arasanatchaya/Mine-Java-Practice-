package com.Encapsulation;

public class Employee {
	
	private String name;
	private double sal;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setSal(double sal)
	{
		if(sal>=0)
		{
			this.sal=sal;
		}
		else {
			System.out.println("Invalid");
		}
	}
	public double getSal()
	{
		return sal;
	}
	public static void main(String[] args) {
		
		Employee e=new Employee();
		
		e.setName("Atchaya");
		System.out.println(e.getName());
		
		e.setSal(280000.45);
		System.out.println(e.getSal());
	}
	
}
