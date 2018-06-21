/**
 * 
 */
package com.bridgelabz.designpattern.Observerdesignpatern;

/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since -05-17
 *
 * **************************************************************************************************/

public interface Observer 
{
	//method to update the observer, used by subject
		public void update();
		
		//attach with subject to observe
		public void setSubject(Subject sub);

}
