package com.constructoe;

public class Product {
	
	String name;
	int price;
	int quantity;
	
	Product(String n,int p,int q){
		name=n;
		price=p;
		quantity=q;
	}
	void display() {
		int total=price*quantity;
		System.out.println("Total = "+total);
	}

	public static void main(String[] args) {
		Product p1=new Product("Pen",20,3);
		Product p2=new Product("Ink",50,2);
		p1.display();
		p2.display();
		
		
	}
}
