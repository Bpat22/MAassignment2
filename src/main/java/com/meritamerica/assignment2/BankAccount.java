package com.meritamerica.assignment2;

public class BankAccount {

	private double balance;
	private double interestRate;
	private long accountNumber;
	private int years;
	

	public BankAccount (long accountNumber, double balance, double interestRate ) {
		//super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.interestRate = interestRate; 
	}

	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	public BankAccount(double balance, double interestRate) {
		this (MeritBank.getnextAccountNum(), balance, interestRate);
		}		

	public long getAccountNumber() {
		return this.accountNumber;
	}	
	public double getBalance() {
		return this.balance;
	}
	public double getInterestRate() {
		return this.interestRate;
	}
	
	public boolean withdraw (double amount) {
		if (amount < 0 || amount > balance ) {
			System.out.println("Withdraw amount is greater than current balance in Checking Account. Please, try different amount.");
			return false;

		} else {
			this.balance = this.balance - amount;
			return true;
		}
	}

	public boolean deposit (double amount) {
		if (amount > 0 ) {
			this.balance = this.balance + amount;

			return true;
		} else {
			System.out.println("You can not deposite negative amount in Checking Account. Please try again.");
			return false;
		}
	}	
			
	public double futureValue(int years) {
		return this.balance * Math.pow( + this.interestRate, years);
	}
}

