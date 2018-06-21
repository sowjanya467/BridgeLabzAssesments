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
 * @since 15-05-17
 *
 * **************************************************************************************************/

public class Anagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int count=0;
		int temp=0;
		System.out.println("enter the string1:");
		String str1=Utility.userInputString();
		System.out.println("enter the string2:");
		String str2=Utility.userInputString();
		boolean result=Utility.isAnagram(str1, str2);
		
				if(result)
				{
					System.out.println("these are  anagrams");
				}
				else
				{
					System.out.println("these are not anagrams");
				}

				

		

	}

}
