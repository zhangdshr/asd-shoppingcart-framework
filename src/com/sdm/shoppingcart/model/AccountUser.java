package com.sdm.shoppingcart.model;


import java.util.*;

import com.sdm.shoppingcart.jdbc.db.IDataBaseDomain;

/**
 * 
 */
public class AccountUser implements IDataBaseDomain {

    /**
     * Default constructor
     */
    public AccountUser() {
    }

    /**
     * 
     */
    public String username;

    /**
     * 
     */
    public String password;

    /**
     * 
     */
    public long userId;
    
    /**
     * 
     */
    public int userType;

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return userId;
	}

	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub
		this.userId = id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String string = "AccountUser:   ";
		string += "id:" + userId + "  ";
		string += "username:" + username + "  ";
		string += "password:" + password + "  ";
		string += "userType:" + userType + "  ";
		return string;
	}

}