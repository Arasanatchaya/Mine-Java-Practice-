package com.Abstraction;

abstract class Vehicle{
	abstract void start();
	
	void stop()
	{
		System.out.println("Stop");
	}
}
class Car extends Vehicle{

	void start() {
		System.out.println("Car starts with a key");
	}
	
}
class Bike extends Vehicle{
	void start() {
		System.out.println("Bike starts with self-start");
	}
}

public class MainVehicle {
	
	public static void main(String[] args) {
		Vehicle c=new Car();
		c.start();
		c.stop();
		Vehicle b=new Bike();
		b.start();
		b.stop();
	}
	

}
