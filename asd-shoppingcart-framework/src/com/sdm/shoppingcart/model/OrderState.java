package com.sdm.shoppingcart.model;


import java.util.*;

/**
 * 
 */
public class OrderState {

    /**
     * Default constructor
     */
    private OrderState() {
    }

    /**
     * 
     */
    public STATE state;

    /**
     * Created : 1
     * paid : 2
     * Shipping : 3
     * recived : 4
     */

    public enum STATE{
    	CONSTRUCT("constructor", 0),
        CREATED("created", 1), 
        PAID("paid", 2), 
        SHIPPMENT("shipping", 3), 
        RECIVED("recived", 4);

    	private String name;
    	private int index;
	
		private STATE(String name, int index) {
			this.name = name;
			this.index = index;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return index + "_" + name;
		}
    }
    

    public OrderState(STATE state) {
        this.state = state;
    }

}