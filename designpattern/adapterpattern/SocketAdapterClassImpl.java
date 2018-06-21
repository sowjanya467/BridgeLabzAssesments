/**
 * 
 */
package com.bridgelabz.designpattern.adapterpattern;

import com.bridgelabz.designpattern.factorypattern.socket.SocketAdapter;

/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since -05-17
 *
 * **************************************************************************************************/

public class SocketAdapterClassImpl extends Socket implements SocketAdapter {
	@Override
	public Volt get120Volt() {
		return getVolts();
	}

	@Override
	public Volt get12Volt() {
		Volt v= getVolts();
		return convertVolt(v,10);
	}

	@Override
	public Volt get3Volt() {
		Volt v= getVolts();
		return convertVolt(v,40);
	}
	
	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts()/i);
	}

}
