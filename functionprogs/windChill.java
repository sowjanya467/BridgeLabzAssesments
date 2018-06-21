/*************************************************************************************************************
 *
 * purpose:To find the effective temperature
 *
 * @author sowjanya467
 * @version 1.0
 * @since 15-05-17
 *
 * **************************************************************************************************/

package com.bridgelabz.functionprogs;
import java.util.Scanner;

public class windChill {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter temperature and wind speed");
	    double t=s.nextDouble();
		double v=s.nextDouble();
		if(t<50 && (v>3 && v<120))
		{
		double q=Math.pow(v, 0.16);
		double w=(35.74+0.6215)+(((0.4275*t)-35.75))*q;
		System.out.println("q="+q);
		System.out.println("w="+w);
				
		}
	}

}
