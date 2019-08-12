package com.sdm.shoppingcart.model;

import java.util.*;

import com.sdm.shoppingcart.jdbc.db.IDataBaseDomain;

/**
 * 
 */
public class ShoppingCart implements IDataBaseDomain {

	/**
	 * Default constructor
	 */
	public ShoppingCart() {
	}

	public long id;
	
	public long userId;

	/**
	 * 
	 */
	public List<CartItem> items;

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub
		this.id = id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String string = "ShoppingCart:   ";
		string += "id:" + id + "  ";
		string += "userId:" + userId + "  ";
		return string;
	}

}