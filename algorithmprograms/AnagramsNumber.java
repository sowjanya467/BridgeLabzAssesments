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

public class AnagramsNumber
{
	public static void main(String[] args) 
	{
    int count=0;
	int temp=0;
	System.out.println("enter the string1:");
	String str1=Utility.userInputString();
	System.out.println("enter the string2:");
	String str2=Utility.userInputString();
	int lengthOfStr1=str1.length();
	int lengthOfStr2=str2.length();
	if(lengthOfStr1==lengthOfStr2)
	{
		for(int i=0;i<lengthOfStr1;i++)
		{
			int len=lengthOfStr1;
			for(int j=0;j<len;j++)
			{
				if(str1.charAt(i)==str2.charAt(j))
				{
					count++;
				}
			}
				
			}
			if(count==lengthOfStr1)
			{
				System.out.println("these are  anagrams");
			}
			else
			{
				System.out.println("these are not anagrams");
			}

			}

	
		
	}

}
