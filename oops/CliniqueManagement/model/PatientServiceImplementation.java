/**
 * 
 */
package com.bridgelabz.oops.CliniqueManagement.model;

import java.awt.PageAttributes.PrintQualityType;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.oops.CliniqueManagement.PatientPojo;
import com.bridgelabz.oops.CliniqueManagement.TakeAppointment;
import com.bridgelabz.oops.CliniqueManagement.UtilityClinic;
import com.bridgelabz.oops.implementationmethods.PatientService;
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

public class PatientServiceImplementation implements PatientService 
{
	UtilityClinic utili = new UtilityClinic();
	DoctorServiceImplementation d = new DoctorServiceImplementation();
	ManagerServiceImplementatio m = new ManagerServiceImplementatio();

	/**
	 * users choice for searching patient by name or mobile number
	 * 
	 */
	public void userChoice(int choice) 
	{
		JSONParser parser = new JSONParser();
		// System.out.println("enter the patient name");
		// String patientName=Utility.userInputString();
		JSONArray patientArray = null;
		JSONArray doctorArray = null;

		try 
		{
			patientArray = (JSONArray) parser.parse(new FileReader("/home/bridgelabz/FileHolders/patients.json"));
		} catch (IOException | ParseException e) 
		{
			((Throwable) e).printStackTrace();
		}

		try 
		{
			doctorArray = (JSONArray) parser.parse(new FileReader("/home/bridgelabz/FileHolders/doctors.json"));
		} catch (IOException | ParseException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		switch (choice) 
		{
		case 2:
			System.out.println("the patient details are");
			searchByPatientName(patientArray);
			break;
		case 3:
			System.out.println("patient details are ");
			searchByPatientId(patientArray);
			break;
		case 4:
			System.out.println("the patient details are");
			searchByPatientMobileNum(patientArray);
			break;
		case 11:
			System.out.println("       the patients details is     ");
			ShowpatientDetails(patientArray);
			break;
		case 13:
			takeAppointment(doctorArray, patientArray);
			break;
		default:
			System.out.println("invalid entry");
			break;
		}
	}

	/**
	 * method to search by patient name
	 * 
	 */
	public void searchByPatientName(JSONArray patientArray) 
	{
		// JSONParser parser=new JSONParser();
		System.out.println("enter the patient name");
		String patientName = Utility.userInputString();

		@SuppressWarnings("rawtypes")
		Iterator iterator = patientArray.iterator();
		boolean temp = false;
		while (iterator.hasNext()) {
			JSONObject jsonObject = (JSONObject) iterator.next();
			if (jsonObject.get("patientName").equals(patientName)) {
				temp = true;
				System.out.println("patientName" + jsonObject.get("patientName"));
				System.out.println("id" + jsonObject.get("patientId"));
				System.out.println("mobile number : " + jsonObject.get("pMobileNum"));
				System.out.println("patient age : " + jsonObject.get("PAge"));
			}
			if (!temp)
				System.out.println("patient details are not found in the file");

		}
	}

	/**
	 * method to search by patient name
	 * 
	 */
	public void searchByPatientId(JSONArray patientArray) {
		System.out.println("enter the patient Id");
		String patientId = Utility.userInputString();

		@SuppressWarnings("rawtypes")
		Iterator iterator = patientArray.iterator();
		while (iterator.hasNext()) {
			JSONObject jsonObject = (JSONObject) iterator.next();
			if (jsonObject.get("patientId").equals(patientId)) {
				System.out.println("patientName : " + jsonObject.get("patientName"));
				System.out.println("id : " + jsonObject.get("patientId"));
				System.out.println("mobile number : " + jsonObject.get("pMobileNum"));
				System.out.println("patient age : " + jsonObject.get("PAge"));
			}
		}
		System.out.println("patient details are not found in the file");

	}

	/**
	 * method to search by patient mobile number
	 * 
	 */
	public void searchByPatientMobileNum(JSONArray patientArray) {
		System.out.println("enter the patient mobile number");
		String patientNum = Utility.userInputString();

		@SuppressWarnings("rawtypes")
		Iterator iterator = patientArray.iterator();
		while (iterator.hasNext()) {
			JSONObject jsonObject = (JSONObject) iterator.next();
			if (jsonObject.get("pMobileNum").equals(patientNum)) {
				System.out.println("patientName : " + jsonObject.get("patientName"));
				System.out.println("id : " + jsonObject.get("patientId"));
				System.out.println("mobile number : " + jsonObject.get("pMobileNum"));
				System.out.println("patient age : " + jsonObject.get("PAge"));
			}
		}
		// System.out.println("patient details are not found in the file");

	}

	/**
	 * method to display patient details
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public void ShowpatientDetails(JSONArray patientArray) 
	{

		Iterator iterator = patientArray.iterator();
		while (iterator.hasNext()) 
		{
			JSONObject jsonObject = (JSONObject) iterator.next();

			System.out.println("patientName : " + jsonObject.get("patientName"));
			System.out.println("id : " + jsonObject.get("patientId"));
			System.out.println("mobile number : " + jsonObject.get("pMobileNum"));
			System.out.println("patient age : " + jsonObject.get("pAge"));
			System.out.println();

		}

	}

	/**
	 * method to take appointment of doctor
	 * 
	 */
	@SuppressWarnings("unused")
	public void takeAppointment(JSONArray doctorArray, JSONArray patientArray) {
		int count = 0;
		if (doctorArray.size() < 5) {
			m.addDoctor();
		}
		if (count < 6) {
			System.out.println("enter the appointment date");
			// SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
			String date = utili.date();
			d.showDoctorDetails(doctorArray);
			System.out.println("Enter Docotor Id ");
			int did = Utility.readInteger();
			TakeAppointment appointment = new TakeAppointment(did, date);
			System.out.println("enter the patient name");
			String patientName = Utility.userInputString();
			System.out.println("enter the patient id");
			String patientId = Utility.userInputString();
			System.out.println("enter the patient mobile number");
			String pMobileNum = Utility.userInputString();
			System.out.println("enter the patient age");
			String pAge = Utility.userInputString();
			PatientPojo patient = new PatientPojo(patientName, patientId, pMobileNum, pAge);
			JSONObject jsonObject = patient.tojsonObject();
			utili.printPatientList(jsonObject);
			System.out.println("appointment scheduled on " + date);
			count++;
		}

	}

}
