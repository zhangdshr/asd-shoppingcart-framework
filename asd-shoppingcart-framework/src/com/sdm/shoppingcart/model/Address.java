package com.sdm.shoppingcart.model;


import java.util.*;

/**
 * 
 */
public class Address {

    /**
     * Default constructor
     */
    public Address() {
    }

    public String state;
    public String city;
    /**
     * 
     */
    public String desc;

    /**
     * 
     */
    public String phone;

    /**
     * 
     */
    public String email;

    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "Address{" +
                "state=" + state +
              ", city=" + city +
              ", desc=" + desc +
              ", email=" + email +
              ", phone=" + phone +
              '}';
    }
}