/**
 * 
 */
package algorithmprograms;

import com.bridgelabz.utility.Utility;

/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since 21-05-17
 *
 **************************************************************************************************/

public class BubbleSort {
	public static <T> void main(String[] args) {
		Integer array[]= {129,3,333,44,23,1};
		/*int size = 0;
		try 
		{
			size = Utility.readInteger();
			System.out.println("------");
		} catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		T [] array = T [size];
		for (int i = 0; i < size; i++) {
			System.out.println("enters ");
			T array[i] = Utility.readInteger();
		}*/
		String []a = {"abc","java","gfr"};
		Utility.bubbleSort( a);
		
		//Utility.printArray(a);
	}

}
