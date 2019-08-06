package com.sdm.shoppingcart.dao;

import java.util.HashMap;
import java.util.Map;

import com.sdm.shoppingcart.model.Product;

public class ProductDaoImpl implements ProductDao {

	private Map<Long, Product> data = new HashMap<Long, Product>();

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		data.put(product.id, product);
	}

	@Override
	public void removeProduct(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void editProduct(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public Product getProductById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
