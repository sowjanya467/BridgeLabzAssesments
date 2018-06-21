/**
 * 
 */
package com.bridgelabz.oops;

import com.bridgelabz.dutil.UtilityDs;
import com.bridgelabz.utility.Utility;

/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since -05-17
 *
 * **************************************************************************************************/

public class DeckOfCards
{

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		String[] suit= {"clubs","spades","heart","diamonds"};
		String[] rank= {"2","3","4","5","6","7","8","9","10","king","queen","ace","jack"};
		System.out.println("enter the number of players");
		int players=Utility.readInteger();
		String cards[][]=new String[suit.length][rank.length];
		UtilityDs.cards(cards, rank, suit);
		UtilityDs.shuffleCards(cards, rank, suit);
		UtilityDs.printCards(cards);
		
	}

}
