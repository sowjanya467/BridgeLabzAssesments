package com.bridgelabz.functionprogs;
import com.bridgelabz.utility.*;
import java.util.Scanner;
/*************************************************************************************************************
*
* purpose:To find the prime factors of a given number
*
* @author sowjanya467
* @version 1.0
* @since 19-05-17
*
* **************************************************************************************************/

public class PrimeFactors {

	public static void main(String[] args) 
	{
		System.out.println("enter num");
		int n=Utility.readInteger();
		Utility.findPrimeFact(n);

	}
}