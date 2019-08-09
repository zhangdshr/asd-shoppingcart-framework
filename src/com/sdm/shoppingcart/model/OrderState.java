package com.sdm.shoppingcart.model;


import java.util.*;

/**
 * 
 */
public class OrderState {

    /**
     * Default constructor
     */
    public OrderState() {
    }

    /**
     * 
     */
    public String stateName;

    /**
     * Unpaid : 1
     * Paid : 2
     * Shipped : 3
     * Deliverd : 4
     */
    public int stateId;

//    enum STATE{
//        UNPAID, PAID, SHIPPMENT, ARRIVED;
//    }

    public OrderState(String stateName, int stateId) {
        this.stateName = stateName;
        this.stateId = stateId;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }
}