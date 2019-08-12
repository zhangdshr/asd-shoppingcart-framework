package com.sdm.shoppingcart.factory;

import com.sdm.shoppingcart.model.Product;

public class ProductFactory {
	public static Product creatProduct(String name, float price, long category_id) {
		Product product = new Product();
		product.name = name;
		product.price = price;
		product.categeryId = category_id;
		return product;
	}
}
