/**
 * 
 */
package com.bridgelabz.datastructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

import com.bridgelabz.dutil.UtilityDs;
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

public class OrderedList <T extends Comparable<T>>{

	/**
	 * @param <T>
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static <T> void main(String[] args) throws FileNotFoundException 
	{
		LinkedList list = new LinkedList();
		File file = new File("/home/bridgelabz/FileHolders/orderedlist.txt");
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
				System.out.println("Reading from the file  ");
				for (int i = 1; i < array.length; i++)
				{
					System.out.println(array[i]);
				}

				int array1[] = new int[array.length];
				for (int i = 0; i < array1.length; i++)
				{
					array1[i] = Integer.parseInt(array[i]);
				}

				int[] sortedArray = Utility.insertionSort(array1);
				System.out.println();
				for (int i = 0; i < sortedArray.length; i++) 
				{
					list.add(sortedArray[i]);
				}
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		System.out.println("Contents present in the linked list are");
		list.display();
		System.out.println("Enter the word you want to search");
		int integerToSearch = Utility.readInteger();

		// If the word is found, remove word from list and save to the file
		if (list.search(integerToSearch))
		{
			System.out.println("Word found");
			System.out.println("The modified linked list is");
			list.remove(integerToSearch);
			list.display();
		}

		// If the word is not found, add word to the list and save to the file
		else 
		{
			list.addSorted(integerToSearch);
			list.display();
		}

		// save modified list to the file
		PrintWriter writer = new PrintWriter("/home/bridgelabz/FileHolders/orderedlist.txt");
		for (int i = 0; i < list.size(); i++) 
		{
			writer.print((T) list.getNth(i) + ",");

		}
		writer.close();
	}

}
