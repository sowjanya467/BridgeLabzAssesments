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
 **************************************************************************************************/

public class StringsInsertionSort 
{
	public static void main(String[] args) 
	{
		System.out.println("enter array size");
		int size = Utility.readInteger();
		String strArray[] = new String[size];
		System.out.println("enter array elements");
		for (int i = 0; i < size; i++) {
			System.out.println("enter the value at " + i + "value");
			strArray[i] = Utility.userInputString();
		}
		String result []=Utility.insertionSortt(strArray);

		for (int i = 0; i < size; i++) {
		System.out.println(result[i]);
		}
	}
}
