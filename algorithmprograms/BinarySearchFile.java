/**
 * 
 */
package algorithmprograms;

import java.io.IOException;

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

public class BinarySearchFile 
{
	
	public static void main(String[] args) throws IOException 
	{
		System.out.println("enter the search string");
		String word=Utility.userInputString();
		Utility.searchWord(word);
	}

}
