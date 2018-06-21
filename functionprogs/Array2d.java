package com.bridgelabz.functionprogs;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

/*************************************************************************************************************
 *
 * purpose:To print two dimensional array of integers,string and double values
 *
 * @author sowjanya467
 * @version 1.0
 * @since 15-05-17
 *
 * **************************************************************************************************/
public class Array2d {

	public static void main(String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter row size");
	   int row=sc.nextInt();
					System.out.println("enter col size");
					int col=sc.nextInt();
					System.out.println("enter user choice");
					System.out.println("1.int");
					System.out.println("2.String");
					System.out.println("3.double");
					int choice=sc.nextInt();
			        Utility.input(row,col,choice);

	}

}
