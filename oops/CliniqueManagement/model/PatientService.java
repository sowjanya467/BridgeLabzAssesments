/**
 * 
 */
package com.bridgelabz.oops.CliniqueManagement.model;

import java.util.ArrayList;

import com.bridgelabz.oops.PojoProductDetails;
import com.bridgelabz.oops.CliniqueManagement.PatientPojo;
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

public class PatientService 
{
	 ArrayList<PatientPojo> patient=new ArrayList<>();
     

	public void addPatient()
	{
		
	}
	
	public static PatientPojo patientDetais()
	{
		PatientPojo patient=new PatientPojo();
		System.out.println("enter the patient name");
		String patientName=Utility.userInputString();
		patient.setPatientName(patientName);
		System.out.println("enter the patient age");
		String patientAge=Utility.userInputString();
		patient.setpAge(patientAge);
		System.out.println("enter the patient age");
		String patientId=Utility.userInputString();
		patient.setPatientId(patientId);
		System.out.println("enter the patient mobile number");
		String pMobileNum=Utility.userInputString();
		patient.setpMobileNum(pMobileNum);
		
		
		
		return patient;
		
	}
}
