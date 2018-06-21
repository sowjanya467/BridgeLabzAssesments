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
 * @since -05-17
 *
 * **************************************************************************************************/

public class GuessNumber 
{
	public static void main(String[] args) 
	{
	
		int N=Utility.readInteger();
        int n= (int) Math.pow(2, N);
        System.out.println("Think of an integer between "+0+"and "+( n-1));
        int secret = Utility.searchGuessNumber(0, N);
        System.out.println("Your number is "+secret);
}
}
