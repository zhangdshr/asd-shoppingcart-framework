package com.sdm.shoppingcart.model;


import java.util.*;

/**
 * 
 */
public class Order {

    /**
     * Default constructor
     */
    public Order() {
    }

    /**
     * 
     */
    public List<OrderItem> items;

    /**
     * 
     */
    public long submitTime;

    /**
     * 
     */
    public Address addr;

    /**
     * 
     */
    public OrderState orderState;

    /**
     * 
     */
    public long userId;

    /**
     * 
     */
    public float totalPrice;





}