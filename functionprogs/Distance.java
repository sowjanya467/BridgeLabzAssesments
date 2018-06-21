/*************************************************************************************************************
 *
 * purpose:To find the Eucildean distance
 *
 * @author sowjanya467
 * @version 1.0
 * @since 19-05-17
 *
 * **************************************************************************************************/

package com.bridgelabz.functionprogs;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;
public class Distance 
{
    public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		Utility.findEucildeanDistance(x, y);
	}
}
