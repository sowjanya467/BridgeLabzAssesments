/**
 * 
 */
package com.bridgelabz.functionprogs;

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

public class GenericSample 
{
   public static <T> void main(String[] args) 
   {
	  int a=Utility.readInteger();
	  int b=Utility.readInteger();
	  int c=Utility.readInteger();
	  //String a="asdf";
	  //String b="acre";
	  //String c="abcs";
	  
	  System.out.println(findMax(a,b,c));
		
	}
    public static  <T extends Comparable<T>> T findMax(T num1,T num2,T num3)
   {
	   
	   return (num1.compareTo(num2)<0)? ((num1.compareTo(num3)<0)? num1:num2):num3;
   }
}
