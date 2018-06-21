/**
 * 
 */
package com.bridgelabz.oops.CliniqueManagement;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.rmi.CORBA.Util;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.CollectionType;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

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

public class UtilityClinic 
{
	public void printPatientList(JSONObject jsonObject)
	{
		JSONParser parser = new JSONParser();
		JSONArray patientArray = null;
		File file = new File("/home/bridgelabz/FileHolders/patients.json");
		if (!file.exists()) 
		{  
			try 
			{
				file.createNewFile();
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			}
			patientArray = new JSONArray();
		} 
		else
		{
			try 
			{
				patientArray = (JSONArray) parser.parse(new FileReader("/home/bridgelabz/FileHolders/patients.json"));
			} 
			catch (IOException | ParseException e) 
			{
				e.printStackTrace();
			}
		}
		patientArray.add(jsonObject);

		printWriter(patientArray);
		System.out.println("Contact added successfully");
	
	}
	public void printWriter(JSONArray patientArray) 
	{
		try {
			PrintWriter printWriter = new PrintWriter("/home/bridgelabz/FileHolders/patients.json");
			printWriter.write(patientArray.toJSONString());
			printWriter.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void printDoctorList(JSONObject jsonObject)
	{
		JSONParser parser = new JSONParser();
		JSONArray doctorArray = null;
		File file = new File("/home/bridgelabz/FileHolders/doctors.json");
		if (!file.exists()) 
		{
			try 
			{
				file.createNewFile();
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			}
			doctorArray = new JSONArray();
		} 
		else
		{
			try 
			{
				doctorArray = (JSONArray) parser.parse(new FileReader("/home/bridgelabz/FileHolders/doctors.json"));
			} 
			catch (IOException | ParseException e) 
			{
				e.printStackTrace();
			}
		}
		doctorArray.add(jsonObject);

		printWriter1(doctorArray);
		System.out.println("Contact added successfully");
	
}
	public void printWriter1(JSONArray doctorArray) 
	{
		try {
			PrintWriter printWriter = new PrintWriter("/home/bridgelabz/FileHolders/doctors.json");
			printWriter.write(doctorArray.toJSONString());
			printWriter.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 
	 */
	public void takeAppointment() 
	{
		System.out.println("enter the doctor id");
		String id=Utility.userInputString();
		System.out.println("enter the date you want to take appointment");
		Date date=new Date();
				
	}
	public String date()
	{
	   System.out.println("enter date");
	   int d=Utility.readInteger();
	   int m=Utility.readInteger();
	   int y=Utility.readInteger();
	  // System.out.println(d+"/"+m+"/"+y);
	return d+"/"+m+"/"+y;
		
	}
	public static Scanner scanner = new Scanner(System.in);
	public static ObjectMapper mapper=new ObjectMapper();
	 DoctorPojo doctor;
	PatientPojo patient;
	public static String userInputString() {
		return scanner.next();
	}

	public static int userInputInteger() {
		return scanner.nextInt();
	}

	public static Double userInputDouble() {
		return scanner.nextDouble();
	}

	public static boolean userInputBoolean() {
		return scanner.nextBoolean();
	}

	public static Long userInputLong() {
		return scanner.nextLong();
	}
	
	public static String userInputNextLine() {
		return scanner.nextLine();
	}
	
	/*public static <T> ArrayList<T> parseJSONArray(File file, Class<T> clazz)
            throws JsonParseException, JsonMappingException, IOException {
        ArrayList<T> arrayList = new ArrayList<T>();
        CollectionType javaType = mapper.getTypeFactory()
                  .constructCollectionType(List.class, clazz);
        arrayList = mapper.readValue(file, javaType);

        return arrayList;

    }
	// Read Doctor details
   public DoctorPojo doctorDetails() {
	    System.out.println("Enter Doctor name");
	    //userInputNextLine();
	    String doctorName=userInputNextLine();
	    System.out.println("Enter Doctor id");
	    String doctorId=userInputString();
	    System.out.println("Enter Doctor available time");
	    String docSpec=userInputString();
	    System.out.println("Enter Doctor Specialization");
	    String specialization=userInputString();
	    System.out.println("Enter count of patients");
	    int count=userInputInteger();
	    doctor=new DoctorPojo(doctorName,doctorId,docSpec,docSpec,count);
	    return doctor;
   }
   //Read Patient details
   public PatientPojo patientDetails() {
	   System.out.println("Enter Patient name");
	   //userInputNextLine();
	   String name=userInputNextLine();
	   System.out.println("Enter patient id");
	   String id=userInputString();
	   System.out.println("Enter mobile number");
	   String mobile=userInputString();
	   System.out.println("Enter patient age");
	   String age=userInputString();
	  patient=new PatientPojo(name,id,mobile,age);
	  return patient;
   }
    public AppointmentPojo appointmentDetails() {
    	System.out.println("Enter the Patient Name");
		return null;
    }
   public <T> void search(ArrayList<T> list,T doctorName) {
	   
	   boolean search = false;
	   Method method=Class.forName("com.bridgelabz.model.Doctor").getMethod("getDoctorName");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).method.getName().equalsIgnoreCase(doctorName)) {
				System.out.println("Doctor available ");
				search = true;
			}
		}
		if (!search) {
			System.out.println("Doctor not Available");
		}
   }*/

}
