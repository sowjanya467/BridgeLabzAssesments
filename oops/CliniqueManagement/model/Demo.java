/**
 * 
 *//*
package com.bridgelabz.oops.CliniqueManagement.model;

*//*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since -05-17
 *
 * **************************************************************************************************//*

public class Demo {


	public String toString() {
			return doctorName + " " + doctorId + " " + availableTime + " " + specialization + " " + countOfPatients;

public class Utility {
		public static Scanner scanner = new Scanner(System.in);
		public static ObjectMapper mapper=new ObjectMapper();
		 Doctor doctor;
		Patient patient;
		public static String userInputString() {
			return scanner.next();
		}
	
		public static int userInputInteger() {
			return scanner.nextInt();
		}
	
		public static Double userInputDouble() {
			return scanner.nextDouble();
		}
	
		public static boolean userInputBoolean() {
			return scanner.nextBoolean();
		}
	
		public static Long userInputLong() {
			return scanner.nextLong();
		}
		
		public static String userInputNextLine() {
			return scanner.nextLine();
		}
		
		public static <T> ArrayList<T> parseJSONArray(File file, Class<T> clazz)
	            throws JsonParseException, JsonMappingException, IOException {
	        ArrayList<T> arrayList = new ArrayList<T>();
	        CollectionType javaType = mapper.getTypeFactory()
	                  .constructCollectionType(List.class, clazz);
	        arrayList = mapper.readValue(file, javaType);
	
	        return arrayList;
	
	    }
		// Read Doctor details
	   public Doctor doctorDetails() {
		    System.out.println("Enter Doctor name");
		    //userInputNextLine();
		    String name=userInputNextLine();
		    System.out.println("Enter Doctor id");
		    int id=userInputInteger();
		    System.out.println("Enter Doctor available time");
		    String time=userInputString();
		    System.out.println("Enter Doctor Specialization");
		    String specialization=userInputString();
		    System.out.println("Enter count of patients");
		    int count=userInputInteger();
		    doctor=new Doctor(name,id,time,specialization,count);
		    return doctor;
	   }
	   //Read Patient details
	   public Patient patientDetails() {
		   System.out.println("Enter Patient name");
		   //userInputNextLine();
		   String name=userInputNextLine();
		   System.out.println("Enter patient id");
		   int id=userInputInteger();
		   System.out.println("Enter mobile number");
		   long mobile=userInputLong();
		   System.out.println("Enter patient age");
		   int age=userInputInteger();
		  patient=new Patient(name,id,mobile,age);
		  return patient;
	   }
	    public Appointment appointmentDetails() {
	    	System.out.println("Enter the Patient Name");
	    }
	   public <T> void search(ArrayList<T> list,T doctorName) {
		   
		   boolean search = false;
		   Method method=Class.forName("com.bridgelabz.model.Doctor").getMethod("getDoctorName");
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).method.getName().equalsIgnoreCase(doctorName)) {
					System.out.println("Doctor available ");
					search = true;
				}
			}
			if (!search) {
				System.out.println("Doctor not Available");
			}
	   }
	
	}

    

}
*/