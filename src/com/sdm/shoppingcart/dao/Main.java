package com.sdm.shoppingcart.dao;

import com.sdm.shoppingcart.model.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product = new Product();
		product.name = "Computer1";
		product.price = 6536;
		
		System.out.println(product);
		
		ProductDao productDao = ProductDao.getInstance();
		productDao.save(product);
		
		System.out.println(product);
		
		productDao.getById(product.getId());
		
		productDao.getAll();
	}

}
