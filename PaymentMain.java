package com.Abstraction;

abstract class Payment{
	abstract void pay(double amt);
	
}
class UPIPayment extends Payment{
	void pay(double amt) {
		System.out.println("Paid "+amt+" using UPI");
	}
}
class CardPayment extends Payment{
	void pay(double amt)
	{
		System.out.println("Paid "+amt+" using Card");
	}
}
public class PaymentMain {

	public static void main(String[] args) {
		
		Payment p1=new UPIPayment();
		p1.pay(500.0);
		Payment p2=new CardPayment();
		p2.pay(1000.0);
	}
}
