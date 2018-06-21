/**
 * 
 */
package com.bridgelabz.oops.commercialDataProcessing;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

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

public class User {

	  public static void main(String[] args) throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException {
	        User companyManager=new User();
	        companyManager.askUser();
	   
	    }
	    public void askUser() throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException{
	     
	        StockAccounts stockData=new StockAccounts();
	        System.out.println(" Enter your name:");
	        String name=Utility.userInputString();
	        System.out.println("Enter the file name");
	        String filename=Utility.userInputString();
	        String path="/home/bridgelabz/FileHolders/data.json"+filename;
	        stockData.createNewFile(path);
	      
	        System.out.println("Operations u want 2 perform");
	        System.out.println("1.Buy ");
	        System.out.println("2. Sell ");
	        System.out.println("3. Quit");
	        int choice=Utility.readInteger();
	      
	        String filePath="/home/bridgelabz/FileHolders/data.json";
	        switch (choice) {
	        case 1:
	            stockData.printEntries(filePath);
	            System.out.println("Which symbol do you want to buy?");
	            String symbol=Utility.userInputString();
	            System.out.println("How much amount you have?");
	            int amount=Utility.readInteger();
	            stockData.buy(amount, symbol,filePath,path);
	            askUser();
	            break;
	        case 2:
	            stockData.sell(filePath,path);
	            askUser();
	            break;
	        default:
	        	System.out.println("invalid!!!");
	            break;
	        }
	    }
	

}
