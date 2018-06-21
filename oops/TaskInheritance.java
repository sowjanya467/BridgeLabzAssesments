/**
 * 
 */
package com.bridgelabz.oops;

/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since -05-17
 *
 * **************************************************************************************************/

  class A
  {
	int a=10;
	public void method()
	{
	   System.out.println("class a method");	
	
	}
}
   class B extends  A
{
	int b=12;
	public void method1()
	{
		System.out.println("class b method");
	}
}
public class TaskInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	  A a=new A();
	  a.method();
	  A a2=new B();
	  a2.method();
	  B b=new B();
	  b.method();
	  b.method1();
	  //B b1=(B) new A();
	 // b1.method();
	 // b1.method1();
	  A a1=(A) b;
	  a1.method();
	  B b1=(B) b;
	  b1.method();
	  b1.method1();
	  
	  
	}

	
}
