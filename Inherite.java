package com.Inheritance;

class Vehicle{
	String brand="Toyota";
	void start()
	{
		System.out.println("Vehicle Started");
	}
}
class Car extends Vehicle{
	void drive()
	{
		System.out.println("Car is driving");
	}
}

public class Inherite {
	
	public static void main(String[] args) {
		
		Car c=new Car();
		System.out.println(c.brand);
		c.start();
		c.drive();
		
	}
}
