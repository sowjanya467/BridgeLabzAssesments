
package com.bridgelabz.functionprogs;
import com.bridgelabz.utility.*;
import java.util.Scanner;

/*************************************************************************************************************
 *
 * purpose:To find Harmonic number
 *
 * @author sowjanya467
 * @version 1.0
 * @since 15-05-17
 *
 * **************************************************************************************************/
public class Harmonic {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int n=sc.nextInt();
		Utility.findHarmonicNum(n);
	}

}
