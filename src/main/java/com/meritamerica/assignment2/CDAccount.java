package com.meritamerica.assignment2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CDAccount extends BankAccount{

	CDOffering offering;
	private double balance;
	private double interestRate;
	private int term;
	private long accountNumber;
	private Date date;
	
	public CDAccount (CDOffering offering, double balance) {
		super(MeritBank.getNextAccountNumber(), balance, offering.getInterestRate());
		//this.accountNumber = MeritBank.getnextAccountNum();
		this.offering = offering;
		//this.balance = balance;
		this.date = new Date();
		
		
	}
	
	public double getBalance() {
		return this.balance;
	}
	public double getinterestRate() {
		return this.interestRate;
	}
	
	
	public int getTerm() {
		return this.term;
	}
	
	public Date getStartDate(){
		//DateFormat startDate = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		//Date date = new Date();
		//System.out.println(startDate.format(date));
		return this.date;
		
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public double futureValue() {
		return this.futureValue();
	}
}