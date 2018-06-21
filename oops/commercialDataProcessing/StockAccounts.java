/**
 * 
 */
package com.bridgelabz.oops.commercialDataProcessing;

import java.awt.List;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.datastructures.LinkedList;
import com.bridgelabz.datastructures.Queue;
import com.bridgelabz.datastructures.Stack;
import com.bridgelabz.oops.Stock;
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

public class StockAccounts 
{

	ArrayList<Stocks> list = new ArrayList<Stocks>();
	File file;
	final ObjectMapper map = new ObjectMapper();
	final File FILEPATH = new File("/home/bridgelabz/FileHolders/data.json");
	Queue queue = new Queue();
	Stack stack = new Stack();

	/**
	 * @param filename
	 * @throws IOException
	 */
	public StockAccounts(String filename) throws IOException 
	{
		file = new File("/home/bridgelabz/FileHolders/data.json");

		System.out.println("path-->" + file.getAbsolutePath());
		try 
		{
			file.createNewFile();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * @param companyShares
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public JSONObject toJsonObject(Stocks companyShares) 
	{
		JSONObject obj = new JSONObject();

		obj.put("symbol", companyShares.getSymbol());
		obj.put("numberOfShares", companyShares.getNoOfShares());
		obj.put("price", companyShares.getPrice());
		obj.put("Value", companyShares.getValue());
		obj.put("dateTime", companyShares.getDateTime());
		return obj;
	}

	/**
	 *
	 */
	public StockAccounts()
	{
		super();
	}

	public JSONArray readFromFile(String filePath)throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException 
	{
		JSONParser parser = new JSONParser();
		JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(filePath));
		return jsonArray;
	}

	public void writeIntoFile(JSONArray jsonArray, String filePath)
			throws JsonGenerationException, JsonMappingException, IOException 
	{

		map.writeValue(new File(filePath), jsonArray);
	}

	public Stocks makeCompanySharesObject() {

		Stocks companyShares = new Stocks();
		System.out.println("Enter the symbol of shares:");
		String symbol = Utility.userInputString();
		companyShares.setSymbol(symbol);
		System.out.println("Enter the number of shares:");
		int numberOfShares = Utility.readInteger();
		companyShares.setNoOfShares(numberOfShares);
		String dateTime = new SimpleDateFormat("dd/MM/yyyy").format(new Date(numberOfShares));
		companyShares.setDateTime(dateTime);
		System.out.println("Enter the price of share:");
		double price = Utility.readDouble();
		companyShares.setPrice(price);
		return companyShares;
	}

	private void updateNewAccount(String filePath, String symbol, int buyShares, double amount) throws IOException 
	{
		FileWriter filewriter = new FileWriter(filePath);
		BufferedWriter bw = new BufferedWriter(filewriter);
		String fileData = "shares of " + symbol + "\n" + "total shares present " + buyShares + "\n"
				+ "amount remaining " + amount + "\n" + "DateTime  " + LocalDateTime.now() + "\n" + "\n";
		bw.write(fileData);
		bw.flush();
		bw.close();
	}

	public void printEntries(String filePath)
			throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException 
	{
		JSONArray array = readFromFile(filePath);
		for (int i = 0; i < array.size(); i++)
		{
			System.out.println(array.get(i));
		}
	}

	@SuppressWarnings("unchecked")
	public void sell(String filePath, String newAccountPath)
			throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException 
	{
		printEntries(filePath);
		Stocks companyShares = makeCompanySharesObject();
		JSONObject jsonObject = toJsonObject(companyShares);
		stack.push((String) jsonObject.get("symbol"));
		JSONArray jsonArray = readFromFile(filePath);
		System.out.println(jsonArray);
		jsonArray.add("array-->" + jsonObject);
		writeIntoFile(jsonArray, filePath);
		writeIntoFile(jsonArray, newAccountPath);
		System.out.println("\n Your shares added to  account successfully");
		System.out.println("\n Symbol added to  stack..");
		stack.display();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String date = dateFormat.format(new Date(0));
		queue.enQueue(date);
		System.out.println("\n DateTime added to queue!!");
		queue.display();

	}

	public void buy(int amount, String symbol, String filePath, String newAccountFilePath)
			throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException {
		JSONArray array = readFromFile(filePath);
		System.out.println(array);
		System.out.println(" enter the number of shares you want to buy?");
		int buyShares = Utility.readInteger();
		for (int i = 0; i < array.size(); i++) {
			JSONObject temporary = (JSONObject) array.get(i);
			System.out.println(temporary);
			if (symbol.equals(temporary.get("symbol"))) {

				long temp = (long) temporary.get("numberOfShares") - buyShares;
				temporary.put("numberOfShares", temp);
				array.remove(i);
				array.add(i, temporary);
				amount = (int) (amount - (buyShares * (long) temporary.get("price")));
				writeIntoFile(array, filePath);
				updateNewAccount(newAccountFilePath, symbol, buyShares, amount);
				stack.push((String) temporary.get("symbol"));
				System.out.println("\n  Symbol pushed to the Stack");
				stack.display();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				String date = dateFormat.format(new Date(temp));
				queue.enQueue(date);
				System.out.println("\n DateTime added to queue!!");
				queue.display();
				break;
			}
		}

	}

	public void createNewFile(String filePath) throws IOException {
		File file = new File(filePath);
		// Create the file
		if (file.createNewFile()) {
			System.out.println("File  created!");
		} else {
			System.out.println("File  exists.");
		}
		return;
	}
}
