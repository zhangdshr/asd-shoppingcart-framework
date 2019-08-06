package com.sdm.shoppingcart.dao;

import com.sdm.shoppingcart.model.Product;

public interface ProductDao {

	public void addProduct(Product product);

	public void removeProduct(long id);

	public void editProduct(Product product);

	public Product getProductById(long id);

}
