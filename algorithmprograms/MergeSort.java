/**
 * 
 */
package algorithmprograms;
import com.bridgelabz.utility.*;
import java.util.Scanner;
/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since 15-05-17
 *
 * **************************************************************************************************/

public class MergeSort 
{
	public static void main(String[] args) 
	{
		
			        Scanner sc=new java.util.Scanner(System.in);
			        System.out.println("enter array size");
			        int size=sc.nextInt();
			        String ar[]=new String[size];
			        for(int i=0;i<size;i++)
			        {
			            ar[i]=sc.next();
			        }
			        Utility.printArrayString(ar);
			        Utility.mergeSort(ar, 0, size-1);
			        Utility.printArrayString(ar);

	}

}
