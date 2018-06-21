/**
 * 
 */
package com.bridgelabz.functionprogs;
import java.util.Scanner;

import com.bridgelabz.utility.*;

/*************************************************************************************************************
 *
 * purpose:to find the permutations of string
 *
 * @author sowjanya467
 * @version 1.0
 * @since 18-05-17
 *
 * **************************************************************************************************/

public class PermutationOfString 
{
	public static void main(String[] args)
	{
          String str = "HELLO";
		  int length = str.length();
		  Utility.findPermute(str, 0, length-1);
		  
		        
	}

}
