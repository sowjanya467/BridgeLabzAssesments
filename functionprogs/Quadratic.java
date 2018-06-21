package com.bridgelabz.functionprogs;
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
public class Quadratic 
{
	public static void main(String[] args)
	{
      System.out.println("enter the coefficients of ax*x+bx+c");
      int a=Utility.readInteger();
      int b=Utility.readInteger();
      int c=Utility.readInteger();
      Utility.findQuadraticRoots(a, b, c);
}
}
