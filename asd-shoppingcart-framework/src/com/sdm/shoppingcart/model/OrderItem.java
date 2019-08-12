package com.sdm.shoppingcart.model;


import java.util.*;

/**
 * 
 */
public class OrderItem {

    /**
     * Default constructor
     */
    public OrderItem() {
    }

    /**
     * 
     */
    public Product product;

    /**
     * 
     */
    public int count;

    /**
     * 
     */

    public OrderItem(Product product, int count) {
        this.product = product;
        this.count = count;
    }
}