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
 * **************************************************************************************************/

public class EagerInitializedSingleton 
{
	    
	    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
	    
	    //private constructor to avoid client applications to use constructor
	    private EagerInitializedSingleton(){}

	    public static EagerInitializedSingleton getInstance()
	    {
	        return instance;
	    }
	
       public static void main(String [] args)
       {
    	   EagerInitializedSingleton es=getInstance();
    	   System.out.println(es);
    	   EagerInitializedSingleton es1=getInstance();
           System.out.println(es1);
    	   
       }
       
}
