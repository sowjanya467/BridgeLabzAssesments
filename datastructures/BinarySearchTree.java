/**
 * 
 */
package com.bridgelabz.datastructures;

import com.bridgelabz.dutil.UtilityDs;
import com.bridgelabz.utility.Utility;

/*************************************************************************************************************
 *
 * purpose:To find the number of different binary search trees that can be created using  nodes
 *
 * @author sowjanya467
 * @version 1.0
 * @since 30-05-17
 *
 * **************************************************************************************************/

public class BinarySearchTree {
	public static void main(String[] args) {
		System.out.println("enter the number of test cases");
		int testCase=Utility.readInteger();
		UtilityDs.numberOfBST(testCase);
	}

}
