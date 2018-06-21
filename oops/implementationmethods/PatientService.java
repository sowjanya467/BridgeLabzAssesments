/**
 * 
 */
package com.bridgelabz.oops.implementationmethods;

import org.json.simple.JSONArray;

import com.bridgelabz.oops.CliniqueManagement.model.PatientServiceImplementation;

/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since -05-17
 *
 **************************************************************************************************/

public interface PatientService
{

	public static final PatientServiceImplementation patient = new PatientServiceImplementation();

	public void userChoice(int choice);

	void searchByPatientName(JSONArray patientArray);

	void searchByPatientId(JSONArray patientArray);

	void searchByPatientMobileNum(JSONArray patientArray);

	void ShowpatientDetails(JSONArray patientArray);

}
