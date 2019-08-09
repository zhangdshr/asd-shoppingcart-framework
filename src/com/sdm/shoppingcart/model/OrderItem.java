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
    public float price;

    public OrderItem(Product product, int count, float price) {
        this.product = product;
        this.count = count;
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}