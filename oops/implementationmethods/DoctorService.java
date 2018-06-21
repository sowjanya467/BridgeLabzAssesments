/**
 * 
 */
package com.bridgelabz.oops.implementationmethods;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgelabz.oops.CliniqueManagement.DoctorPojo;

/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since -05-17
 *
 **************************************************************************************************/

public interface DoctorService 
{
	void userChoice(int choice);

	void searchDoctor(List<DoctorPojo> doctorList);

	void searchDoctorId(JSONObject jsonObject, JSONArray doctorList);

	void searchDoctorAvailability(JSONObject jsonObject, JSONArray doctorList);

	void showDoctorDetails(List<DoctorPojo> doctorList);

}
