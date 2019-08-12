package com.sdm.shoppingcart.api;

import java.util.List;

import com.sdm.shoppingcart.model.Category;
import com.sdm.shoppingcart.model.Product;

interface SellerAPI {

	Product addProduct(Product product);
	
	void removeProduct(long product_id);
	
	void editProduct(Product product);
	
	List<Product> getAllProducts();
	
	List<Product> getProductListByCategoryId(long category_id);
	
	Product getProductDetailById(long product_id);
	
	Category addCategory(Category category);
	
	void removeCategory(long category_id);
	
	void editCategory(Category category);
	
	List<Category> getCategoryList();
	
	//...

}
