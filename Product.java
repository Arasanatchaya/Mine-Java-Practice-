package com.ClassndObject;

public class Product {

	String productName;
	int price;
	int quantity;
	
	void calculateTotal() {
		int total=price*quantity;
		System.out.println("Total: $"+total);
	}
	public static void main(String[] args) {
		
		Product p=new Product();
		
		p.productName="Laptop";
		p.price=50000;
		p.quantity=2;
		p.calculateTotal();
	}
}
