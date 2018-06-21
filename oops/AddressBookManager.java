/**

 * 
 */
package com.bridgelabz.oops;
/*************************************************************************************************************
*
* purpose: to display a persons address book
*
* @author sowjanya467
* @version 1.0
* @since -05-17
*
* **************************************************************************************************/

import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.Utility;

@SuppressWarnings("unused")
public class AddressBookManager 
{

	static AdressBook adressBook = new Addressbook();


	public static void main(String[] args) throws IOException, ParseException 
	{

		
		new Addressbook().hello();
		System.out.println("Select an option to perform..");
		System.out.println("1. Add a person");
		System.out.println("2. update");
		System.out.println("3. Delete a person");
		System.out.println("4. Search a person");
		System.out.println("5.sort by zip");
		System.out.println("6.sort by name");
		System.out.println("7. open file");
		System.out.println("8.save the file");
		int choice = Utility.readInteger();
		//while (choice < 8)
		//{
			switch (choice) 
			{
			case 1:
				adressBook.doAdd();
				break;
			case 2:
				System.out.print("Enter first name and last name of the person to edit the contact: ");
				adressBook.userChoice(choice);
				System.out.println("\n");
				break;
			case 3:
				System.out.print("Enter first name and last name of the person to delete the contact: ");
				adressBook.userChoice(choice);
				System.out.println("\n");
				break;
			case 4:
				System.out.print("Enter first and last name of the person to search: ");
				adressBook.userChoice(choice);
				System.out.println("\n");
				break;
			case 5:
				System.out.println("sorting by zip code");
				adressBook.user(choice);
				break;
			case 6:
				System.out.println("sort by the name");
				adressBook.user(choice);
			case 7:
				System.out.println();
				adressBook.openFile();
				break;
			case 8:
				System.out.println("saving the file....");
				break;
			default:
				System.out.println("invalid entry");
				break;
			}
		
 }
	


}