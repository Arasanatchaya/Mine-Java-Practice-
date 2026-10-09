package com.ClassndObject;

public class Car {
	
	String brand;
	String model;
	int price;
	
	void showDetails() {
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
		System.out.println("Price: "+price);
	}
	public static void main(String[] args) {
		System.out.println("--------Car 1----------");
		Car c1=new Car();
		c1.brand="Toyota";
		c1.model="Camry";
		c1.price=2000000;
		c1.showDetails();
		
		System.out.println("--------Car 2----------");
		Car c2=new Car();
		c2.brand="Tesla";
		c2.model="Model 3";
		c2.price=3000000;
		c2.showDetails();
		
		System.out.println("--------Car 2----------");
		Car c3=new Car();
		c3.brand="BMW";
		c3.model="Model 1";
		c3.price=4000000;
		c3.showDetails();
		
		
	}

}
