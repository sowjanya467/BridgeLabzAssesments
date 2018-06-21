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
 **************************************************************************************************/

public class QueueMain 
{
	public static void main(String args[]) 
	{
		System.out.println("enter the cash availabel in bank");
		int bankCash = Utility.readInteger();
		System.out.println("enter the number of customers you want to enter first");
		int number = Utility.readInteger();
		Queue q = new Queue();
		for (int j = 0; j < number; j++) {
			q.enQueue(j);
		}
		q.display();
		for (int k = 0; k < number; k++) {
			System.out.println("do you want to withdrawl or deposit the money");
			System.out.println("enter 1.withdrawl 2.deposit");
			int choice = Utility.readInteger();
			switch (choice) {
			case 1:
				System.out.println("enter the amount you want to withdraw");
				int withdraw_amount = Utility.readInteger();
				if (bankCash > withdraw_amount) {
					bankCash = bankCash - withdraw_amount;
					System.out.println("bank cash= " + bankCash);
					q.deQueue();
				} else {
					System.out.println("cash unavailable");
					q.deQueue();
				}
				break;
			case 2:
				System.out.println("enter the amount you want to deposit");
				int deposit = Utility.readInteger();
				bankCash = bankCash + deposit;
				System.out.println("available bank cash=" + bankCash);
				q.deQueue();
				break;
			}

		}
	}

}
