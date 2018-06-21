/**
 * 
 */
package com.bridgelabz.designpattern.visitordesign;

/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since -05-17
 *
 * **************************************************************************************************/

public class ShoppingCartMain 
{
	public static void main(String[] args)
	{
		ItemElement[] items = new ItemElement[]{new Book(20, "12534"),new Book(100, "56758"),
				new Fruit(10, 2, "Mango"), new Fruit(5, 5, "Apple")};
		
		int total = calculatePrice(items);
		System.out.println("Total Cost = "+total);
	}

	private static int calculatePrice(ItemElement[] items)
	{
		ShoppingCartVisitor visitor = new ShoppingCartVitImpl();
		int sum=0;
		for(ItemElement item : items)
		{
			sum = sum + item.accept(visitor);
		}
		return sum;
	}


}
