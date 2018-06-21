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

public interface ItemElement 
{
	public int accept(ShoppingCartVisitor visitor);

}
