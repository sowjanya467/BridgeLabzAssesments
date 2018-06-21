/**
 * 
 */
package com.bridgelabz.oops;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.bridgelabz.dutil.*;
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

public class RegularExperssion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String message="Hello <<name>>,We have your full name as <<fullname>> in our system and your"
				+ " contact number as 91-<<xxxxxxxxxx>>"
				+ "please let us know for any clarification.Thank you BridgeLabz.<<31/01/2018>>";
		System.out.println(message);
		System.out.println("enter the user name");
		String name=Utility.userInputString();
		System.out.println("enter the contact number");
		String number=Utility.userInputString();
		System.out.println("enter the full name");
		String fullName=Utility.userInputString();
		SimpleDateFormat dateformat=new SimpleDateFormat("dd/mm/yyyy");
		String date=dateformat.format(new Date());
		String modifiedMsg=UtilityDs.replaceRegExp1(message,name,fullName,number, date);
		System.out.println(modifiedMsg);
		
	}

}
