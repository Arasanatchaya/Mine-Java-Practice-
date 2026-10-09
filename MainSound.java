package com.Polymorphism;

class Animal{
	void sound()
	{
		System.out.println("Hii I'm from Animal");
	}
	
}
class Dog extends Animal{
	@Override
	void sound() {
		System.out.println("Bow Bow");
	}
	
}
class Cat extends Animal{
	@Override
	void sound() {
		System.out.println("Meow meow");
		
	}
}
public class MainSound{
	
public static void main(String[] args) {
	
	Animal a=new Animal();
	a.sound();
	Dog d=new Dog();
	d.sound();
	Cat c=new Cat();
	c.sound();
}

}
