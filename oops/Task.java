/**
 * 
 */
package com.bridgelabz.oops;

import com.bridgelabz.utility.Utility;

/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since -05-17
 *
 * **************************************************************************************************/

public class Task {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int count=0;
		/*System.out.println("enter the number of rows");
		int rows=Utility.readInteger();
		System.out.println("enter the number of coloumns");
		int col=Utility.readInteger();
		int ar [][]=new int[4][5];*/
		int ar [][]= {{0,0,0,0,0},{1,0,0,1,0},{1,0,0,0,0},{1,0,0,0,1}};
		/*for(int i=0;i<4;i++)
		{
			for(int j=0;j<5;j++)
			{
				ar[i][j]=Utility.readInteger();
			}
		}*/
		System.out.println("the array elements are");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(ar[i][j]+ " ");
			}
			System.out.println();
		}
		//Utility.printArrayElement(ar);
		
		for(int i=1;i<3;i++)
		{
			for(int j=1;j<4;j++)
			{
				if(ar[i][j]==1)
				{
				if((ar[i][j]==ar[i][j+1])||(ar[i][j]==ar[i+1][j])||(ar[i][j]==ar[i-1][j])||(ar[i][j]==ar[i][j-1])||(ar[i][j]==ar[i-1][j-1])
						||(ar[i][j]==ar[i+1][j-1])||(ar[i][j]==ar[i-1][j+1])||(ar[i][j]==ar[i+1][j+1]))
				  {
					System.out.println();

				  }
				  else {
				  count=count+1;
				  }
				}

			}

		}
		System.out.println("count= "+count);

		
	}

}
