/**
 * 
 */
package com.bridgelabz.oops;

import java.util.ArrayList;

/*************************************************************************************************************
 *
 * purpose:
 *
 * @author sowjanya467
 * @version 1.0
 * @since -05-17
 *
 * **************************************************************************************************/

public class InventoryFactory {

	 ArrayList<PojoProductDetails> rice=new ArrayList<>();
     public ArrayList<PojoProductDetails> getrice(){
          return rice;
      }
      public void setStockList(ArrayList<PojoProductDetails> rice) {
          this.rice=rice;
      }
      ArrayList<PojoProductDetails> pulse=new ArrayList<>();
    public ArrayList<PojoProductDetails> getPulse() {
        return pulse;
    }
    public void setPulse(ArrayList<PojoProductDetails> pulse) {
        this.pulse = pulse;
    }
    ArrayList<PojoProductDetails> wheat=new ArrayList<>();
    public ArrayList<PojoProductDetails> getWheat() {
        return wheat;
    }
    public void setWheat(ArrayList<PojoProductDetails> wheat) {
        this.wheat = wheat;
    }
}
