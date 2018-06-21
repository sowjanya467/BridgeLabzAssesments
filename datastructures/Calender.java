/**
 * 
 */
package com.bridgelabz.datastructures;

import com.bridgelabz.dutil.UtilityDs;

/*************************************************************************************************************
 *
 * purpose:to display the calender in 2d array
 *
 * @author sowjanya467
 * @version 1.0
 * @since 29-05-17
 *
 * **************************************************************************************************/

public class Calender {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		String[][] a = new String[6][7];
		int d = 1;
		String[] months = { " ", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				           "October", "November", "December" };
		String[] days = { " S", " M", " T", " W", "Th", " F", " Sa" };
		for (int i = 0; i < 6; i++) 
		{
			for (int j = 0; j < 7; j++) 
			{
				a[i][j] = "  ";
			}
		}
		
		for (int i = 0; i < 6; i++) 
		{
			for (int j = 0; j < 7; j++)
			{
				if (UtilityDs.checkMonth(d, m, y)) 
				{
					j = UtilityDs.dayStart(d, m, y);
					if (d < 10) {
						a[i][j] = " " + d++;
					} else {
						a[i][j] = "" + d++;
					}
				}

			}
		}

		System.out.println(months[m] + " " + y);
		System.out.println();
		for (int i = 0; i < 7; i++) 
		{
			System.out.print(days[i] + "  ");
		}
		System.out.println();
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
