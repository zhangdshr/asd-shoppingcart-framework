package com.sdm.shoppingcart.model;


import com.sdm.shoppingcart.jdbc.db.IDataBaseDomain;

/**
 * 
 */
public class Product implements IDataBaseDomain {

    /**
     * Default constructor
     */
    public Product() {
    }

    /**
     * 
     */
    public long id;

    /**
     * 
     */
    public String name;

    /**
     * 
     */
    public float price;

    /**
     * 
     */
    public String desc;

    /**
     * 
     */
    public String madeIn;

    /**
     * 
     */
    public long categeryId;

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
		String string = "Product:   ";
		string += "id:" + id + "  ";
		string += "name:" + name + "  ";
		string += "price:" + price + "  ";
		return string;
	}

}