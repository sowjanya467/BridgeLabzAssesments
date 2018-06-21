/**
 * 
 */
package algorithmprograms;

import com.bridgelabz.utility.Utility;

/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since 22-05-17
 *
 * **************************************************************************************************/

public class IntegerToBinary 
{
	public static void main(String[] args) 
	{
		System.out.println("enter the number to change in to binary");
		int number=Utility.readInteger();
		//String result=Utility.toBinary(number);
	     String result=Utility.toBinaryNum(number);
		System.out.println("binary number is"+result);
		
	}

}
