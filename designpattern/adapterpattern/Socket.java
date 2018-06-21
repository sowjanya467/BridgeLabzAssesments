/**
 * 
 */
package com.bridgelabz.designpattern.adapterpattern;

/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since -05-17
 *
 * **************************************************************************************************/

public class Socket 
{
	public Volt getVolts()
	{
		return new Volt(120);
	}

}
