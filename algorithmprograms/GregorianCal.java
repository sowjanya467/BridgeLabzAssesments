package algorithmprograms;

import java.util.Calendar;

import com.bridgelabz.utility.Utility;

/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since 18-05-17
 *
 * **************************************************************************************************/

public class GregorianCal
   {

	  public static void main(String[] args)
	  {
		System.out.println("enter the date");
		Utility u=new Utility();
		int date=Utility.readInteger();
		int month=Utility.readInteger();
		int year=Utility.readInteger();
		
		
		Utility.dayOfTheWeek(year, month, date);
		
		}

}
