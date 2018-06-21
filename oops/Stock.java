/**
 * 
 */
package com.bridgelabz.oops;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.Utility;

/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since -05-17
 *
 **************************************************************************************************/

public class Stock {

	static int sumStock = 0;
	static int totalStock;

	/**
	 * @param <ObjectMapper>
	 * @return the name
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @throws ParseException
	 */
	public static void main(String args[]) throws FileNotFoundException, IOException, ParseException
	{

		StockProtfolio protfolio = new StockProtfolio();
		@SuppressWarnings("unused")
		JSONArray stockArray = new JSONArray();
		StockPojo stock = new StockPojo();
		ObjectMapper mapper = new ObjectMapper();

		System.out.println("enter the nuber of shares");
		int stockNum = Utility.readInteger();
		for (int i = 0; i < stockNum; i++)
		{
			stock = method();
			protfolio.getstockList().add(stock);
		}

		JSONParser parser = new JSONParser();
		mapper.writeValue(new File("/home/bridgelabz/FileHolders/Stock.json"), protfolio);
		Object obj = parser.parse(new FileReader("/home/bridgelabz/FileHolders/Stock.json"));
		JSONObject jsonobject = (JSONObject) obj;
		JSONArray stock1 = (JSONArray) jsonobject.get("stockList");
		for (int i = 0; i < stock1.size(); i++) 
		{
			JSONObject objstock = (JSONObject) (stock1.get(i));
			sumStock += (Integer.parseInt(objstock.get("numberOfShares").toString()))
					* (Integer.parseInt(objstock.get("sharePrice").toString()));
			totalStock += (Integer.parseInt(objstock.get("numberOfShares").toString()));
		}
		System.out.println("total stock price =" + sumStock);
		System.out.println("total number of stocks" + totalStock);
	}

	public static StockPojo method() 
	{
		StockPojo stock = new StockPojo();
		System.out.println("enter the share name");
		String shareName = Utility.userInputString();
		stock.setShareName(shareName);
		System.out.println("enter the number of shares");
		int numberOfShares = Utility.readInteger();
		stock.setNumberOfShares(numberOfShares);
		System.out.println("enter the share price");
		int sharePrice = Utility.readInteger();
		stock.setSharePrice(sharePrice);
		return stock;

	}

	/**
	 * @return
	 */
	public Object getSymbol() 
	{
		// TODO Auto-generated method stub
		return null;
	}

}
