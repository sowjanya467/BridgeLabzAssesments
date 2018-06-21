/**
 * 
 */
package com.bridgelabz.datastructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

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

public class UnorderedMain<T extends Comparable<T>>  {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException
	{
		String filePath="/home/bridgelabz/FileHolders/unorderedlist.txt" ;
				
	    LinkedList l=new LinkedList();
		FileReader filereader=null;
		BufferedReader bufferreader=null;
		String word=null;
		FileReader fileReader=new FileReader(filePath);
		BufferedReader bufferReader=new BufferedReader(fileReader);
		try {
			while((word=bufferReader.readLine())!=null)
			{
				String[] str=word.split(",");
				for(int i=0;i<str.length;i++)
				{
					l.add(str[i]);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		l.display();
		System.out.println("enter the word you want to search");
		String searchWord=Utility.userInputString();
		if(l.search(searchWord))
		{
			System.out.println("word found ");
			l.remove(searchWord);
		}
		else
		{
			System.out.println("word not found add to the list");
			l.addLast(searchWord);
			l.display();
		}
	    //save modified list to the file
	    PrintWriter writer = new PrintWriter("/home/bridgelabz/FileHolders/unorderedlist.txt");
		 for(int i=0;i<l.size();i++) {
			 writer.print((Comparable) l.getNth(i)+",");
		 }
		writer.close();
	   	
		
	}

}
