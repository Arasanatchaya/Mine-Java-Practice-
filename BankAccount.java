package com.ClassndObject;

public class BankAccount {

	String accountHolder;
	int balance;
	
	void display() {
		System.out.println("Account Holder: "+accountHolder);
		System.out.println("Initial Balance: $"+balance);
		
	}
	void deposited(int depositamt) {
		balance= balance+depositamt;
		System.out.println("Deposited: "+depositamt);
	}
	void withdraw(int withdrawamt) {
		if(withdrawamt<=balance)
		{
			balance=balance-withdrawamt;
			System.out.println("Withdrawn: "+withdrawamt);
		}
		
	}
	void displayBalance(){
		System.out.println("Final Balance: "+balance);
	}
	public static void main(String[] args) {
		
		BankAccount ac=new BankAccount();
		ac.accountHolder="Atchaya";
		ac.balance=700;
		ac.display();
		ac.deposited(2000);
		ac.withdraw(11500);
		ac.displayBalance();
		
	}
}
