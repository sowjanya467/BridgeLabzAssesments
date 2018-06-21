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

public class StaticBlockInitialization {


private static StaticBlockInitialization instance;
    
    private StaticBlockInitialization(){}
    
    public static StaticBlockInitialization getInstance()
    {
        if(instance == null){
            instance = new StaticBlockInitialization();
        }
        return instance;
    }
	public static void main(String[] args) 
	{
		StaticBlockInitialization sb=getInstance();
		System.out.println(sb);
	}

}
