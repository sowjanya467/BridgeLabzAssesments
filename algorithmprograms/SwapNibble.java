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
 * @since 22-05-17
 *
 * **************************************************************************************************/

public class SwapNibble 
   {

	public static void main(String[] args)
	{
		String a="011001011";
		String result=Utility.swapNibbels(a);
		System.out.println("swapped result is"+result);
		int num=Utility.binaryToDecimal(a);
		System.out.println("result="+num);
	}

}
