/**
 * 
 */
package com.bridgelabz.oops;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since -05-17
 *
 * **************************************************************************************************/

public class StockPojo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 601136840501454873L;
	private String shareName;
	private int numberOfShares;
	private int sharePrice;
	/**
	 * @return the shareName
	 */
	public String getShareName() {
		return shareName;
	}
	/**
	 * @param shareName the shareName to set
	 */
	public void setShareName(String shareName) {
		this.shareName = shareName;
	}
	/**
	 * @return the numberOfShares
	 */
	public int getNumberOfShares() {
		return numberOfShares;
	}
	/**
	 * @param numberOfShares the numberOfShares to set
	 * @return 
	 * @return 
	 */
	public  void setNumberOfShares(int numberOfShares) {
		 this.numberOfShares = numberOfShares;
	}
	/**
	 * @return the sharePrice
	 */
	public int getSharePrice() {
		return sharePrice;
	}
	/**
	 * @param sharePrice the sharePrice to set
	 * @return 
	 */
	public void setSharePrice(int sharePrice) {
		 this.sharePrice = sharePrice;
	}
	
}
