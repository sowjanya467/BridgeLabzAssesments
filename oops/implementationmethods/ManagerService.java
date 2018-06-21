/**
 * 
 */
package com.bridgelabz.oops.implementationmethods;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since -05-17
 *
 **************************************************************************************************/

public interface ManagerService 
{
	void addPatient();

	void deletePatient(JSONObject jsonobject, JSONArray patientArray, int i);

	void updatePatient(JSONObject jsonobject, JSONArray PatientArray, int i);

	void addDoctor();

	void deleteDoctor(JSONObject jsonobject, JSONArray doctorList, int i);

	void updateDoctor(JSONObject jsonobject, JSONArray doctorList, int i);

	void userChoice(int choice);

	void userinputChoice(int choice);

}
