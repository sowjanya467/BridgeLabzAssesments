/**
 * 
 */
package com.bridgelabz.oops;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;

/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since -05-17
 *
 * **************************************************************************************************/

public interface AdressBook
{
	public static final Addressbook ab=new Addressbook();
	public void doAdd();
    void doEdit();
	void deletePerson();
	void displayPerson(JSONArray bookArray,int position);
	void sortByZip();
	void sortByCode();
	/**
	 * @param choice
	 */
	public void userChoice(int choice);
	/**
	 * @param choice
	 * @throws ParseException 
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public void user(int choice) throws FileNotFoundException, IOException, ParseException;
	/**
	 * @throws IOException 
	 * 
	 */
	public void openFile() throws IOException;

}
