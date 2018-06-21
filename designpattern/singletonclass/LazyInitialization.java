/**
 * 
 */
package com.bridgelabz.designpattern.singletonclass;

/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since -05-17
 *
 **************************************************************************************************/

public class LazyInitialization {
	private static LazyInitialization instance;

	private LazyInitialization() {
	}

	public static LazyInitialization getInstance() 
	{
		if (instance == null) 
		{
			instance = new LazyInitialization();
		}
		return instance;
	}

	public static void main(String args[]) {
		LazyInitialization l = getInstance();
		System.out.println(l);
		LazyInitialization l1 = getInstance();
		System.out.println(l1);
	}

}
