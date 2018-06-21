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

public class ThreadsafeDoublelocking {
	private static ThreadsafeDoublelocking instance;

	public static ThreadsafeDoublelocking getInstanceUsingDoubleLocking()
	{
	    if(instance == null){
	        synchronized (ThreadsafeDoublelocking.class) {
	            if(instance == null){
	                instance = new ThreadsafeDoublelocking();
	            }
	        }
	    }
	    return instance;
	}
	public static void main(String[] args)
	{
		ThreadsafeDoublelocking t=getInstanceUsingDoubleLocking();
		System.out.println(t);
		

	}

}
