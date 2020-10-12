/*AccountHolder.Java
 * this class holds basic information about customer
 * gets the information from Checking Account and Savings Account for customer to see the balance and interest earned over 3 years
 */

package com.meritamerica.assignment2;

import java.util.Arrays;

public class AccountHolder {
	//this class contains variables for customer first name, middle name, last name and SSN number.
	//all variables are String data type, getting the value from user and assigning to that variable.

	String firstName;
	String middleName;
	String lastName;
	String ssn;
	CheckingAccount[] checkingArrays = new CheckingAccount[0];
	double checkingAccountBalance = 0;	
	SavingsAccount[] savingsArrays = new SavingsAccount[0];
	double savingsAccountBalance = 0;	
	CDAccount[] cdArrays = new CDAccount[0];
	double cdAccountBalance = 0;
	
	//constructor AccountHolder
	public AccountHolder (String firstName, String middleName, String lastName, String ssn) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;	
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String FirstName) {
		this.firstName = FirstName;
	}
	public String getMiddletName() {
		return middleName;
	}
	public void setMiddleName(String MiddleName) {
		this.middleName = MiddleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String LastName) {
		this.lastName = LastName;
	}
	public String getSSN() {
		return ssn;
	}
	public void setSSN(String SSN) {
		this.ssn = SSN;
	}
	
	//Checking Account
	public void addCheckingAccount(double openingBalance) {
		CheckingAccount[] mychArray = new CheckingAccount[checkingArrays.length + 1];
		CheckingAccount ca = new CheckingAccount(openingBalance);
		if ((openingBalance + getCheckingBalance() + getSavingsBalance()) < 250000) {
				for (int i = 0; i < checkingArrays.length; i ++){
				mychArray[i] = checkingArrays[i];
			}
			checkingArrays = mychArray;
			checkingArrays[checkingArrays.length -1] = ca;
		}	
		return;
	}				
	public void addCheckingAccount(CheckingAccount openingBalance) {
	//public void addCheckingAccount(CheckingAccount checkingAccount) {

		CheckingAccount[] mychArray = new CheckingAccount[checkingArrays.length + 1];
		if ((openingBalance.getBalance() + getCheckingBalance() + getSavingsBalance()) < 250000) {
				for (int i = 0; i < checkingArrays.length; i ++){
				mychArray[i] = checkingArrays[i];
			}
			checkingArrays = mychArray;
			checkingArrays[checkingArrays.length -1] = openingBalance;
		}	
		return;
	}
	public CheckingAccount[] getCheckingAccounts()	{
		return checkingArrays;
	}
	public int getNumberOfCheckingAccounts() {
		return checkingArrays.length;
	}	
	public double getCheckingBalance() {
		double chBalance = 0.0;
		for(int i = 0; i < checkingArrays.length; i++) {
		chBalance += checkingArrays[i].getBalance();
		}
		return chBalance;
	}
	
	//Savings Account
	public void addSavingsAccount(double openingBalance) {
		SavingsAccount[] mysaArray = new SavingsAccount[savingsArrays.length + 1];
		SavingsAccount sa = new SavingsAccount(openingBalance);
		if ((openingBalance + getCheckingBalance() + getSavingsBalance()) < 250000) {
				for (int i = 0; i < savingsArrays.length; i ++){
				mysaArray[i] = savingsArrays[i];
			}
			savingsArrays = mysaArray;
			savingsArrays[savingsArrays.length -1] = sa;
		}	
		return;
	}		
	public void addSavingsAccount(SavingsAccount openingBalance) {
		SavingsAccount[] mysaArray = new SavingsAccount[savingsArrays.length + 1];
		if ((getCheckingBalance() + getSavingsBalance() + openingBalance.getBalance()) < 250000) {
				for (int i = 0; i < savingsArrays.length; i ++){
				mysaArray[i] = savingsArrays[i];
			}
			savingsArrays = mysaArray;
			savingsArrays[savingsArrays.length -1] = openingBalance;
		}	
		return;
	}
	public SavingsAccount[] getSavingsAccounts()	{
		return savingsArrays;
	}
	public int getNumberOfSavingsAccounts() {
		return savingsArrays.length;
	}	
	public double getSavingsBalance() {
		double saBalance = 0.0;
		for(int i = 0; i < savingsArrays.length; i++) {
		saBalance += savingsArrays[i].getBalance();
		}
		return saBalance;
	}	
	
	//CD Account
	public CDAccount addCDAccount(CDOffering offering, double openingBalance) {
		CDAccount[] mycdArray = new CDAccount[cdArrays.length + 1];
		CDAccount cd = new CDAccount(offering, openingBalance);
			for (int i = 0; i < cdArrays.length; i ++){
				mycdArray[i] = cdArrays[i];
			}
			cdArrays = mycdArray;
			cdArrays[cdArrays.length -1] = cd;
			return cd;
		}	
		
	public CDAccount addCDAccount(CDAccount cdAccount) {
		CDAccount[] mycdArray = new CDAccount[cdArrays.length + 1];
		//CDAccount cd = new CDAccount();
			for (int i = 0; i < cdArrays.length; i ++){
				mycdArray[i] = cdArrays[i];
			}
			cdArrays = mycdArray;
			cdArrays[cdArrays.length -1] = cdAccount;
			return cdAccount;
	}
	
	public CDAccount[] getCDAccount() {
		return cdArrays;
	}
	public int getNumberOfCDAccount() {
		return cdArrays.length;
	}
	public double getCDBalance() {
		double cdBalance = 0.0;
		for(int i = 0; i < cdArrays.length; i++) {
		cdBalance += cdArrays[i].getBalance();
		}
		return cdBalance;
	}
	
	public double getCombinedBalance() {
		return (getCheckingBalance() + getSavingsBalance()+ getCDBalance());
	}
	
}