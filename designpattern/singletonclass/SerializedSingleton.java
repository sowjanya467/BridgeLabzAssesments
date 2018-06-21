/**
 * 
 */
package com.bridgelabz.designpattern.singletonclass;

import java.io.Serializable;

/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since -05-17
 *
 * **************************************************************************************************/

public class SerializedSingleton implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
/*	protected Object readResolve() {
	    return getInstance();
	}*/

    private SerializedSingleton(){}
    
    private static class SingletonHelper
    {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }
    
    public static SerializedSingleton getInstance()
    {
        return SingletonHelper.instance;
    }
    
}
