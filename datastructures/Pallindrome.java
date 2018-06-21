package com.bridgelabz.datastructures;

import com.bridgelabz.dutil.UtilityDs;
import com.bridgelabz.utility.Utility;

public class Pallindrome
{
	public static void main(String args[])
	{
		System.out.println("enter the input string");
		String string1=Utility.userInputString();
	    UtilityDs a=new UtilityDs();
	    a.pallindrome(string1);
	}
	
}
