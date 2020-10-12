/*MeritAmericaBAnkApp.java
 * this is the main class for this app
 * 
 */

package com.meritamerica.assignment2;

public class MeritAmericaBankApp {

	//main method takes the input and calls the functions
	//print the output using values that was pass to the variables
	public static void main(String[] args) {

		System.out.println("Hello, Java Cohort");

		MeritBank.getCDOfferings()[0]=new CDOffering(1, .018);
		MeritBank.getCDOfferings()[1]=new CDOffering(1, .019);
		MeritBank.getCDOfferings()[2]=new CDOffering(1, .020);
		MeritBank.getCDOfferings()[3]=new CDOffering(1, .025);
		MeritBank.getCDOfferings()[4]=new CDOffering(1, .022);
	
	
		//first Account Holder
		AccountHolder ah1 = new AccountHolder("John", "Joe", "Doe", "123-45-6789");

		ah1.addCheckingAccount(1000);
		ah1.addSavingsAccount(10000);

		ah1.addCheckingAccount(5000);
		ah1.addSavingsAccount(50000);

		ah1.addCheckingAccount(50000);
		ah1.addSavingsAccount(500000);

		ah1.addCheckingAccount(50000);
		ah1.addSavingsAccount(500000);

		if (ah1.getCombinedBalance()>250000) {
			System.out.println("Balance over 250000. Can not Open another account");
		}
		ah1.addCDAccount(MeritBank.getBestCDOffering(0), 0);
		MeritBank.addAccountHolder(ah1);

		//second Account Holder
		AccountHolder ah2 = new AccountHolder("Mary", "Jane", "Parker"," 987-65-4321");

		ah2.addCheckingAccount(1000);
		ah2.addSavingsAccount(10000);


		ah2.addCDAccount(MeritBank.getSecondBestCDOffering(0), 0);
		MeritBank.addAccountHolder(ah2);

		MeritBank.clearCDOfferings();
		
		//third Account Holder
		AccountHolder ah3 = new AccountHolder("North", "West", "Morgan", "456-32-1789");
		
		ah3.addCDAccount(MeritBank.getSecondBestCDOffering(0), 0);

		if (ah3.getNumberOfCDAccount()>0) {
			System.out.println(" Account not created");
			
			}

		ah3.addCheckingAccount(1000);
		ah3.addSavingsAccount(10000);	
		
		MeritBank.addAccountHolder(ah3);
		
		MeritBank.totalBalance();
		System.out.println(MeritBank.totalBalance());
		

	}
}