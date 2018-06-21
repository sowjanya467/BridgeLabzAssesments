/**
 * 
 */
package com.bridgelabz.oops;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Set;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.utility.Utility;

/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since -05-17
 *
 * **************************************************************************************************/

public class InventoryManagementData 
{

    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException {

        InventoryFactory inventoryFactory = new InventoryFactory();

        ObjectMapper map = new ObjectMapper();
   
        PojoProductDetails details = new PojoProductDetails();

        System.out.println("enter no. of rice types");
        int noOftypes = Utility.readInteger();
        for (int i = 0; i < noOftypes; i++) {
            details = productData();
            inventoryFactory.getrice().add(details);
        }

        System.out.println("enter no. ofPulses types");
        int noOfpulse = Utility.readInteger();
        for (int i = 0; i < noOfpulse; i++) {
            details = productData();
            inventoryFactory.getPulse().add(details);
        }

        System.out.println("enter no. of Wheat types");
        int wheatTypes = Utility.readInteger();
        for (int i = 0; i < wheatTypes; i++) {
            details = productData();
            inventoryFactory.getWheat().add(details);
        }
        map.writeValue(new File("/home/bridgelabz/FileHolders/inventorydetails4.json"), inventoryFactory);
        Object object = new JSONParser().parse(new FileReader("/home/bridgelabz/FileHolders/inventorydetails4.json"));

        JSONObject jsonObject = (JSONObject) object;
        @SuppressWarnings("unchecked")
        Set<String> keys = jsonObject.keySet();

        for (String inventorykeys : keys) {
            JSONArray inventoryarray = (JSONArray) jsonObject.get(inventorykeys);
            long totalprice = 0;

            for (Object object2 : inventoryarray) {
                JSONObject inventory = (JSONObject) object2;
                long weight = (long) inventory.get("weight");
                long price = (long) inventory.get("price");
                totalprice += (weight * price);
            }
            System.out.println("price of " + inventorykeys + " is " + totalprice);
        }

    }

    public static PojoProductDetails productData() {
        PojoProductDetails poJoProductDetails = new PojoProductDetails();
        //Utility utility = new Utility();
        System.out.println("Enter name: ");
        String name = Utility.userInputString();
        poJoProductDetails.setName(name);

        System.out.println("Enter price:");
        long price = Utility.readInteger();
        poJoProductDetails.setPrice(price);

        System.out.println("Enter Weight: ");
        long weight = Utility.readInteger();
        poJoProductDetails.setWeight(weight);
        return poJoProductDetails;
    }


}
