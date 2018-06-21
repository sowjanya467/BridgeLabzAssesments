/**
 * 
 */
package algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since 21-05-17
 *
 * **************************************************************************************************/

public class TemperatureConversion 
{
	public static void main(String[] args)
	{
		System.out.println("enter the temperature");
		double temp=Utility.readDouble();
		System.out.println("enter the choice");
		int choice=Utility.readInteger();
		Utility.temperatureConversion(temp, choice);
	}

}
