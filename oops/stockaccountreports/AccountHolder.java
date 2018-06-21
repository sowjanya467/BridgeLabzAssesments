/**
 * 
 */
package com.bridgelabz.oops.stockaccountreports;

/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since -05-17
 *
 * **************************************************************************************************/

public class AccountHolder {

	static String acHolderName;
	static int balance;
	public AccountHolder()
	{
		String name=this.acHolderName;
		int balance=this.balance;
	}
	public AccountHolder(String name,int curBalance) 
	{
		this.acHolderName=name;
		this.balance=curBalance;
		
	}

	/**
	 * @return the acHolderName
	 */
	public static String getAcHolderName() {
		return acHolderName;
	}

	/**
	 * @param acHolderName the acHolderName to set
	 */
	public static void setAcHolderName(String acHolderName) {
		AccountHolder.acHolderName = acHolderName;
	}

	/**
	 * @return the balance
	 */
	public static int getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public static void setBalance(int balance) {
		AccountHolder.balance = balance;
	}

}
