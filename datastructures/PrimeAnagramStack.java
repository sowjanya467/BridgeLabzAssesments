/**
 * 
 */
package com.bridgelabz.datastructures;

import com.bridgelabz.dutil.UtilityDs;
import com.bridgelabz.utility.Utility;

/*************************************************************************************************************
 *
 * purpose: to print anagrams of range 1 to 1000 using stack
 *
 * @author sowjanya467
 * @version 1.0
 * @since 29-05-17
 *
 * **************************************************************************************************/

public class PrimeAnagramStack 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Stack s=new Stack();
		LinkedList<Integer> linkedList1=new LinkedList();
		LinkedList<Integer> linkedList2=new LinkedList();
		linkedList1=UtilityDs.findPrime(0, 1000);
		linkedList2=UtilityDs.isAnagramRange(linkedList1);
		for(int i=0;i<linkedList2.size()-1;i++)
		{
			s.push(linkedList2.getNth(i));
			
		}
		s.display();
		
		//s.display();
	}

}
