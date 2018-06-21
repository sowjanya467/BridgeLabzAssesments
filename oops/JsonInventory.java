/**
 * 
 */
package com.bridgelabz.oops;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since -05-17
 *
 * **************************************************************************************************/

public class JsonInventory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int priceOfRice=0;
		int priceOfWheat=0;
		int priceOfPulses=0;
		int totalWeight=0;
		int tweight=0;
		int weight=0;

		JSONParser parser=new JSONParser();
		File file=new File("/home/bridgelabz/FileHolders/inventorydetails.json");
		try {
			Object ob =parser.parse(new FileReader(file));
			JSONObject jsonobj=(JSONObject)ob;
			//JSONArray array=(JSONArray)ob;
			
			JSONArray rice=(JSONArray)jsonobj.get("Rice");
			System.out.println(rice.toString());
			/*for(Object types: rice)
			{

				System.out.println(types.toString());
				//System.out.println(types.getClass());
			}*/
			for(int i=0;i<rice.size();i++)
	           {
					JSONObject riceobj=(JSONObject) rice.get(i);
					priceOfRice+=(Integer.parseInt(riceobj.get("Price per kg").toString()));
					totalWeight+=(Integer.parseInt(riceobj.get("weight in kg").toString()));
	           }
            System.out.println("Total price of rice is  "+priceOfRice+" for "+totalWeight+ " KG");
           // System.out.println("Total weight of rice is "+totalWeight);
		   System.out.println();     
           JSONArray wheat=(JSONArray)jsonobj.get("Wheat");
    	   System.out.println(wheat.toString());

           for(int i=0;i<wheat.size();i++)
           {
				JSONObject wheatobj=(JSONObject) wheat.get(i);
				priceOfWheat+=(Integer.parseInt(wheatobj.get("Price per kg").toString()));
				tweight+=(Integer.parseInt(wheatobj.get("weight in kg").toString()));

           }
           System.out.println("Total price of wheat is  "+priceOfWheat+" for "+tweight+ " KG");

           System.out.println();
           JSONArray pulses=(JSONArray)jsonobj.get("Pulses");
           System.out.println(pulses.toString());
           for(int i=0;i<pulses.size();i++)
           {
				JSONObject pulseobj=(JSONObject) pulses.get(i);
				 priceOfPulses+=(Integer.parseInt(pulseobj.get("Price per kg").toString()));
					weight+=(Integer.parseInt(pulseobj.get("weight in kg").toString()));

				// sum=sum+(Integer.parseInt(pulseobj.get("Price per kg").toString()));

           }
           System.out.println("Total price of pulses is  "+priceOfPulses+" for "+weight+ " KG");


		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
