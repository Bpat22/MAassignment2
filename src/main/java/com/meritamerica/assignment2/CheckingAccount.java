/*CheckingAccount.java
 * this class holds the information about interest rate and years
 * do the calculation and return the final amount
 * this class checks the condition for deposit and withdraw amount
 */

package com.meritamerica.assignment2;

import java.text.DecimalFormat;

public class CheckingAccount extends BankAccount{

	//final static double INT_RATE = 0.0001;

	public CheckingAccount (double openingBalance) {
		//super(openingBalance; INT_RATE);
		super(openingBalance);
	}

	/*toString method format and print the output using values that was pass to the variables 
	//used \n to print statements in next lines
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00");
		return "Checking Account Balance: $" + cBalance + 
				"\nChecking Account Interest Rate: " + this.interestRate + 		
				"\nChecking Account Balance in " + this.years + " years: " + df.format(futureValue(this.years));
	}
	 */
}