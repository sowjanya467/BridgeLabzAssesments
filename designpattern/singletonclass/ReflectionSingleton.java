/**
 * 
 */
package com.bridgelabz.designpattern.singletonclass;

import java.lang.reflect.Constructor;

/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since -05-17
 *
 * **************************************************************************************************/

public class ReflectionSingleton {

	    public static void main(String[] args) {
	        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
	        EagerInitializedSingleton instanceTwo = null;
	        try {
	            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
	            for (Constructor constructor : constructors) {
	                //Below code will destroy the singleton pattern
	                constructor.setAccessible(true);
	                instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
	                break;
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        
	        System.out.println("inst1  "+instanceOne.hashCode());
	        System.out.println("inst2  "+instanceTwo.hashCode());
	    }

	

}
