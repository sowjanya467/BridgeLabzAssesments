/**
 * 
 */
package com.bridgelabz.oops.CliniqueManagement;

import com.bridgelabz.oops.CliniqueManagement.model.DoctorServiceImplementation;
import com.bridgelabz.oops.CliniqueManagement.model.ManagerServiceImplementatio;
import com.bridgelabz.oops.CliniqueManagement.model.PatientServiceImplementation;
import com.bridgelabz.oops.implementationmethods.DoctorService;
import com.bridgelabz.oops.implementationmethods.ManagerService;
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

public class Clinique 
{

	public static PatientService patient = new PatientServiceImplementation();
	public static DoctorService doctor = new DoctorServiceImplementation();
	public static ManagerService manager = new ManagerServiceImplementatio();

	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{
		System.out.println("*******Welocome to clinique management*********");
		System.out.println("enter the choice to perform the action");
		System.out.println("1.Add patient");
		System.out.println("2.search by patient name");
		System.out.println("3.search by patient ID:");
		System.out.println("4.search by patient mobile number:");
		System.out.println("5.add doctor");
		System.out.println("6.delete doctor");
		System.out.println("7.update doctor");
		System.out.println("8.delete patient");
		System.out.println("9.update patient");
		System.out.println("10.search by doctor name");
		System.out.println("11.show patient details");
		// System.out.println("12 show patient details");
		System.out.println("12.show doctor details");
		System.out.println("13.take appointment");
		System.out.println("enter the choice ");
		int choice = Utility.readInteger();
		switch (choice) 
		{
		case 1:
			System.out.println("add the patient :");
			manager.addPatient();
			break;
		case 2:
			System.out.println("search by patient name");
			patient.userChoice(choice);
			break;
		case 3:
			System.out.println("search by patient id");
			patient.userChoice(choice);
			break;
		case 4:
			System.out.println("search by patient mobile number");
			patient.userChoice(choice);
			break;
		case 5:
			System.out.println("add the doctor");
			manager.addDoctor();
			break;
		case 6:
			System.out.println("delete doctor");
			manager.userChoice(choice);
			break;
		case 7:
			System.out.println("update doctor");
			manager.userChoice(choice);
			break;
		case 8:
			System.out.println("delete patient");
			manager.userinputChoice(choice);
			break;
		case 9:
			System.out.println("update patient");
			manager.userinputChoice(choice);
			break;
		case 10:
			System.out.println("search by doctor name");
			doctor.userChoice(choice);
			break;
		case 11:
			System.out.println("show patient details");
			patient.userChoice(choice);
			break;
		case 12:
			System.out.println("show doctor list");
			doctor.userChoice(choice);
			break;
		case 13:
			System.out.println("take appointment");
			patient.userChoice(choice);
			break;
		default:
			System.out.println("enter the correct option ");
			break;
		}

	}

}
