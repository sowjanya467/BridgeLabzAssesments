/**
 * 
 */
package com.bridgelabz.datastructures;

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

public class StackMain 
{
	/**
	 * @param args
	 */
	@SuppressWarnings("rawtypes")
	public static void main(String[] args)
	{
		String str=new String();
		System.out.println("enter the arthemetic expression");
		String input=Utility.userInputString();
		System.out.println("Input is  "+input);
		Stack s=new Stack();
		int count=0;
		char [] array=input.toCharArray();
		System.out.println("length"+array.length);
		boolean inValidExpression=false;
	
		for(int i=0;i<input.length();i++ )
		{
		  if(array[i]=='(')
		  {
			 Comparable data='(';
			 s.push(data);
			 count++;
		  }
		  else if(array[i]==')')
		  {
			 
			s.pop();
			/*if(ar==null)
			{
               inValidExpression =true;
               break;
			}*/
			count--;
		  }
		}
		  if(inValidExpression)
		  {
			  System.out.println("invalid expression ");
		  }
		   System.out.println("the output is"+count);
		  if(count==0)
		  {
			  System.out.println("the arthemetic expression is balanced");
		  }
		  else
		  {
			  System.out.println("the expression is not balanced");
		  }
		
	}

}
