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
 * **************************************************************************************************/

public class BinarySearch 
{
    public static void main(String args[])
    {
        Integer arr[] = {40,50,2,3,20};
        int size = arr.length;
        Utility.insertionSort(arr);
        Utility.printArray(arr);
        int x = 20;
        int result = Utility.binarySearch(arr,0,size-1,x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + 
                                                 result);
    }
}


