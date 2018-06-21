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

public interface ShoppingCartVisitor
{
	int visit(Book book);
	int visit(Fruit fruit);
	/**
	 * @param fruit
	 * @return
	 */

}
