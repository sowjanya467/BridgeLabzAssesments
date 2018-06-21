/**
 * 
 */
package com.bridgelabz.oops;
/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since -05-17
 *
 * **************************************************************************************************/

import org.json.simple.JSONObject;

public class PersonnDetails
{

	String firstName;
	String lastname;
	String address;
	String city;
	String state;
	String zipCode;
	String phoneNum;
	
	public PersonnDetails(String firstname,String lastname,String address,String city,String state,String zip,String phoneNum) 
	{
		this.firstName=firstname;
		this.lastname=lastname;
		this.address=address;
		this.city=city;
		this.state=state;
		this.zipCode=zip;
		this.phoneNum=phoneNum;
	}
	
	/**
	 * @param firstName 
	 * @param lastname 
	 * 
	 */
	public PersonnDetails(String firstName, String lastname) 
	{
		this.firstName=firstName;
		this.lastname=lastname;
	}

	@SuppressWarnings("unchecked")
	public JSONObject toJsonObject() 
	{
		JSONObject jsonobject=new JSONObject();
		jsonobject.put("First Name", firstName);
		jsonobject.put("Last Name", lastname);
		jsonobject.put("Address", address);
		jsonobject.put("City", city);
		jsonobject.put("State",state);
		jsonobject.put("Zip",zipCode);
		jsonobject.put("Phone Number",phoneNum);
		return jsonobject;
		
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the zip
	 */
	public String getZip() {
		return zipCode;
	}

	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zipCode = zip;
	}

	/**
	 * @return the phoneNum
	 */
	public String getPhoneNum() {
		return phoneNum;
	}

	/**
	 * @param phoneNum the phoneNum to set
	 */
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
}