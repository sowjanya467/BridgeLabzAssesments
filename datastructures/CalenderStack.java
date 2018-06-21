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
 * @since -05-17
 *
 * **************************************************************************************************/

public class CalenderStack <T extends Comparable<T> >{
	
	

		@SuppressWarnings("rawtypes")
		public static <T>void main(String[] args) {
			int m = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			Stack list[][] = new Stack[6][];
			for (int i = 0; i < 6; i++) {
				list[i] = new Stack[7];
				for (int j = 0; j < 7; j++) {
					list[i][j] = new Stack();
				}
			}

			Stack a[][] = new Stack[6][];
			for (int i = 0; i < 6; i++) {
				a[i] = new Stack[7];
				for (int j = 0; j < 7; j++) {
					a[i][j] = new Stack();
				}
			}
			int d = 1;
			String[] months = { " ", "January", "February", "March", "April", "May", "June", "July", "August", "September",
					"October", "November", "December" };
			String[] days = { " S", " M", " T", " W", "Th", " F", " S" };
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 7; j++) {
					list[i][j].push("  ");
				}
			}

			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 7; j++) {
					if (UtilityDs.checkMonth(d, m, y)) {
						j = UtilityDs.dayStart(d, m, y);
						if (d < 10) {
							list[i][j].pop();
							list[i][j].push(" " + d);
							d++;
						} else {
							list[i][j].pop();
							list[i][j].push("" + d);
							d++;
						}
					}
				}
			}
             
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 7; j++) {
					a[i][j].push((Comparable) list[i][j].pop());
				}
			}

			
			System.out.println(months[m] + " " + y);
			System.out.println();
			for (int i = 0; i < 7; i++) {
				System.out.print(days[i] + "  ");
			}
			System.out.println();
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 7; j++) {
					System.out.print(a[i][j].pop() + "  ");
				}
				System.out.println();
			}

		}

	

}
