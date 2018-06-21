/**
 * 
 */
package com.bridgelabz.datastructures;

import java.util.Random;

/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @param <T>
 * @since -05-17
 *
 * **************************************************************************************************/

public class Coupon<T extends Comparable <T>>{

   

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList list=new LinkedList<>();
		int c=0;
		while(c<7)
		{
		int number=randomNum();
	    // boolean a=list.search(number);
	     if(!list.search(number))
	     {
	    	 list.add(number);
	     }
	     list.display();
	     c=list.size();
	}
	}
	public static int randomNum()
	{
		Random r=new Random();
		//int low=99999;
		//int high=999999;
		int num=100000+r.nextInt(888888);
		return num;
	}

}
