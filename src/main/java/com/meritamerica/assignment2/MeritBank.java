package com.meritamerica.assignment2;

import java.util.Arrays;
import java.util.Random;

public class MeritBank {

	public static long nextAccountNum = 0;
	public double depositAmount;
	static AccountHolder accounts[] = new AccountHolder[0];
	//static CDOffering cdOfferings[] = new CDOffering[0];
	static CDOffering[] cdOfferings = new CDOffering[0];

	public static CDAccount cdAccount[] = new CDAccount[0];


	public static long getnextAccountNum() {
		return nextAccountNum++;
	}

	public static long setNextAccountNum(long nextAccountNum) {
		return MeritBank.nextAccountNum = nextAccountNum;
	}

	public static void addAccountHolder(AccountHolder accountHolder) {
		AccountHolder[] ahnew = new AccountHolder[accounts.length + 1];
		for (int i = 0; i < accounts.length; i++) {
			ahnew[i] = accounts[i];
		}
		accounts = ahnew;
		accounts[accounts.length - 1] = accountHolder;
	}

	public static AccountHolder[] getAccountHolders() {
		return accounts;
	}

	public static CDOffering[] getCDOfferings() {
		return cdOfferings;
	}

	public static CDOffering getBestCDOffering(double depositAmount) {
		double best = 0;
		CDOffering cdOffer = null;
		if (cdOfferings == null) {
			return null;
		}
		for (int i = 0; i < cdOfferings.length; i++) {
			if (futureValue(depositAmount, cdOffer.getInterestRate(), cdOffer.getTerm()) > best){
				cdOffer = cdOfferings[i];
				best = futureValue(depositAmount, cdOffer.getInterestRate(), cdOffer.getTerm());
			}
		}
		return cdOffer;
	}

	public static CDOffering getSecondBestCDOffering(double depositAmount) {
		double secondbest = 0;
		CDOffering cdOffer = null;
		CDOffering bestOffer = null;
		if (cdOfferings == null) {
			return null;
		}
		for (int i = 0; i < cdOfferings.length; i++) {
			if (futureValue(depositAmount, cdOffer.getInterestRate(), cdOffer.getTerm()) > secondbest) {
				bestOffer = cdOffer;
				cdOffer = cdOfferings[i];
				secondbest = futureValue(depositAmount, cdOffer.getInterestRate(), cdOffer.getTerm());
			}
		}
		return cdOffer;
	}

	public static void clearCDOfferings() {
		cdOfferings = null;
	}

	public static void setCDOfferings(CDOffering[] offerings) {
		cdOfferings = offerings;
	}

	public static long getNextAccountNumber() {
		return nextAccountNum += 1;
	}

	public static double totalBalance() {
		double tBalance = 0;
		for (int i = 0; i < accounts.length; i++) {
			tBalance = accounts[i].getCombinedBalance();
		}
		return tBalance;
	}

	public static double futureValue(double presentValue, double interestRate, int term) {
		double initialValue = 0.0;
		double fValue = Math.pow(1 + interestRate, term);
		initialValue = presentValue + fValue;
		return initialValue;
	}

}
