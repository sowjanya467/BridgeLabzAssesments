/**
 * 
 */
package com.bridgelabz.datastructures;

import com.bridgelabz.dutil.UtilityDs;

/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since 30-05-17
 *
 * **************************************************************************************************/

public class CalenderQueue <T extends Comparable<T>>{



	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		Queue a[][]=new Queue[6][];
		for(int i=0;i<6;i++)
		{
			a[i]=new Queue[7];
			for( int j=0;j<7;j++)
			{
				a[i][j]=new Queue();
			}
		}
		int d = 1;
		String[] months = { " ", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				           "October", "November", "December" };
		String[] days = { " S", " M", " T", " W", "Th", " F", " S" };
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				a[i][j].enQueue("  ");
			}
		}
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j <7; j++) {
				if (UtilityDs.checkMonth(d, m, y)) {
					j = UtilityDs.dayStart(d, m, y);
					if (d < 10) {						
						a[i][j].deQueue();
						a[i][j].enQueue(" " + d);
						d++;
					} else {
						a[i][j].deQueue();
						a[i][j].enQueue("" + d);
						d++;
					}
				}
			}
		}
		System.out.println(a[1][5].size());
		//System.out.println("printing");
		//System.out.println(a[0][6].size());
		System.out.println(months[m] + " " + y);
		System.out.println();
		for (int i = 0; i < 7; i++) {
			System.out.print(days[i] + "  ");
		}
		System.out.println();
		System.out.println("--------------------------");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
             System.out.print(a[i][j].deQueue()+ "  ");
			}
			System.out.println();
		}
	}
}

