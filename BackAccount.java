package com.Encapsulation;

public class BackAccount {
	
	private String accountHolder;
	private double balance;
	
	public void setAccountholder(String name) {
		this.accountHolder=name;
	}
	public String getAccountholder()
	{
		return accountHolder;
	}
	
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public double getBalance()
	{
		return balance;
	}
	public void deposit(double depositamt)
	{
		balance=balance+depositamt;
	}
	public void withdraw(double withdrawamt)
	{
		if(withdrawamt>0 && balance>=withdrawamt)
		{
			balance=balance-withdrawamt;
		}
		else
		{
			System.out.println("Unavailable Balance");
		}
	}
	
	public static void main(String[] args) {
		BackAccount b=new BackAccount();
		
		b.setAccountholder("Atchaya");
		String name=b.getAccountholder();
		System.out.println("Account Holder: "+name);
		
		b.setBalance(10000.0);
		double bal=b.getBalance();
		System.out.println("Initial Balance: "+bal);
		b.deposit(5000.0);
		System.out.println("After Deposit: "+b.getBalance());
		
		b.withdraw(3000.0);
		System.out.println("After Withdraw: "+b.balance);
	}
	

}
