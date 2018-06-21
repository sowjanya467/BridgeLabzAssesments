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

public class StringBinarySearch 
{
    public static void main(String[] args) 
	{
    	int size=Utility.readInteger();
		String[] arrayOfString=new String[size];
		System.out.println("Enter String elements");
		for(int i=0;i<arrayOfString.length;i++) {
			arrayOfString[i]=Utility.userInputString();
		}
		String[] sortedArray=Utility.insertionSortt(arrayOfString);
		System.out.println("Enter search element");
		String searchString=Utility.userInputString();
		int low=0;
		int high=sortedArray.length-1;
		boolean result=Utility.binarySearchString(sortedArray, low, high, searchString);
		if(result) 
		{
			System.out.println("search string found");
		}
		else 
		{
			System.out.println("Search string not found");
	}
	}
}

   
