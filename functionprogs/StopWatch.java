package com.bridgelabz.functionprogs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

/*************************************************************************************************************
 *
 * purpose:to print the elapsed time in stop watch
 *
 * @author sowjanya467
 * @version 1.0
 * @since 18-05-17
 *
 * **************************************************************************************************/

public class StopWatch
{
		public static void main(String[] args)
		{
			Utility utility = new Utility();

			long elapsedTime = utility.findElapseTime();
	         System.out.println("Stop watch elapsed time: " + elapsedTime);
          }
}