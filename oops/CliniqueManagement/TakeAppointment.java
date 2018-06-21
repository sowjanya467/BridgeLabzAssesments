/**
 * 
 */
package com.bridgelabz.oops.CliniqueManagement;

import java.sql.Date;

/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since -05-17
 *
 * **************************************************************************************************/

public class TakeAppointment 
{
		Integer d_id;
		String date;

		// constructor
		public TakeAppointment(int did, String date2) {
			this.d_id = did;
			this.date = date2;
		}

		// getter and setter methods
		public int getDid() {
			return d_id;
		}

		public void setDid(int did) {
			this.d_id = did;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String toString() {
			return "TakeAppointment [did=" + d_id + ", date=" + date + "]";
		}

		public int hashCode() {
			return this.d_id.hashCode() + this.date.hashCode();
		}

		// checking for equality
		public boolean equals(Object object) {
			if (object == null)
				return false;
			if (object == this)
				return true;
			if (!(object instanceof TakeAppointment))
				return false;

			TakeAppointment dA = (TakeAppointment) object;

			if ((this.d_id == dA.d_id) && (this.date.equals(dA.date)))
				return true;
			else
				return false;
		}
	}
