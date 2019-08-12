package com.sdm.shoppingcart.model;

import java.util.*;

import com.sdm.shoppingcart.jdbc.db.IDataBaseDomain;

/**
 * 
 */
public class CartItem implements IDataBaseDomain {

	/**
	 * Default constructor
	 */
	public CartItem() {
	}

	/**
	 * 
	 */
	public Product product;

	/**
	 * 
	 */
	public int count;

	public long id;
	
	public long userId;

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
		String string = "CartItem:   ";
		string += "id:" + id + "  ";
		string += "name:" + product.name + "  ";
		string += "count:" + count + "  ";
		string += "price:" + product.price + "  ";
		return string;
	}

}