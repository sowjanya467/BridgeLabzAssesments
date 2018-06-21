/**
 * 
 */
package com.bridgelabz.oops.CliniqueManagement;

/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since -05-17
 *
 **************************************************************************************************/

public class DoctorAppointment
{
	String id;
	String AppointmentDate;

	public DoctorAppointment(String id, String date)
	{
		this.id = id;
		this.AppointmentDate = date;
	}

	public boolean checkAvailability(Object ob)
	{
		if (ob == null)
			return false;
		if (ob == this)
			return true;
		else
			return false;
	}

	public String toString()
	{
		String ob = null;
		ob = this.id + this.AppointmentDate;
		return ob;
	}

	/**
	 * @return the id
	 */
	public String getId()
	{
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id)
	{
		this.id = id;
	}

	/**
	 * @return the appointmentDate
	 */
	public String getAppointmentDate()
	{
		return AppointmentDate;
	}

	/**
	 * @param appointmentDate
	 *            the appointmentDate to set
	 */
	public void setAppointmentDate(String appointmentDate)
	{
		AppointmentDate = appointmentDate;
	}

}
