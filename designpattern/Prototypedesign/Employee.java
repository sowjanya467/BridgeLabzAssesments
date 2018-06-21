/**
 * 
 */
package com.bridgelabz.designpattern.Prototypedesign;

import java.awt.List;
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

public class Employee implements Cloneable 
{
private ArrayList<String> empList;
	
	public Employee()
	{
		empList = new ArrayList<String>();
	}
	
	public Employee(ArrayList<String> list)
	{
		this.empList=list;
	}
	public void loadData()
	{
		//read all employees from database and put into the list
		empList.add("Sowjanya");
		empList.add("Priya");
		empList.add("Moni");
		empList.add("Kiranmai");
	}
	
	public ArrayList<String> getEmpList() {
		return empList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
			ArrayList<String> temp = new ArrayList<String>();
			for(String s : this.getEmpList()){
				temp.add(s);
			}
			return new Employee(temp);
	}
}
