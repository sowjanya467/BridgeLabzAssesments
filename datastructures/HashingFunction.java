/**
 * 
 */
package com.bridgelabz.datastructures;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;

import com.bridgelabz.utility.Utility;

/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since -05-17
 *
 **************************************************************************************************/

public class HashingFunction 
{
	static int flag = 0;
	static int remainder = 0;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args)
	{
		LinkedList<Integer> list = new LinkedList();
		HashMap map = new HashMap();
		int size = list.size();
		String num = "";
		LinkedList[] array = new LinkedList[11];
		for (int i = 0; i < array.length; i++) 
		{
			array[i] = new LinkedList();
		}
		File file = new File("/home/bridgelabz/FileHolders/hashchaining.txt");
		FileReader fileReader = null;
		//FileWriter fw = null;
		//BufferedWriter bw = null;
		ArrayList a = new ArrayList();
		BufferedReader bufferReader = null;
		try {
			fileReader = new FileReader(file);
			bufferReader = new BufferedReader(fileReader);
			num = bufferReader.readLine();
			while (num != null)
			{
				String[] str = num.split(",");
				for (int i = 0; i < str.length; i++) 
				{
					flag++;
					a.add(str[i]);
				}
				break;
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		int ar[] = new int[a.size()];
		for (int i = 0; i < a.size(); i++) 
		{
			ar[i] = Integer.parseInt((String) a.get(i));
		}
		for (int i = 0; i<ar.length; i++)
		{
			list.add(ar[i]);
		}
		list.display();
		for (int i = 0; i < list.size(); i++) 
		{
			Integer value = (Integer) list.removeFirst();
			remainder = value % 11;
			map.put(remainder, value);
		}
		System.out.println(map.entrySet());
		
		System.out.println("Enter the num to search in the linked list");
		int number1 = Utility.readInteger();
		if (map.containsValue(number1)) {
			int key = number1 % 11;
			map.remove(key);
			System.out.println("number removed Successfully");
			System.out.println(map.entrySet());
		} else {
			int key1 = number1 % 11;
			map.put(key1, map.get(key1) + "," + number1);
			System.out.println("number added successfully");
			System.out.println(map.entrySet());
		}

	}
}
