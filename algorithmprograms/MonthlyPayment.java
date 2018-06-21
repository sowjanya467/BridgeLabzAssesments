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

public class MonthlyPayment
{
	public static void main(String[] args) 
	{
		/*for(int i=0;i<=args.length;i++)
		{
			System.out.println(args[i]);
		}*/
		
        Utility.monthlyPayment(Double.parseDouble(args[0]),(Double.parseDouble(args[1])),(Double.parseDouble(args[2])));
        
	}

}
