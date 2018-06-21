/**
 * 
 */
package com.bridgelabz.oops;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

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

public class StockProtfolio {

	
	    static String shareName;
	    static int sharePrice;
	    static int shareNum;
	     ArrayList<StockPojo> stockList=new  ArrayList<StockPojo>();
	 	StockPojo stock=new StockPojo();

	    public  ArrayList<StockPojo> getstockList()
	    {
			return stockList;
	    	
	    }
	    public void setstockList()
	    {
	    	stockList=this.stockList;
	    }
	    
	    
	    
	    
	    
	 /*   static StockPojo obj=new StockPojo();
		@SuppressWarnings("unchecked")
		public static void main(String[] args) {
		System.out.println("enter the number of stocks");
		int stockNum=Utility.readInteger();
		JSONArray array=new JSONArray();
		JSONObject jsonobj=new JSONObject();
		/*for(int i=0;i<stockNum;i++)
		{
			obj.setShareName(shareName);
			obj.setNumberOfShares(shareNum);
			obj.setSharePrice(sharePrice);
		  	
		}
		
		
		
		
		for(int i=0;i<stockNum;i++)
		{
		System.out.println("enter the stock name");
		String shareName=Utility.userInputString();
		System.out.println("enter the number of shares");
		int sharenum=Utility.readInteger();
		System.out.println("enter the share price");
		int shareprice=Utility.readInteger();
		//obj.getShareName();
		//obj.getNumberOfShares();
		//obj.getSharePrice();
		jsonobj.put("ShareName", shareName);
		jsonobj.put("Num of shares", sharenum);
		jsonobj.put("share price", shareprice);
	    array.add(jsonobj);
	    System.out.println(array);

		}*/
	    

	    
}
