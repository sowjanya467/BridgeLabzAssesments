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
import java.util.Iterator;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.oops.CliniqueManagement.DoctorPojo;
import com.bridgelabz.oops.CliniqueManagement.PatientPojo;
import com.bridgelabz.oops.CliniqueManagement.UtilityClinic;
import com.bridgelabz.oops.implementationmethods.ManagerService;
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

public class ManagerServiceImplementatio implements ManagerService 
{
	static PatientServiceImplementation patient = new PatientServiceImplementation();
	/**
	 * method to add the patient
	 * 
	 */
	UtilityClinic util = new UtilityClinic();

	public void addPatient()
	{
		// PatientPojo patient=new PAT
		System.out.println("enter the patient name");
		String patientName = Utility.userInputString();
		// patient.setPatientName(patientName);
		System.out.println("enter the patient id");
		String patientId = Utility.userInputString();
		// patient.setPatientId(patientId);
		System.out.println("enter the patient mobile number");
		String pMobileNum = Utility.userInputString();
		System.out.println("enter the patient age");
		// patient.setpMobileNum(pMobileNum);
		String pAge = Utility.userInputString();
		PatientPojo patient = new PatientPojo(patientName, patientId, pMobileNum, pAge);
		JSONObject jsonObject = patient.tojsonObject();
		util.printPatientList(jsonObject);
	}

	/**
	 * method to delete patient
	 * 
	 * @param jsonobject
	 * @param patientArray
	 * @param i
	 */
	public void deletePatient(JSONObject jsonobject, JSONArray patientArray, int i)
	{
		patientArray.remove(i);
		util.printWriter(patientArray);
		System.out.println("deleted successfully");
	}

	/**
	 * method to update patient details
	 * 
	 * @param jsonobject
	 * @param patientArray
	 * @param i
	 */
	public void updatePatient(JSONObject jsonobject, JSONArray PatientArray, int i)
	{

		System.out.println("enter the changes you want to make");
		System.out.println("1.age 2.mobile number");
		int choice = Utility.readInteger();
		switch (choice) {
		case 1:
			System.out.println("enter the age to change");
			String age = Utility.userInputString();
			jsonobject.put("pAge", age);
			break;
		case 2:
			System.out.println("enter the id to change");
			String mobileNum = Utility.userInputString();
			jsonobject.put("pMobileNum", mobileNum);
			break;
		default:
			System.out.println("invalid entry!!!!");
			break;
		}
		PatientArray.remove(i);
		PatientArray.add(i, jsonobject);
		util.printWriter(PatientArray);
		System.out.println("Contact updated successfully!!!!");

	}

	/**
	 * method to add doctor
	 * 
	 */
	public void addDoctor() 
	{
		DoctorPojo doctor = new DoctorPojo();
		System.out.println("enter the file name");
		String file = Utility.userInputString();
		System.out.println("enter the name of the doctor");
		String docName = Utility.userInputString();
		// doctor.setDoctorName(docName);
		System.out.println("enter the ID of the doctor");
		String doctorId = Utility.userInputString();
		// doctor.setDoctorId(doctorId);
		System.out.println("enter the specialization of the doctor");
		String docSpec = Utility.userInputString();
		// doctor.setDocSpec(docSpec);
		System.out.println("enter the availability of the doctor");
		String docAvail = Utility.userInputString();
		// doctor.setDocAvail(docAvail);
		DoctorPojo doctor1 = new DoctorPojo(docName, doctorId, docSpec, docAvail);
		// File file1=new File("/home/bridgelabz/FileHolders/doctor.json");
		JSONObject jsonObject = doctor1.toJsonObject();
		util.printDoctorList(jsonObject);
	}

	/**
	 * method to delete doctor
	 * 
	 * @param jsonobject
	 * @param doctorList
	 * @param i
	 */
	public void deleteDoctor(JSONObject jsonobject, JSONArray doctorList, int i)
	{
		doctorList.remove(i);
		// doctorList.add(i, jsonobject);
		util.printWriter1(doctorList);
		System.out.println("deleated succesfully");
	}

	/**
	 * method to update doctor details
	 * 
	 * @param jsonobject
	 * @param doctorList
	 * @param i
	 */
	public void updateDoctor(JSONObject jsonobject, JSONArray doctorList, int i) 
	{
		System.out.println("enter the changes you want to make");
		System.out.println("1.availability 2.id");
		int choice = Utility.readInteger();
		switch (choice) {
		case 1:
			System.out.println("enter the availability to change");
			String docAvail = Utility.userInputString();
			jsonobject.put("docAvail", docAvail);
			break;
		case 2:
			System.out.println("enter the id to change");
			String doctorId = Utility.userInputString();
			jsonobject.put("doctorId", doctorId);
			break;
		default:
			System.out.println("invalid entry!!!!");
			break;
		}
		doctorList.remove(i);
		doctorList.add(i, jsonobject);
		// saveFile(jsonobject);

		util.printWriter1(doctorList);
		System.out.println("Contact updated successfully!!!!");
	}

	public void userChoice(int choice) 
	{
		JSONParser parser1 = new JSONParser();
		System.out.println("enter the doctor name");
		String doctorName = Utility.userInputString();
		// String lastName = Utility.userInputString();
		JSONArray bookArray = null;
		try 
		{
			bookArray = (JSONArray) parser1.parse(new FileReader("/home/bridgelabz/FileHolders/doctors.json"));
		} 
		catch (IOException | ParseException e) 
		{
			((Throwable) e).printStackTrace();
		}

		@SuppressWarnings("rawtypes")
		Iterator iterator = bookArray.iterator();
		int i = 0;
		boolean temp = false;
		loop: while (iterator.hasNext())
		{
			JSONObject jsonObject = (JSONObject) iterator.next();
			if (jsonObject.get("doctorName").equals(doctorName))
			{
				temp = true;
				switch (choice) {
				case 6:
					deleteDoctor(jsonObject, bookArray, i);
					break loop;
				case 7:
					updateDoctor(jsonObject, bookArray, i);
					break loop;
				case 11:
					// showDoctorDetails(jsonObject,bookArray);
					break;

				}
			}
			i++;
		}
		if (!temp) {
			System.out.println("Sorry!!! Person not found...");
		}

	}

	public void userinputChoice(int choice)
	{
		JSONParser parser = new JSONParser();
		System.out.println("enter patient name");
		String patientName = Utility.userInputString();
		// String lastName = Utility.userInputString();
		JSONArray patientArray = null;
		try 
		{
			patientArray = (JSONArray) parser.parse(new FileReader("/home/bridgelabz/FileHolders/patients.json"));
		} 
		catch (IOException | ParseException e)
		{
			((Throwable) e).printStackTrace();
		}

		@SuppressWarnings("rawtypes")
		Iterator iterator = patientArray.iterator();
		int i = 0;
		boolean temp = false;
		loop: while (iterator.hasNext()) 
		{
			JSONObject jsonObject = (JSONObject) iterator.next();
			if (jsonObject.get("patientName").equals(patientName)) 
			{
				temp = true;
				switch (choice) {
				case 8:
					deletePatient(jsonObject, patientArray, i);
					break loop;
				case 9:
					updatePatient(jsonObject, patientArray, i);
					break loop;

				}
			}
			i++;
		}
		if (!temp) {
			System.out.println("Sorry!!! Person not found...");
		}

	}

}
