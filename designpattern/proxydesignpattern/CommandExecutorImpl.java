/**
 * 
 */
package com.bridgelabz.designpattern.proxydesignpattern;

import java.io.IOException;

/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since -05-17
 *
 * **************************************************************************************************/

public class CommandExecutorImpl implements CommandExecutor

{

	/* (non-Javadoc)
	 * @see com.bridgelabz.designpattern.proxydesignpattern.CommandExecutor#runCommand(java.lang.String)
	 */
	@Override
	public void runCommand(String cmd) throws IOException 
	{
		Runtime.getRuntime().exec(cmd);
		System.out.println("'" + cmd + "' command executed.");
		
	}
	

}
