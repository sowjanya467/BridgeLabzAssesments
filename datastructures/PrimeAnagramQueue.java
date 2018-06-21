/**
 * 
 */
package com.bridgelabz.datastructures;

import com.bridgelabz.dutil.UtilityDs;

/*************************************************************************************************************
 *
 * purpose:To print the prime anagrams from 1 to 1000 using queue 
 *
 * @author sowjanya467
 * @version 1.0
 * @since -05-17
 *
 * **************************************************************************************************/

public class PrimeAnagramQueue 
{

	
	public static void main(String[] args) 
	{
		Queue q=new Queue();
		LinkedList<Integer> linkedList1=new LinkedList();
		LinkedList<Integer> linkedList2=new LinkedList();
		linkedList1=UtilityDs.findPrime(0, 1000);
		linkedList2=UtilityDs.isAnagramRange(linkedList1);
		for(int i=0;i<linkedList2.size()-1;i++)
		{
			q.enQueue(linkedList2.getNth(i));
			
		}
		q.display();
	}

}
