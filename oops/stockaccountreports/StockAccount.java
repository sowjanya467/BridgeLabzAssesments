/**
 * 
 */
package com.bridgelabz.oops.stockaccountreports;

import java.io.File;
import java.io.IOException;

import com.bridgelabz.utility.Utility;

/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since -05-17
 *
 * **************************************************************************************************/

public class StockAccount 
{
	
	public static void stockAccount()
	{
		System.out.println("enter the file name");
		String fileName=Utility.userInputString();
	}
	public static void stockAccountHolder(String file)
	{
		File file1=new File("/home/bridgelabz/FileHolders/Stock.json");
		if(!file1.exists())
		{
			try 
			{
				file1.createNewFile();
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public static void createAccount()
	{
		AccountHolder acHolder=new AccountHolder();
		System.out.println("enter the account holder name");
		String acName=Utility.userInputString();
		acHolder.setAcHolderName(acName);
		System.out.println("enter the current balance");
		int balance=Utility.readInteger();
		acHolder.setBalance(balance);
		System.out.println("enter the number of shares");
		int shares=Utility.readInteger();
		
	}
	public static void main(String[] args) 
	{
		

	}

}
