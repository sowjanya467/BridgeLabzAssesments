/**
 * 
 */
package com.bridgelabz.datastructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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

public class HashingMap 
{
	public static class HashingMain 
	{
	    @SuppressWarnings("unused")
		public static void main(String[] args) throws Exception 
	    {
	        LinkedList<Integer> linkedList=new LinkedList<>();
			File file=new File("/home/bridgelabz/FileHolders/hashchaining.txt");
	        FileReader fileReader = null;
	        BufferedReader bufferedReader = null;
	        try 
	        {
	            String word = null;
	            fileReader = new FileReader(file);
	            bufferedReader = new BufferedReader(fileReader);

	            while ((word = bufferedReader.readLine()) != null) 
	            {
	                String[] array = word.split(",");
	                System.out.println("Reading from the file.....");
	                for (int i = 0; i < array.length; i++) 
	                {
	                    System.out.print(array[i]+" ");
	                }

	                int array1[] = new int[array.length];
	                for (int i = 0; i < array.length; i++) 
	                {
	                    array1[i] = Integer.parseInt(array[i]);
	                }
	               
	                HashTableChaining hash=new HashTableChaining(10);
	                int[] sortedArray = Utility.insertionSort(array1);
	                for (int i = 0; i < sortedArray.length; i++) 
	                {
	                    HashTableChaining.insert(sortedArray[i]);
	                }
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	       
	        System.out.println("Contents of hash list...");
	        HashTableChaining.printHashTable ();	       
	        System.out.println("Enter the word you want to search");
	        int searchElement = Utility.readInteger();	       
	        if(HashTableChaining.contains(searchElement))
	        {
	            HashTableChaining.remove(searchElement);
	        }	       
	        else
	        {
	            HashTableChaining.insert(searchElement);
	        }
	        HashTableChaining.printHashTable ();
	       	   	      
	    }

	}
}
