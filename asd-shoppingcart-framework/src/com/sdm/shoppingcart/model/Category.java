package com.sdm.shoppingcart.model;

import com.sdm.shoppingcart.jdbc.db.IDataBaseDomain;

/**
 * 
 */
public class Category implements IDataBaseDomain {

    /**
     * Default constructor
     */
	public Category() {
		// TODO Auto-generated constructor stub
	}
    public Category(String name) {
    	this.name = name;
    }

    /**
     * 
     */
    public long id;

    /**
     * 
     */
    public String name;

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
		String string = "Category:   ";
		string += "id:" + id + "  ";
		string += "name:" + name + "  ";
		return string;
	}
}