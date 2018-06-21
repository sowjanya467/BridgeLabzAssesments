/**
 * 
 */
package com.bridgelabz.oops.commercialDataProcessing;

/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since -05-17
 *
 * **************************************************************************************************/

public class Stocks
{
	
		private String name;
		private double price;
		private int numberOfShares;
		private String dateTime;
		/**
		 * @return the symbol
		 */
		public String getSymbol() {
		    return name;
		}
		/**
		 * @param symbol the symbol to set
		 */
		public void setSymbol(String symbol) {
		    this.name = symbol;
		}
		/**
		 * @return the price
		 */
		public double getPrice() {
		    return price;
		}
		/**
		 * @param price the price to set
		 */
		public void setPrice(double price) {
		    this.price = price;
		}
		/**
		 * @return the noOfShares
		 */
		public int getNoOfShares() {
		    return numberOfShares;
		}
		/**
		 * @param noOfShares the noOfShares to set
		 */
		public void setNoOfShares(int noOfShares) {
		    this.numberOfShares = noOfShares;
		}
		/**
		 * @return the dateTime
		 */
		public String getDateTime() {
		    return dateTime;
		}
		/**
		 * @param dateTime the dateTime to set
		 */
		public void setDateTime(String dateTime) {
		    this.dateTime = dateTime;
		}
		public double getValue() {
		    return numberOfShares * price;
		}

		public String toString() {
		    return "\nShare Details: \n" + name + ", " + numberOfShares + ", " + price;
		}
		



}
