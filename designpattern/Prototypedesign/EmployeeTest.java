/**
 * 
 */
package com.bridgelabz.designpattern.Prototypedesign;

import java.util.ArrayList;

/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since -05-17
 *
 * **************************************************************************************************/

public class EmployeeTest 
{
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Employee emps = new Employee();
		emps.loadData();
		
		//Use the clone method to get the Employee object
		Employee empsNew = (Employee) emps.clone();
		Employee empsNew1 = (Employee) emps.clone();
		ArrayList<String> list = empsNew.getEmpList();
		list.add("Pardhu");
		ArrayList<String> list1 = empsNew1.getEmpList();
		list1.remove("Sowjanya");
		
		System.out.println("emps List: "+emps.getEmpList());
		System.out.println("empsNew List: "+list);
		System.out.println("empsNew1 List: "+list1);
}

}
