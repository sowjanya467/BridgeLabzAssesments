/**
 * 
 */
package com.bridgelabz.dutil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.datastructures.*;
import com.bridgelabz.utility.*;
import com.bridgelabz.datastructures.*;
import com.bridgelabz.datastructures.Queue.Node;
import com.bridgelabz.utility.Utility;

/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since -05-17
 *
 * **************************************************************************************************/

public class UtilityDs <T extends Comparable<T>>
{
	public class Node<T extends Comparable<T>>
	{
		public T data;
		private int size;
		Node <T> front=null;
		Node <T> rear=null;
		Node<T> next;
		/**
		 * @param data2
		 * @param front2
		 */
		public Node(T data)
		{
			this.data=data;
			next=null;
		}
		public Node(T data, Node<T> front) {
			this.data=data;
			this.next=next;
		}

		public void addFirst(T data)
		{
		   front=new Node<T>(data,front);
		}
		
		public void addLast(T data)
		{
			if(front==null)
			{
				addFirst(data);
			}
			else
			{
				Node<T> temp=front;
			    while(temp.next!=null)	
			    {
			    	temp=temp.next;
			    }
			    temp.next=new Node<T>(data,front);
			}
		}
		public void display()
		{
			Node temp=rear;
			System.out.println("displaying the elements");
			if(front==null||rear==null)
			{
				System.out.println("the queue is empty");
			}
			
			while(temp!=null)
			{	
			    System.out.println(temp.data+" ");	
			    temp=temp.next;
			    
			}
			System.out.println("elements displayed");
		}
		
	}
	private static String regex;
	/**
     * Method for unordered list 
     * 
     * 
     */
	 public  <T extends Comparable<T>> void orderedList() throws FileNotFoundException {
		    LinkedList ilist=new LinkedList();
			File file=new File("/home/bridgelabz/FileHolders/orderedlist.txt");
		    FileReader fileReader=null;
		    BufferedReader bufferedReader=null;
		    try {
		   	 String word=null;
		   	 fileReader=new FileReader(file);
		   	 bufferedReader=new  BufferedReader(fileReader);
		   	
		   	 while((word=bufferedReader.readLine())!=null) {
		   		String[] array=word.split(",");
		   		System.out.println("Reading from the file.....");
		   		for(int i=0;i<array.length;i++) {
		      		 System.out.println(array[i]);
		      }
		   		
		   		int array1[]=new int[array.length];
		   		for(int i=0;i<array.length;i++) {
		   		 array1[i]=Integer.parseInt(array[i]);
		   }
		   		
		   		int[] sortedArray=Utility.insertionSort(array1);
		   		for(int i=0;i<sortedArray.length;i++) {
		   			 ilist.add(sortedArray[i]);
		   		 }
		   	 }
		    }
		   catch (Exception e) {
		        e.printStackTrace();
		   }
		    System.out.println("Contents of linked list...");
		    ilist.display();
		    System.out.println("Enter the word you want to search");
		    int integerToSearch=Utility.readInteger();
		    
		    
		    //If the word is found, remove word from list and save back the file
		    if(ilist.search(integerToSearch)) {
		   	 System.out.println("Word found!!");
		   	 System.out.println("The modified list is");
		   	 ilist.remove(integerToSearch);
		   	 ilist.display(); 
		    }
		    
		  //If the word is not found, add word to the list and save back the file
		    else {
		   	 ilist.addSorted(integerToSearch);
		   	 ilist.display();
				}
		    
		    
		    //save modified list to the file
		    PrintWriter writer = new PrintWriter("/home/bridgelabz/FileHolders/unorderedlist.txt");
			 for(int i=0;i<ilist.size();i++) {
				 writer.print((T) ilist.getNth(i)+",");
			 }
			writer.close();
		    }
		    
		    
	
	public static void pallindrome(String str)
	{  
		Deque d=new Deque();
		str=str.replaceAll("//s", "");
		int k=str.length();
		for(int j=str.length()-1;j>=0;j--)
		{
			d.addLast(str.charAt(j));
		}
		d.display();
		char[] array=new char[k];
		char[] array1=new char[k];
		for(int i=0;i<array.length;i++)
		{
			array[i]=(char) d.removeFront();
		}
		String result=String.valueOf(array);
		if(result.equals(str))
		{
			System.out.println("it is pallindrome");
		}
		else
		{
			System.out.println("it is not pallindrome");
		}
	}	
	

	public static boolean checkMonth(int d, int m, int y) {

		boolean st = true;
		if(((m == 4 || m == 6 || m == 9 || m == 11) && (d >30)) 
				|| (d>31)
				|| (m==2 && y % 100 == 0 && y % 400 != 0 && d > 28) 
				|| (m==2 && y % 400 == 0 && d > 29)
				|| (m==2 && y % 100 != 0 && y % 4 != 0 && d > 28) 
				|| (m==2 && y % 100 != 0 && y % 4 == 0 && d > 29))
		{
			st = false;
		} 
        else {
            st=true;
        }		
		return st;
}
	
	public static int dayStart(int d,int m,int y)
	{
		int y0 = y - (14 - m) / 12;
		int x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		return ((d + x + (31 * m0) / 12) % 7);
		
		
	}
		
	
	//to print calender
	public static void calender(int day,int month,int year)
	{
		String[] days= {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		String [] months= {"january","february","march","april","may","june","july","august","september","october","november","december"};
		int y=year-(14-month)/12;
		int x=y-y/4-y-100+y/400;
		int m=month+12*(14-month/12)-2;
		int d=(day+x+31*m/12)%7;
		if(year%4==0&&(year%100!=0||year%400==0))
		{
			System.out.println("it is leap year");
		}
	    
		int array[][]=new int[9][9];
	
		for(int i=0;i<6;i++)
		{
			for (int j=0;j<7;j++)
			{
				System.out.println(days+" ");
			}
			
		}
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<7;j++)
			{
			   d++;	
			}
		}
	}
	
	public static int findMonth(String month,int year)
	{
		int max=0;
		String [] months= {"january","february","march","april","may","june","july","august","september","october","november","december"};
	    int[] daysNo= {31,28,31,30,31,30,31,31,30,31,30,31};
	    if(year%4==0&&(year%100!=0||year%400==0))
		{
			System.out.println("it is leap year");
			daysNo[1]=29;
		}
		for(int i=0;i<12;i++)
		{
			if(months.equals(month))
			{
				max=daysNo[i];
			}
		}
		return max;
	}
	
	
	/**
     * Method to print the prime numbers in an 2D array
     * @param 
     * @return linkedlist
     */     
    public static void twoDprime() {
        int[][] array= new int[10][25];
        int total=0;
        int start=0;
        int end=100;
       while(end<1000) {
    	   for(int row=0; row<10;row++) {
           LinkedList<Integer> linkedList=findPrime(start,end);
           int count=0;
           for(int i=0 ;i <linkedList.size();i++)
           {
               array[row][count]=linkedList.getNth(i);
               count++;
           }
           start=start+100;
           end=end+100;
        }   
 }     
        
       //printing array
       for(int i=0; i<10 ; i++) {
            for(int j=0;j<22;j++) {
                if(array[i][j]==0) {
                    continue;
                }
               System.out.print(array[i][j]+" ");
              
                }
            System.out.println();
        }
   }
    //to find prime numbers
    public static LinkedList<Integer> findPrime(int start,int end){
        LinkedList<Integer> linkedList=new LinkedList<Integer>();
         for (int num =start; num <= end; num++) 
         {
             int count=0;
             for(int i=2 ; i<=num ;i++ )
             {
                 if(num%i==0){
                     count++;
                     }
                }
             if(count==1) 
             {
                 
                 linkedList.add(num);
                 }
              }   
    
         return linkedList;
         }
    //method to check prime numbers that are anagram
    public static void primeAnagrams() {
        int[][] array = new int[10][100];
        int[][] nonAnagram = new int[10][100];
        LinkedList<Integer> linkedList = new LinkedList<>();
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        int start = 0;
        int end = 100;

        while (end< 1000) {
            for (int row = 0; row < 10; row++) {
                linkedList = findPrime(start, end);
                linkedList1 = isAnagramRange(linkedList);
                int count = 0;
                int count1 = 0;
               
                //stores anagram in the prime range into array[]
                for (int i = 0; i < linkedList1.size(); i++) {
                    array[row][count] = linkedList1.getNth(i);
                    count++;
                }
               
                //compares anagram list and prime list to remove common terms from primelist
                for (int i = 0; i < linkedList.size(); i++) {
                    for (int j = 0; j < linkedList1.size(); j++)
                        if (linkedList.getNth(i) == linkedList1.getNth(j)) {
                            linkedList.remove(linkedList.getNth(i));
                        }
                }

                //stores modified list that contains non anagrams into non-anagram[]
                for (int i = 0; i < linkedList.size(); i++) {
                    nonAnagram[row][count1] = linkedList.getNth(i);
                    count1++;
                }
                start = start + 100;
                end = end + 100;
            }
        }

       
        System.out.println("2D ANAGRAM ARRAY");
        // printing anagram array
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 100; j++) {
                if (array[i][j] == 0) {
                    continue;
                }
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }

   
        System.out.println("---------------------------------");
        System.out.println("2D NON  ANAGRAM ARRAY");
        //print non-anagram array
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 100; j++) {
                if (nonAnagram[i][j] == 0) {
                    continue;
                }
                System.out.print(nonAnagram[i][j] + " ");

            }
            System.out.println();
        }

    }

    /**
     * Method to check anagram numbers in any range
     * @param linkedList     The linkedlist that contains numbers to be checked for anagram
     * @return linkedlist
     */
    public static LinkedList<Integer> isAnagramRange(LinkedList<Integer> linkedList) {
        LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
        for (int i = 0; i < linkedList.size() - 1; i++) {
            for (int j = i + 1; j < linkedList.size(); j++) {
                String s1 = Integer.toString(linkedList.getNth(i));
                String s2 = Integer.toString(linkedList.getNth(j));

                if (Utility.isAnagram(s1, s2)) {
                    linkedList2.add(linkedList.getNth(i));
                    linkedList2.add(linkedList.getNth(j));
                }

            }

        }
        return linkedList2;
        }

    public static void numberOfBST(int testCase) {
        System.out.println("Enter total " + testCase + " number of nodes");
        int[] array = new int[testCase];
        for (int i = 0; i < testCase; i++) {
            array[i] = 	Utility.readInteger();
        }

        for (int i = 0; i < testCase; i++) {
            int result = treesCount(array[i]);
            System.out.println(result);
        }
    }

    public static int treesCount(int number)
    {
        int intsum = 0;
        if (number == 0 || number == 1) 
        {
            return 1;
        } 
        else if (number == 2)
        {
            return 2;
        } else {
            for (int i = 0; i < number; i++) 
            {
                intsum = intsum + treesCount(i) * treesCount(number - i - 1);
            }
            return intsum;
        }
    }
    public static String replaceRegExp1(String message,String name,String fullname,String number,String date)
    {
    	String regExp="<<name>>";
    	String regExp1="<<fullname>>";
    	String regExp2="<<xxxxxxxxxx>>";
    	String regExp3="<<31/01/2018>>";
        message=replace(message,regExp,name);
        message=replace(message,regExp1,fullname);
    	message=replace(message,regExp2,number);
    	message=replace(message,regExp3,date);

		return message;
    }
    public static String replace(String message,String regexp,String replace)
    {
    	Pattern pattern=Pattern.compile(regexp);
    	Matcher matcher=pattern.matcher(message);
    	message=matcher.replaceAll(replace);
    	return message;
    	}



	/**
	 * @param name
	 * @param number
	 */
	@SuppressWarnings("unused")
	public static void DeckOfCards(int number) {
			String [] suit= {"Clubs","Dimonds","Hearts","Spades"};
			String[] rank= {"2","3","4","5","6","7","8","9","10","king","queen","jack","ace"};
			int[][] a=new int[4][9];
			Random r=new Random();
			String rank1=r.toString();
			for(int i=0;i<number;i++)
			{
				for(int j=0;j<9;j++)
				{
					int card=r.nextInt(51);
					System.out.println("the card is "+ card);
					
				}
			}
			//for(int i=0;i<)
	}
	public static String[][] cards(String cards[][],String rank[],String suit[])
	{
		for(int i=0;i<suit.length;i++)
		{
			for(int j=0;j<rank.length;j++)
			{
				cards[i][j]=suit[i]+ " " +rank[j];
				//System.out.print(cards[i][j]);
			}
			//System.out.println();
		}
		return cards;
	}
	public static String[][] shuffleCards(String cards[][],String rank[],String suit[])
	{		
		Random r=new Random();
		for(int i=0;i<suit.length;i++)
		{
			for(int j=0;j<rank.length;j++)
			{
				//cards[i][j]=r.toString();
				int rand=(int) (Math.random()*suit.length);
				int rand1=(int) (Math.random()*rank.length);
				String temp=cards[rand][rand1];
				cards[rand][rand1]=cards[i][j];
				cards[i][j]=temp;
				//System.out.println(cards[i][j]);
			}
		}
		return cards;
	}
	public static void printCards(String cards[][])
	{
		for(int i=0;i<4;i++)
		{
			System.out.println("player"+ i);
			for(int j=0;j<9;j++)
			{
				System.out.print(cards[i][j]+"-");
			}
			System.out.println();
		}
	}

	//player object deck of cards
	/**
	 * @param cards
	 * @return
	 */
	public static String[][] distributeCards(LinkedList[] cards)
	{
	    Random r=new Random();
	    String[][] players=new String[4][9];
	    for(int i=0;i<4;i++)
	    {
	        for(int j=0;j<9;j++)
	        {
	            int pos=r.nextInt(51);
	            if(!cards[pos].isEmpty())
	            {
	                players[i][j]=(String)cards[pos].pop();
	            }
	            else
	            {
	                j--;
	            }
	        }
	    }
	    return players;
	}

	/**
	 * @param players
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static LinkedList[] rearrange(String[][] players)
	{
	    LinkedList[] arrange=new LinkedList[52];
	    for(int i=0;i<4;i++)
	    {
	         arrange[i]=new LinkedList();
	        for(int j=0;j<9;j++)
	        {
	        	arrange[i].addSorted(players[i][j]);
	        }
	    }
	    return arrange;
	}
	public static void showBySortedOrder(LinkedList[] arrange)
	{
	  for(int i=0;i<4;i++)
	    {  
	        System.out.println("Player "+(i+1)+" sorting cards");
	        for(int j=0;j<9;j++)
	        {
	            System.out.print("--"+arrange[i].pop()+" --  ");
	        }
	        System.out.println();
	    }


	}
	

  }
