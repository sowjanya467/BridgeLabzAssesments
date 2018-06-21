/**
 * 
 */
package com.bridgelabz.designpattern.factorypattern.socket;

import com.bridgelabz.designpattern.adapterpattern.Volt;

/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since -05-17
 *
 * **************************************************************************************************/

public interface SocketAdapter
{


	public Volt get120Volt();
		
	public Volt get12Volt();
	
	public Volt get3Volt();

}
