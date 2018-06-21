package com.bridgelabz.utility;
import com.bridgelabz.datastructures.LinkedList;
import com.bridgelabz.datastructures.Queue.Node;
import com.bridgelabz.functionprogs.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
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

public class Utility 
{
	static Scanner sc = new Scanner(System.in);

	public static void leap(int year) {
		if (year >= 1582) {
			if (year % 400 == 0)
				System.out.println("it is the leap year");
			else if (year % 100 == 0)
				System.out.println("it is not leap year");
			else if (year % 4 == 0)
				System.out.println("it is the leap year");
			else
				System.out.println("it is not leap year");
		}
	}
	//to find the prime factors of a number
	
	public static void findPrimeFact(int number)
	{ 
		int i=2;
		while(number>1)
		{
			if(number%i==0)
			{
				System.out.println(i);
				number=number/i;
			}
			else
				i++;
			}
		}
	//method to find harmonic number
	public static void findHarmonicNum(int num)
	{
		double result=1;
		for(double i=1;i<=num;i++)
		{
			result=result+(1/i);
		}
		System.out.println(result);
	}
	/**
	 * 
	 * @param to find sum of three elements
	 */
	
	public static void sumOfThree(int [] a,int length)
	{
	int count=0;
	int sum=0;
	for(int i=0;i<length;i++)
	{
		for(int j=i+1;j<length-1;j++)
		{
			for(int k=j+1;k<length;k++)
			{
				if(a[i]+a[j]+a[k]==0)
					count++;
				sum=a[i]+a[j]+a[k];
				System.out.println("sum="+sum);
			}
		}
	}
	System.out.println("sum of 3 integers is 0");
	System.out.println("count="+count);
	}
	
 /**
	 * @param method to find power of a number
	 */
	public static void findPowerMethod(int num) 
	{
		double i=2;
		for(int j=0;j<=num;j++)
		{
			i=Math.pow(2, j);
			System.out.println(i);
		}
	}
	 /**
	 * 
	 * @param to find eucildean distance
	 */
	public static void findEucildeanDistance(int x,int y)
	 {
			double d1=Math.pow(x, 2);
			double d2=Math.pow(y, 2);
			double d=Math.sqrt(d1+d2);
			System.out.println("distance="+d);

	 }
	/**
	 * @parm to replace a string
	 */
	public String getString() 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your input");
		return scanner.nextLine();
	}
	/**
	 * method to find permutations of a string
	 */
	public static void findPermute(String str,int start,int end)
	{
        if (start == end)
            System.out.println(str);
        else
        {
            for (int i = start; i <= end; i++)
            {
                str = swap(str,start,i);
                findPermute(str, start+1, end);
                str = swap(str,start,i);
            }
	     
	       }
	}
	//function to swap the elements in a string
	public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
	/**
	 * 
	 * @param to find stop time
	 */
	
		

	

		// TODO Auto-generated method stub
		
	public long findElapseTime()
	{
		System.out.println(" the start time, type start");
		userInputString();
		long startTime = System.currentTimeMillis();
		System.out.println("The end time, type end ");
		userInputString();
		return System.currentTimeMillis() - startTime;
	}

	/**
	 * public static void main(String args[])
	{
		UtilityDs u=new UtilityDs();
		u.addFirst(2);
		

	}
	/**
	 * @param i
	 */
	
	public static String userInputString()
	{
		return sc.nextLine();
	}
	/**
	 * 
	 */

	public static void stopWatch(long startTime,long endTime)
	{
	    long elapsedTime=endTime-startTime;
		int minutes=(int) (elapsedTime/60);
		int hours=minutes/60;
		int seconds=minutes%60;
		System.out.println("the elapsed time is" +hours +" hours"+" " +minutes+" "+"minutes "+seconds+" seconds");
	}
	
	/**
	 * 
	 * @param to find quadratic roots of a equation
	 */
	
	public static void findQuadraticRoots(int a,int b,int c)
	{
		double delta=b*b-4*a*c;
	    double Root1 = (-b + sqrt(delta))/(2*a);
	    double Root2= (-b - sqrt(delta))/(2*a);
	    System.out.println("delta is="+delta);
	    System.out.println("Root1="+Root1);
	    System.out.println("Root2="+Root2);
	  }
	/**
	 * 
	 * @param to find square root of a number
	 */
		public static double sqrt(double x)
		{
			double i=1,res=1;
			while(res<=x)
			{
				i++;
				res=i*i;
				
			}
			return i-1;
		}
		
	/**
	 * 
	 * @param method to check it is prime number or not
	 * @return 
	 */
	public static boolean checkPrimeNum(int num)
	{
		
		ArrayList <Integer> primeNum=new ArrayList();
		int array[]=new int[1000];
		
		
		for(int i=2;i<num;i++)
		{
			int count=0;
			for(int j=i;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
             
			if(count==2)
			{
				//array[100]=i;
				System.out.println(i+" ");
			}
			}
				/*for(i=0;i<array.length;i++)
				{
					System.out.print(i+" ");
				}*/
				/*primeNum.add(i);
				for(Integer primenumber:primeNum)
				{
					System.out.println("prime no "+primenumber+" ");
				
				//checkPallindrome(i);
				}*/
			
		}
		return false;
		
		}
	
	public static void checkPallindrome(int i)
	{
		int j=0;
		int num=i;
		while(i>0)
		{	
		   int r=i%10;
		   j=(j*10)+r;
		   i=i/10;
		}
		if(num==j)
		{
			System.out.println("pallindrome="+j);
		}
	}
	
	/**
	 * 
	 * @param function to print 2 dimentional array
	 */
	public static void input(int row,int col,int choice)
	{
		Scanner sc=new Scanner(System.in);
		switch(choice)
		{
		case 1:int[][] intAr=new int[row][col];
		System.out.println("enter the elements of array");
	    for(int i=0;i<intAr.length;i++)
		{
			for(int j=0;j<intAr.length;j++)
			{
				intAr[i][j]=sc.nextInt();
			}
		}
		System.out.println("array elements are");
		printArrayElement(intAr);
		break;
		case 2:String [][] strAr=new String[row][col];
		System.out.println("enter the elements of array");
	    for(int i=0;i<strAr.length;i++)
		{
			for(int j=0;j<strAr.length;j++)
			{
				strAr[i][j]=sc.next();
			}
		}
		System.out.println("array elements are");
		printArrayElement(strAr);
		break;
		case 3:double[][] doubleAr=new double[row][col];
		System.out.println("enter the elements of array");
	    for(int i=0;i<doubleAr.length;i++)
		{
			for(int j=0;j<doubleAr.length;j++)
			{
				doubleAr[i][j]=sc.nextInt();
			}
		}
		System.out.println("array elements are");
		printArrayElement(doubleAr);
		break;
		}
	}
	public static  void printArrayElement(int[][] ar)
	{
		for(int i=0;i<=ar.length;i++)
		{
			for(int j=0;j<=ar.length;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();;
		}
	}
	public static  void printArrayElement(String[][] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();;
		}
	}
	public static  void printArrayElement(double[][] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();;
		}
	}
	//insertion sort
		public static  <T extends Comparable<T>> void  insertionSort(T array[])
        {
            int n = array.length;
            for (int i=1; i<n; ++i)
            {
                T key = array[i];
                int j = i-1;
                while (j>=0 &&  (array[j].compareTo(key)>0))
                {
                    array[j+1] = array[j];
                    j--;
                }
                array[j+1] = key;
            }
            for(int k=0;k<n;k++)
            {
            	
            }
			
        }
		/* A utility function to print array of size n*/
        public static <T extends Comparable<T> >void printArray(T[] a)
        {
            int n = a.length;
            for (int i=0; i<n; ++i)
                System.out.print(a[i] + " ");
        }
        //method for string insertion sort
        public static <T extends Comparable<T>> T [] insertionSortt(T []strAr )
        {
            for(int i=1;i<strAr.length;i++)
            {
                T index=strAr[i];
                int j=i-1;
                while(j>=0&&strAr[j].compareTo(index)>0)
                {
                    strAr[j+1]=strAr[j];
                    j=j-1;
                }
                strAr[j+1]=index;
            }
			return strAr;
            
        }
        
        
        //binary search
        public static <T extends Comparable<T>> int binarySearch(Integer[] arr, int first, int last, int searchElement)
        {
            if (last>=first)
            {
                int mid = first + (last -first )/2;
                if (arr[mid] == searchElement)
                   return mid;//if the element is present at middle
                if (arr[mid] > searchElement)
                   return binarySearch(arr, first, mid-1, searchElement);
                else
                	return binarySearch(arr, mid+1, last, searchElement);
            }
			return 0;
        }
        
        	
        
     //bubble sort
        public static <T extends Comparable<T>>void bubbleSort(T arr[])
        {
            int size = arr.length;
            for (int i = 0; i < size-1; i++)
            {
                for (int j = 0; j < size-i-1; j++)
                {
                    if ( arr[j].compareTo(arr[j+1])>0)
                    {
                        T temp= arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
        }
            
   //bubble sort for string
      public static <T extends Comparable<T>>void stringsBubbleSort( String a)
       {
    	   int size=a.length();
    	   char []c=new char [size];
    	   for(int i=0;i<a.length();i++)
   		    {
   			c=a.toCharArray();
   			System.out.print(c[i]);

   		    }
    	   for(int i=0;i<size-1;i++)
    	   {
    		   for(int j=0;j<size-1-i;j++)
    		   {
    			   if(c[j]>c[j+1])
    			   {
    				   char temp=c[j+1];
    				   c[j+1] =c[j];
    				   c[j]=temp;
    				}
    		   }
    	   }
    	   System.out.println();
    	   for(int i=0;i<size;i++)
   		   {
   			System.out.print(c[i]);
   		   }
          }
      /**
  	 * 
  	 * @param method to convert temperature into fahrenheit and celsius
  	 */
      public static void temperatureConversion(double temp,int choice)
      {
    	  switch(choice)
    	  {
    	  case 1:
    	  double f=(temp * 9/5) + 32;
    	  System.out.println("Fahrenheit temperature is"+f);
    	  break;
    	  case 2:
    	  double celsiusTemp=(temp - 32) * 5/9;
    	  System.out.println("celsius temperature is"+celsiusTemp);
    	  break;
    	  }
      }
      /**
  	 * 
  	 * @param merge sorting
  	 */
      //merge sort
      public static <T extends Comparable<T>> String[] mergeSort(String ar[],int low,int high)
      {
          if(low<high)
          {
              int mid=(low+high)/2;
              //sort first part of array
              mergeSort(ar,low,mid);
              //sort second part of array
              mergeSort(ar,mid+1,high);
              merge(ar,low,mid,high);
          }
          return ar;
      }
      public static void merge(String ar[],int start,int mid,int end)
      {
          int p=start;int q=mid+1;
          Object arr[]=new Object[end-start+1];
          int k=0;
          for(int i=start;i<=end;i++)
          {
          if(p>mid)
          {
              arr[k++]=ar[q++];
             
          }
          else if(q>end)
          {
              arr[k++]=ar[p++];
             
          }
          else if(ar[q].compareTo(ar[p])<0)
          {
              arr[k++]=ar[p++];
             
          }
          else
          {
              arr[k++]=ar[q++];
          }
          }

      for (int l=0 ; l< k ;l++)
      {
            ar[start++] = (String)arr[l] ;                         
      }
      }
      /**
  	 * 
  	 * @param method to find monthly payment
     * @return 
  	 */
     
    	   public static void monthlyPayment(double principal,double year,double rate)
    	   {
    		   double months=12*year;
    		   rate=rate/12*100;
    		   double den=(1-(Math.pow(1+rate, -months)));
    		   double payment=(principal*rate)/den;
    		   System.out.println("payment="+payment);
    	   }
    	   /**
    	  	 * 
    	  	 * @param square root function to compute square root of non negative number
    	     * @return 
    	  	 */
             public static void sqrtOfNonNegative(double c)
             {
            	 double epsilon=1e-15;
            	 double t=c;
            	 
            	 while(Math.abs(t)>epsilon*t)
            	 {
            		 t=((c/t)+t)/2.0;
            		
            		  System.out.println("desired output="+t);
            	  }
             }
             //vending machine
             public static void vendingMachine(int number,int a[])
             {
            	 int j=0;
            	 int i=0;
            	 for(i=0;i<a.length-1;i++)
            	 {
            		 if(number>=a[i] )
            		 {
            			int counter=number/a[i];
            			number=number-a[i]*counter;
            			System.out.println("no of  notes="+a[i] + " "+counter);
            			
            		 }
            		    if(number<a[i] && number>=a[i+1])
            			 {
            				int counter1=number/a[i+1];
                			number=number-a[i+1]*counter1;
                			System.out.println("no of notes="+a[i+1] + " "+counter1);
            			}
            		 
            	 }
             
             }    
             
             /**
     	  	 * 
     	  	 * @param to compute binary number
     	     * 
     	  	 */
          
          
          public static StringBuilder toBinary(int num) 
          {
              String out="";
              while(num!=0) 
              {
                      int rem =num%2;
                      out=rem+out;
                      num=num/2;
              }

              int size=out.length();
              int temp=size;
              while(size%4!=0) 
              {
                 size++;
              }
              int diff=size-temp;
               for(int i=1;i<=diff;i++)
               {
                  out='0'+out;
               }
               int count=0;
               StringBuilder sb=new StringBuilder(out);
               for(int i=0;i<out.length();i++) 
               {
                  count++;
                if(count==5) 
                {
                  sb.insert(i," ");
                  count=0;
                }
             }
            return sb;
              }
          public static String toBinaryNum(int number)
          {
        	  String out="";
              while(number!=0) 
              {
                      int rem =number%2;
                      out=rem+out;
                      number=number/2;
              }  
              if(out.length()/2!=0)
              {
            	  out=0+out;
              }
			return out;
        	  
          }
          public static String swapNibbels(String a)
          {
        	  String res1="";
        	  String res2="";
        	  String result="";
        	for(int i=0;i<a.length()/2;i++)
        	{
        	    res1=res1+a.charAt(i);
        	}
        	for(int j=a.length()/2;j<a.length();j++)
        	{
        		res2=res2+a.charAt(j);
        	}
        	result=res2+res1;
			return result;
        	  
          }
          public static int binaryToDecimal(String a)
          {
        	  int number=Integer.parseInt(a);
        	  int out=0;
        	  int count=0;
        	  int temp=0;
        	 while(number!=0)
        	 {
        		 int reminder=number%10;
        		 out= (int) (out+(reminder*Math.pow(2, count++)));
        		 number=number/10;
        		 
        	 }
			return out;
        	  
          }
          //to guess number
          public static int searchGuessNumber(int low, int high)
          {
      		if (high - low == 1) {
      			return low;
      		}
      		int mid = low + (high - low) / 2;
      		System.out.println("Is it less than " + mid);
      		if (userInputBoolean()) 
      		{
      			return searchGuessNumber(low, mid+1);
      		} else 
      		{
      			return searchGuessNumber(mid-1, high);
      		}
      }
       /**
		 * @return
		 */
		
	public static void printStrings(String[] array)
       {
       for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
       }
	//STRING BINARY SEARCH
	
	public static boolean binarySearchString(String[] arrayOfString, int low, int high, String searchString) 
	{
		// arrayOfString=bubbleSortForString(arrayOfString);

		if (low <= high) {
			int mid = low + (high - low) / 2;
			if (arrayOfString[mid].compareTo(searchString) == 0) 
			{
				//return true;
			} 
			else if (arrayOfString[mid].compareTo(searchString) > 0) {
				return binarySearchString(arrayOfString, low, mid - 1, searchString);
			} 
			else if(arrayOfString[mid].compareTo(searchString) == 0)
			{
				return binarySearchString(arrayOfString, low, mid + 1, searchString);
			}

		}
		return false;
	}

	/**
	 * Sorting the array of strings using bubble sort technique
	 * 
	 * @param arrayOfString
	 * @return
	 */
	public static String[] bubbleSortForString(String[] arrayOfString) {
		for (int i = 0; i < arrayOfString.length - 1; i++) {
			for (int j = 0; j < arrayOfString.length - i - 1; j++) {
				if (arrayOfString[j + 1].compareTo(arrayOfString[j]) < 0) {
					String temp = arrayOfString[j];
					arrayOfString[j] = arrayOfString[j + 1];
					arrayOfString[j + 1] = temp;
				}
			}
		}
		return arrayOfString;
}
// to return day of the week
	public static void dayOfTheWeek(int year,int month,int day)
	{
		String [] days= {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		
		int y=year-(14-month)/12;
		int x=y+y/4-y/100+y/400;
		int m=month+12*((14-month)/12)-2;
		int d=(day+x+(31*m/12))%7;
		System.out.println("day is "+  days[d]);
	}
		
		
	

	/**
	 * @return method to take inputs
	 */
	public static int readInteger() 
	{
	    int n=sc.nextInt();
		sc.nextLine();
	    return n;
	}
	public static double readDouble() 
	{
	    double n=sc.nextDouble();
		sc.nextLine();
	    return n;
	}
	public static String readString() 
	{
	    String n=sc.nextLine();
		sc.nextLine();
	    return n;
	}

	
	/**
	 * @param ar
	 */
	public static void printArrayString(String[] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]+" ");
		}
				
	}
	public static boolean userInputBoolean() 
	{
					return sc.nextBoolean();
	}

	/**
	 * @param to print array elements
	 */
	public static void printArrayElements(String[] ar) 
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
}

	/**
	 * @return
	 */
	public static boolean isAnagram(String firstString, String secondString) {
		firstString = removeSpace(firstString);
		secondString = removeSpace(secondString);
		if (firstString.length() != secondString.length()) {
			return false;
		} else {
			firstString = toLowerCase(firstString);
			secondString = toLowerCase(secondString);
			boolean result = checkString(firstString, secondString);
			return result;
		}
	}

	/**
	 * Remove the space in given String
	 * 
	 * @param inputString
	 * @return
	 */
	public static String removeSpace(String inputString) {
		char[] charString = inputString.toCharArray();
		inputString = "";
		for (int i = 0; i < charString.length; i++) {
			if (charString[i] != ' ') {
				inputString = inputString + charString[i];
			}
		}
		return inputString;
	}

	/**
	 * To convert the upper case to lower case characters
	 * 
	 * @param inputString
	 * @return
	 */
	public static String toLowerCase(String inputString) {
		char[] charString = inputString.toCharArray();
		for (int i = 0; i < charString.length; i++) {
			if (charString[i] >= 65 || charString[i] <= 91) {
				charString[i] += 32;
			}
		}
		return new String(charString);
	}

	/**
	 * check whether the given strings are having same characters
	 * 
	 * @param firstString
	 * @param secondString
	 * @return
	 */
	public static boolean checkString(String firstString, String secondString) {
		char[] charString1 = firstString.toCharArray();
		char[] charString2 = secondString.toCharArray();
		charString1 = sort(charString1);
		charString2 = sort(charString2);
		for (int i = 0; i < charString2.length; i++) {
			if (charString1[i] != charString2[i]) {
				return false;
			}
		}
		return true;
	}
	/**
	 * @param charString1
	 * @return
	 */
	public static char[] sort(char charString[]) {
		for (int i = 0; i < charString.length; i++) {
			for (int j = i + 1; j < charString.length; j++) {
				if (charString[i] > charString[j]) {
					char temp = charString[i];
					charString[i] = charString[j];
					charString[j] = temp;
				}
			}
}
		return charString;
	}

	public static void searchWord(String searchString) throws IOException {
		String filePath = "/home/bridgelabz/Documents/binaryfile";
		String line = "";
		boolean result = false;

		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
			while ((line = bufferedReader.readLine()) != null)
			{
				String[] words = line.split(",");
				bubbleSortForString(words);
				result = binarySearchString(words, 0, words.length - 1, searchString);
			}
			if (result)
			{
				System.out.println("search element not found");
			} else 
			{
				System.out.println("Search elements  found");
			}

			bufferedReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		}

	/**
	 * @param array1
	 * @return
	 */
	public static int[] insertionSort(int[] array1) 
	{
		 int array[] = array1;
		 int size = array.length;

         for (int i = 0; i < size-1; i++)
         {
             for (int j = 0; j < size-i-1; j++)
             {
                 if ( array[j]>(array[j+1]))
                 {
                     int temp= array[j];
                     array[j] = array[j+1];
                     array[j+1] = temp;
                 }
             }
         
	}
		
		return array;
	}

	/**
	 * @param cards
	 * @return
	 */
	public static String[][] distributeCards(LinkedList[] cards) {
		// TODO Auto-generated method stub
		return null;
	}

	
/*
public class AddressBook extends Observable implements Serializable {
    ArrayList<Person> personDetails = new ArrayList<>();
    Person.CompareByName compareByName = new Person.CompareByName();
    Person.CompareByZip compareByZip = new Person.CompareByZip();
    Person person;
    Utility utility = new Utility();

    public AddressBook() throws JsonGenerationException, JsonMappingException, IOException {
        System.out.println("Enter the new address book name");
        String addressBookName = utility.userInputString();
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("/home/bridgelabz/Documents/json/" + addressBookName + ".json"), personDetails);
    }

    /**
     * @param firstName
     *            the person's first name
     * @param lastName
     *            the person's last name
     * @param address
     *            the person's address
     * @param city
     *            the person's city
     * @param state
     *            the person's state
     * @param zip
     *            the person's zip
     * @param phone
     *            the person's phone
     */
    /*public void addPerson(String firstName, String lastName, String address, String city, String state, String zip,
            String phone) {
        person = new Person(firstName, lastName, address, city, state, zip, phone);
        personDetails.add(person);
    }

    /**
     * @return the number of persons in the collection
     */
   /* public int getNumberOfPersons() {
        return personDetails.size();
    }

    /**
     * @param index
     *            the position of the desired person
     * @return the person's full name, in a form suitable for displaying or printing
     */
    /*public String getFullNameOfPerson(int index) {
        String fullName = "";
        if (index == personDetails.indexOf(person)) {
            fullName = person.getFirstName() + " " + person.getLastName();
        }
        return fullName;
    }

    /**
     * @param index
     * @return
     
    public String[] getOtherPersonInformation(int index) {
        String[] otherPersonInformation = new String[5];
        if (index == personDetails.indexOf(person)) {
            otherPersonInformation[0] = person.getAddress();
            otherPersonInformation[1] = person.getCity();
            otherPersonInformation[2] = person.getState();
            otherPersonInformation[3] = person.getZip();
            otherPersonInformation[4] = person.getPhone();
        }
        return otherPersonInformation;
    }
*/
    /**
     * @param index
     * @param address
     * @param city
     * @param state
     * @param zip
     * @param phone
     */
    /*ublic void updatePerson(int index, String address, String city, String state, String zip, String phone) {
        if (index == personDetails.indexOf(person)) {
            person.update(address, city, state, zip, phone);
        }
    }

    /**
     * @param index
     */
  /*  public void removePerson(int index) {
        if (index == personDetails.indexOf(person)) {
            personDetails.remove(index);
        }

    }

    // Sort the collection by name
    public void sortByName() {
        for (int index = 0; index < personDetails.size(); index++) {
            compareByName.compare(personDetails.get(index), personDetails.get(index + 1));
        }
    }

    // Sort the collection by zip
    public void sortByZip() {
        for (int index = 0; index < personDetails.size(); index++) {
            compareByName.compare(personDetails.get(index), personDetails.get(index + 1));
        }
    }

    // print the address of the person
    public void printAll() throws FileNotFoundException, IOException, ParseException {

        new AddressBook();
        JSONParser parser = new JSONParser();
       
    }	
    
    	

    public void getWrite(Person person) throws JsonGenerationException, JsonMappingException, IOException {
        new AddressBook();
        System.out.println("enter no. of persons list");
        int noOfPerson = utility.userInputInteger();
        for (int i = 0; i < noOfPerson; i++) {
            person = personData();
            personDetails.add(person);
        }
       
    }

    public static Person personData() {
        Utility utility = new Utility();
        Person person = new Person();
        System.out.println("Enter first name");
        String firstName = utility.userInputString();
        person.setFirstName(firstName);

        System.out.println("Enter last name");
        String lastName = utility.userInputString();
        person.setLastName(lastName);

        System.out.println("Enter Adaress ");
        String address = utility.userInputString();
        person.setAddress(address);

        System.out.println("Enter city");
        String city = utility.userInputString();
        person.setCity(city);

        System.out.println("Enter state");
        String state = utility.userInputString();
        person.setState(state);

        System.out.println("Enter zip");
        String zip = utility.userInputString();
        person.setZip(zip);

        System.out.println("Enter phone");
        String phone = utility.userInputString();
        person.setPhone(phone);
        return person;
    }*/

}



	

	