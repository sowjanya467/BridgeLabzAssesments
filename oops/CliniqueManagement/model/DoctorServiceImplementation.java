/**
 * 
 */
package com.bridgelabz.oops.CliniqueManagement.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.ShutdownChannelGroupException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.DoubleAdder;

import javax.print.DocFlavor.STRING;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.oops.CliniqueManagement.DoctorPojo;
import com.bridgelabz.oops.implementationmethods.DoctorService;
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

public class DoctorServiceImplementation implements DoctorService 
{
	@SuppressWarnings("unchecked")

	public void userChoice(int choice)
	{
		JSONParser parser = new JSONParser();
		List<DoctorPojo> doctorArray = null;
		try 
		{
			doctorArray = (List<DoctorPojo>) parser.parse(new FileReader("/home/bridgelabz/FileHolders/doctors.json"));
		} catch (IOException | ParseException e) {
			((Throwable) e).printStackTrace();
		}
		switch (choice) {
		case 10:
			System.out.println("the doctor details are");
			searchDoctor(doctorArray);
			break;
		case 12:
			showDoctorDetails(doctorArray);
			break;
		}
	}

	public void searchDoctor(List<DoctorPojo> doctorArray) 
	{
		System.out.println("enter the doctor name");
		String doctorName = Utility.userInputString();
		@SuppressWarnings("rawtypes")
		Iterator iterator = doctorArray.iterator();
		int i = 0;
		boolean temp = false;
		while (iterator.hasNext()) 
		{
			JSONObject jsonobject = (JSONObject) iterator.next();
			for (i = 0; i < doctorArray.size(); i++)
			{
				if (jsonobject.get("doctorName").equals(doctorName))
				{
					temp = true;
					System.out.println("name" + jsonobject.get("doctorName") + "id" + jsonobject.get("doctorId"));
					System.out.println("specialization" + jsonobject.get("docSpec"));
					System.out.println("doctor availability" + jsonobject.get("docAvail"));
				}
			}
			

		}
		if(temp==false)
		{
			System.out.println("doctor not found");
		}
	}

	public void searchDoctorId(JSONObject jsonObject, JSONArray doctorList) 
	{
		System.out.println("enter the doctor ID you want to search");
		String id = Utility.userInputString();
		for (int i = 0; i < doctorList.size(); i++) 
		{
			if (id.equals(jsonObject.get("docId"))) 
			{
				System.out.println("name" + jsonObject.get("docName"));
				System.out.println("specialization" + jsonObject.get("docSpec"));
				System.out.println("doctor availability" + jsonObject.get("docAvail"));
			}
		}
	}

	public void searchDoctorAvailability(JSONObject jsonObject, JSONArray doctorList) 
	{
		System.out.println("enter the availability of the doctor you want to search");
		String availability = Utility.userInputString();
		for (int i = 0; i < doctorList.size(); i++) 
		{
			if (availability.equals(jsonObject.get("docAvail")))
			{
				System.out.println("name" + jsonObject.get("docName") + "id" + jsonObject.get("docId"));
				System.out.println("specialization" + jsonObject.get("docSpec"));
			}
		}

	}

	public void showDoctorDetails(List<DoctorPojo> doctorList) 
	{
		
		System.out.println(doctorList);
		Iterator iterator = doctorList.iterator();
		while (iterator.hasNext())
        {
			JSONObject jsonobject = (JSONObject) iterator.next();
			System.out.println("the doctor list is ");
			System.out.println("name  " + jsonobject.get("doctorName"));
			System.out.println("id  " + jsonobject.get("doctorId"));
			System.out.println("specialization  " + jsonobject.get("docSpec"));
			System.out.println();
		}
	}

	
}
