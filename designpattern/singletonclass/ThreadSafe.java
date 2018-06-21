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

public class ThreadSafe {
private static ThreadSafe instance;
    
    private ThreadSafe(){}
    
    public static synchronized ThreadSafe getInstance(){
        if(instance == null){
            instance = new ThreadSafe();
        }
        return instance;
    }
	public static void main(String[] args) 
	{
		ThreadSafe t=getInstance();
		ThreadSafe t1=getInstance();
		System.out.println(t);
		System.out.println(t1);
	}

}
