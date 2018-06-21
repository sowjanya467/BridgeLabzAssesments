package algorithmprograms;
import com.bridgelabz.utility.Utility;

/*************************************************************************************************************
 *
 * purpose:To find the prime numbers in a given range
 *
 * @author sowjanya467
 * @version 1.0
 * @since 19-05-17
 *
 * **************************************************************************************************/

public class PrimeNumbers
{
  public static void main(String[] args) 
  {
		System.out.println("Enter the range to find prime numbers");
		int range=Utility.readInteger();
		int count=0;
		System.out.println("prime numbers are");
		Utility.checkPrimeNum(range);
   }
}
