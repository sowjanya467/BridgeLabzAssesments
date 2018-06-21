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

public class VendingMachine {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("enter the number");
		int number=Utility.readInteger();
		int a[]= {1000,500,100,50,2,1};
		Utility.vendingMachine(number, a);
	}

}
