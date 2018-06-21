/**
 * 
 */
package com.bridgelabz.oops;
/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since 05-05-17
 *
 * **************************************************************************************************/

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import com.bridgelabz.utility.Utility;

public class Addressbook implements Comparator<Object>, AdressBook 
{
	/**
	 * adding a person details
	 * 
	 */
	@Override
	public void doAdd() 
	{
		System.out.println("Enter first  name: ");
		String firstName = Utility.userInputString();
		System.out.println("enter the lastname");
		String lastName = Utility.userInputString();
		System.out.println("Enter complete address: ");
		String address = Utility.userInputString();
		System.out.println("Enter city ");
		String city = Utility.userInputString();
		System.out.println("enter the state");
		String state = Utility.userInputString();
		System.out.println("enter the zipcode");
		String zip = Utility.userInputString();
		System.out.println("Enter phone number: ");
		String phoneNumber = Utility.userInputString();

		PersonnDetails person = new PersonnDetails(firstName, lastName, address, city, state, zip, phoneNumber);
		JSONObject jsonObject = person.toJsonObject();
		printAddressBook(jsonObject);
	}

	/**
	 * Edits a person details except the name
	 * 
	 * 
	 **/
	@SuppressWarnings("unchecked")
	public void doEdit(JSONObject jsonObject, JSONArray bookArray, int i) 
	{
		System.out.println("What are the changes you want to make?");
		System.out.println("1. Address");
		System.out.println("2. Phone Number");
		int choice = Utility.readInteger();
		switch (choice) 
		{
		case 1:
			System.out.print("Enter address: ");
			String address = Utility.readString();
			System.out.print("Enter city, state and zip: ");
			String city = Utility.userInputString();
			String state = Utility.userInputString();
			String zip = Utility.userInputString();
			jsonObject.put("Address", address);
			jsonObject.put("City", city);
			jsonObject.put("State", state);
			jsonObject.put("Zip", zip);
			break;
		case 2:
			System.out.println("Enter phone number: ");
			String phoneNumber = Utility.userInputString();
			jsonObject.put("Phone Number", phoneNumber);
			break;
		}
		bookArray.remove(i);
		bookArray.add(i, jsonObject);
		saveFile(jsonObject);

		printWriter(bookArray);
		System.out.println("Contact updated successfully!!!!");
	}

	/**
	 * Deletes the person information from the address book
	 * 
	 * 
	 * @param bookArray
	 * @param i
	 */
	public void deletePerson(JSONArray bookArray, int i) 
	{
		bookArray.remove(i);
		printWriter(bookArray);
		System.out.println("Contact deleted successfully!!!!");
	}

	/**
	 * displaying a person name
	 * 
	 * @param bookArray
	 * @param position
	 */
	@SuppressWarnings("unused")
	public void displayName(JSONArray bookArray, int position) 
	{
		PersonnDetails person = new PersonnDetails(null, null);
		String fullName = null;
		for (int i = 0; i < bookArray.size(); i++) 
		{
			if (i == position)
			{
				System.out.println(fullName = person.firstName + " " + person.lastname);
			}
		}
	}

	/**
	 * sorting the address book by zipcode
	 * 
	 * @param bookArray
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ParseException
	 */
	@SuppressWarnings("unchecked")
	public void sortByZip(JSONArray bookArray) throws FileNotFoundException, IOException, ParseException 
	{
		Object obj = new JSONParser().parse(new FileReader("/home/bridgelabz/FileHolders/addressbook.json"));
		bookArray = (JSONArray) obj;

		for (int i = 0; i < bookArray.size() - 1; i++) 
		{
			for (int j = 0; j < bookArray.size() - 1 - i; j++) 
			{
				JSONObject person1 = (JSONObject) bookArray.get(j);
				JSONObject person2 = (JSONObject) bookArray.get(j + 1);
				if (person1.get("Zip").toString().compareToIgnoreCase(person2.get("Zip").toString()) > 0) 
				{
					JSONObject temp = person1;
					bookArray.set(j, person2);
					bookArray.set(j + 1, temp);
				}
			}
		}
		printWriter(bookArray);
		System.out.println("Contact sorted successfully!!!!");
	}

	/**
	 * sorting the array by first name
	 * 
	 * @param bookArray
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ParseException
	 */
	@SuppressWarnings("unchecked")
	public void sortByFirstName(JSONArray bookArray) throws FileNotFoundException, IOException, ParseException
	{
		Object obj = new JSONParser().parse(new FileReader("/home/bridgelabz/FileHolders/addressbook.json"));
		bookArray = (JSONArray) obj;
		for (int i = 0; i < bookArray.size() - 1; i++) 
		{
			for (int j = 0; j < bookArray.size() - 1 - i; j++) 
			{
				JSONObject person1 = (JSONObject) bookArray.get(j);
				JSONObject person2 = (JSONObject) bookArray.get(j + 1);
				if (person1.get("First Name").toString()
						.compareToIgnoreCase(person2.get("First Name").toString()) > 0) 
				{
					JSONObject temp = person1;
					bookArray.set(j, person2);
					bookArray.set(j + 1, temp);
				}
			}
		}
		printWriter(bookArray);
		System.out.println("Contact sorted successfully!!!!");
	}

	/**
	 * displaying a persons details
	 * 
	 * @param jsonObject
	 */
	public void displayPerson(JSONObject jsonObject) 
	{
		System.out.println("Name:\n" + jsonObject.get("First Name") + " " + jsonObject.get("Last Name"));
		System.out.println("Address:\n" + jsonObject.get("Address"));
		System.out.print(jsonObject.get("City") + ", ");
		System.out.print(jsonObject.get("State") + " - ");
		System.out.println(jsonObject.get("Zip"));
		System.out.println("Phone Number:\n" + jsonObject.get("Phone Number"));
	}

	/**
	 * switch case method for the editing,deleting and displaying persons details
	 * 
	 * @param choice
	 */
	public void userChoice(int choice) 
	{
		JSONParser parser = new JSONParser();
		String firstName = Utility.userInputString();
		String lastName = Utility.userInputString();
		JSONArray bookArray = null;
		try 
		{
			bookArray = (JSONArray) parser.parse(new FileReader("/home/bridgelabz/FileHolders/addressbook.json"));
		} 
		catch (IOException | ParseException e) 
		{
			((Throwable) e).printStackTrace();
		}

		@SuppressWarnings("rawtypes")
		Iterator iterator = bookArray.iterator();
		int i = 0;
		boolean temp = false;
		loop: while (iterator.hasNext()) 
		{
			JSONObject jsonObject = (JSONObject) iterator.next();
			if (jsonObject.get("First Name").equals(firstName) && jsonObject.get("Last Name").equals(lastName))
			{
				temp = true;
				switch (choice) 
				{
				case 2:
					doEdit(jsonObject, bookArray, i);
					break loop;
				case 3:
					deletePerson(bookArray, i);
					break loop;
				case 4:
					displayPerson(jsonObject);
					break loop;

				case 6:
					displayName(bookArray, 4);
					break loop;
				}
			}
			i++;
		}
		if (!temp) {
			System.out.println("Sorry!!! Person not found...");
		}

	}

	/**
	 * to save the address book
	 * 
	 * @param jsonObject
	 */
	public void saveFile(JSONObject jsonObject) 
	{
		printAddressBook(jsonObject);
	}

	/**
	 * method to sort by zipcode and name and to save the file
	 * 
	 * @param choice
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ParseException
	 */
	@SuppressWarnings({ "rawtypes", "unused" })
	public void user(int choice) throws FileNotFoundException, IOException, ParseException 
	{
		JSONParser parser = new JSONParser();
		JSONArray bookArray = null;
		try 
		{
			bookArray = (JSONArray) parser.parse(new FileReader("/home/bridgelabz/FileHolders/addressbook.json"));
		} catch (IOException | ParseException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Iterator iterator = bookArray.iterator();
		int i = 0;
		boolean temp = false;
		loop: while (iterator.hasNext()) 
		{
			JSONObject jsonObject = (JSONObject) iterator.next();

			switch (choice) {
			case 5:
				System.out.println("sorting by zip");
				sortByZip(bookArray);
				break;
			case 6:
				System.out.println("sorting by first name");
				sortByFirstName(bookArray);
				break;
			case 8:
				System.out.println("saving the file");
				saveFile(jsonObject);
				break;
			}
			break;
		}

	}

	/**
	 * to print the address book in to file
	 * 
	 * @param jsonObject
	 */
	@SuppressWarnings("unchecked")
	public void printAddressBook(JSONObject jsonObject) 
	{
		// ObjectMapper mapper=new ObjectMapper();
		JSONParser parser = new JSONParser();
		JSONArray bookArray = null;
		File file = new File("/home/bridgelabz/FileHolders/addressbook.json");
		if (!file.exists()) 
		{
			try 
			{
				file.createNewFile();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			bookArray = new JSONArray();
		} 
		else 
		{
			try 
			{
				bookArray = (JSONArray) parser.parse(new FileReader("/home/bridgelabz/FileHolders/addressbook.json"));
			} 
			catch (IOException | ParseException e) {
				e.printStackTrace();
			}
		}
		bookArray.add(jsonObject);

		printWriter(bookArray);
		System.out.println("Contact added successfully");
	}

	/** Writes all the data to a file **/
	public void printWriter(JSONArray bookArray) 
	{
		try 
		{
			PrintWriter printWriter = new PrintWriter("/home/bridgelabz/FileHolders/addressbook.json");
			printWriter.write(bookArray.toJSONString());
			printWriter.close();
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unused")
	public void openFile() throws IOException 
	{
		System.out.println("enter the file you want to open");
		String name = Utility.userInputString();
		File file = new File("/home/bridgelabz/FileHolders/addressbook.json");
		Desktop desktop = Desktop.getDesktop();
		if (file.exists())
			desktop.open(file);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Object o1, Object o2)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public void hello()
    {

		System.out.println("Welcome admin");
		// Thread.sleep(10000);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bridgelabz.oops.AdressBook#doEdit()
	 */
	@Override
	public void doEdit() 
	{
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bridgelabz.oops.AdressBook#deletePerson()
	 */
	@Override
	public void deletePerson() {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bridgelabz.oops.AdressBook#displayPerson(org.json.simple.JSONArray,
	 * int)
	 */
	@Override
	public void displayPerson(JSONArray bookArray, int position) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bridgelabz.oops.AdressBook#sortByZip()
	 */
	@Override
	public void sortByZip() {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bridgelabz.oops.AdressBook#sortByCode()
	 */
	@Override
	public void sortByCode() {
		// TODO Auto-generated method stub

	}
}
