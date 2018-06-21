/**
 * 
 */
package com.bridgelabz.oops.CliniqueManagement;

import org.json.simple.JSONObject;

/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since -05-17
 *
 * **************************************************************************************************/

public class DoctorPojo 
{
	String doctorName;
	String doctorId;
	String docSpec;
	String docAvail;
	int count;
	
	public DoctorPojo(String doctorName, String doctorId, String docSpec, String docAvail)
	{
        this.doctorName=doctorName;
        this.doctorId=doctorId;
        this.docSpec=docSpec;
        this.docAvail=docAvail;
        //this.count=count;
    }
	/**
	 * 
	 */
	public DoctorPojo() {
		// TODO Auto-generated constructor stub
	}
	@SuppressWarnings("unchecked")
	public JSONObject toJsonObject()
	{
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("doctorName", doctorName);
		jsonObject.put("doctorId", doctorId);
		jsonObject.put("docSpec", docSpec);
		jsonObject.put("docAvail", docSpec);
		return jsonObject;
	}
	
	
	
	/**
	 * @return the doctorName
	 */
	public String getDoctorName() {
		return doctorName;
	}
	/**
	 * @param doctorName the doctorName to set
	 */
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	/**
	 * @return the doctorId
	 */
	public String getDoctorId() {
		return doctorId;
	}
	/**
	 * @param doctorId the doctorId to set
	 */
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	/**
	 * @return the docSpec
	 */
	public String getDocSpec() {
		return docSpec;
	}
	/**
	 * @param docSpec the docSpec to set
	 */
	public void setDocSpec(String docSpec) {
		this.docSpec = docSpec;
	}
	/**
	 * @return the docAvail
	 */
	public String getDocAvail() {
		return docAvail;
	}
	/**
	 * @param docAvail the docAvail to set
	 */
	public void setDocAvail(String docAvail) {
		this.docAvail = docAvail;
	}
}
