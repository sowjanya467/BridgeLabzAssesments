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

public class PatientPojo 
{
	String patientName;
	String patientId;
	String pMobileNum;
	String pAge;
	
	/**
	 * @param patientName2
	 * @param patientId2
	 * @param pMobileNum2
	 */
	public PatientPojo(String patientName, String id, String mobile,String age) 
	{
		this.patientName=patientName;
		this.patientId=id;
		this.pMobileNum=mobile;
		this.pAge=age;
	}


	/**
	 * 
	 */
	public PatientPojo() {
		// TODO Auto-generated constructor stub
	}


	@SuppressWarnings("unchecked")
	public JSONObject tojsonObject()
	{
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("patientName", patientName);
		jsonObject.put("patientId", patientId);
		jsonObject.put("pMobileNum", pMobileNum);
		jsonObject.put("pAge", pAge);
		return jsonObject;
	}
	
	
	/**
	 * @return the patientName
	 */
	public String getPatientName() {
		return patientName;
	}
	/**
	 * @param patientName the patientName to set
	 */
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	/**
	 * @return the patientId
	 */
	public String getPatientId() {
		return patientId;
	}
	/**
	 * @param patientId the patientId to set
	 */
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	/**
	 * @return the pMobileNum
	 */
	public String getpMobileNum() {
		return pMobileNum;
	}
	/**
	 * @param pMobileNum the pMobileNum to set
	 */
	public void setpMobileNum(String pMobileNum) {
		this.pMobileNum = pMobileNum;
	}
	/**
	 * @return the pAge
	 */
	public String getpAge() {
		return pAge;
	}
	/**
	 * @param pAge the pAge to set
	 */
	public void setpAge(String pAge) {
		this.pAge = pAge;
	}
	

}
/*public void addPerson(String firstName, String lastName, String address, String city, String state, String zip,
String phone, String file)
throws JsonGenerationException, JsonMappingException, IOException, ParseException {

arrayList = pareseFile(file);
person = new Person(firstName, lastName, address, city, state, zip, phone);
arrayList.add(person);
File file1 = new File(file);
mapper.writeValue(file1, arrayList);
arrayList = pareseFile(file);
System.out.println(arrayList.toString());
}



@SuppressWarnings("unchecked")
public  ArrayList<Object> pareseFile(String fileName) throws FileNotFoundException, IOException, ParseException {
JSONParser parser = new JSONParser();
Object object = parser.parse(new FileReader(new File(fileName)));
JSONArray array = (JSONArray) object;
ArrayList<Object> arrayList = new ArrayList<>();
for (int i = 0; i < array.size(); i++) {
JSONObject obj = (JSONObject) array.get(i);
arrayList.add(obj);
} */