package com.Polymorphism;

class Payment{
	
	void pay(double amt)
	{
		System.out.println();
	}
}
class UPIPayment extends Payment{
	@Override
	void pay(double amt)
	{
		System.out.println("Paid using UPI: "+amt);
	}
}
class CardPayment extends Payment{
	
	@Override
	void pay(double amt)
	{
		System.out.println("Paid using Card: "+amt);
	}
}
class CashPayment extends Payment{
	
	@Override
	void pay(double amt)
	{
		System.out.println("Paid using Card: "+amt);
	}
}

public class PaymentSystem {
	public static void main(String[] args) {
		
		Payment p=new UPIPayment();
		p.pay(500.0);
		Payment p1=new CardPayment();
		p1.pay(1000.0);
		Payment p2=new CashPayment();
		p2.pay(200.0);
		
	}

}
