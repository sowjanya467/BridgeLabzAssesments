/**
 * 
 */
package com.bridgelabz.functionprogs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since 18-05-17
 *
 **************************************************************************************************/

public class CouponNumber {
	public static void main(String[] args) {
		int count = 0;
		System.out.println("enter the value n");
		int couponNO = Utility.readInteger();
		List<Integer> array = new ArrayList<>();
		Random r = new Random();
		while (array.size() < couponNO) {
			System.out.println("hi sowjanya");
			int randomNumber = r.nextInt(1000);
			count++;
			if (!array.contains(randomNumber)) {
				array.add(randomNumber);
			}
		}
		System.out.println("count=" + " " + count);

		for (int i = 0; i < couponNO; i++) {
			System.out.print(array.get(i));
		}
	}

}
