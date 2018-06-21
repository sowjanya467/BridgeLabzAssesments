/**
 * 
 */
package com.bridgelabz.oops;

import com.bridgelabz.datastructures.LinkedList;
import com.bridgelabz.dutil.UtilityDs;

/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since -05-17
 *
 **************************************************************************************************/

public class DeckOfcardsqueue 
{
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) 
	{

		String[] suit = { "clubs", "spades", "heart", "diamonds" };
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "king", "queen", "ace", "jack" };
		int index = 0;
		LinkedList[] cards = new LinkedList[52];
		for (int i = 0; i < cards.length; i++)
		{
			cards[i] = new LinkedList();
		}
		for (int i = 0; i < suit.length; i++) 
		{
			for (int j = 0; j < rank.length; j++) 
			{
				cards[index++].add(rank[j] + " " + suit[i]);
			}
		}
		String[][] players = UtilityDs.distributeCards(cards);
		UtilityDs.printCards(players);
		LinkedList[] arrange = UtilityDs.rearrange(players);
		UtilityDs.showBySortedOrder(arrange);
	}
}
