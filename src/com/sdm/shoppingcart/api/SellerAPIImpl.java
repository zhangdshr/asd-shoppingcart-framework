package com.sdm.shoppingcart.api;

import java.util.List;

import com.sdm.shoppingcart.dao.CategoryDao;
import com.sdm.shoppingcart.dao.ProductDao;
import com.sdm.shoppingcart.model.Category;
import com.sdm.shoppingcart.model.Product;

public class SellerAPIImpl implements SellerAPI {
	private ProductDao productDao = ProductDao.getInstance();
	private CategoryDao categoryDao = CategoryDao.getInstance();

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.save(product);
	}

	@Override
	public void removeProduct(long product_id) {
		// TODO Auto-generated method stub
		productDao.remove(product_id);
	}

	@Override
	public void editProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.remove(product.id);
	}

	@Override
	public List<Product> getProductListByCategoryId(long category_id) {
		// TODO Auto-generated method stub
		return productDao.getProductListByCategoryId(category_id);
	}

	@Override
	public Product getProductDetailById(long product_id) {
		// TODO Auto-generated method stub
		return productDao.getById(product_id);
	}

	@Override
	public void addCategory(Category category) {
		// TODO Auto-generated method stub
		categoryDao.save(category);
	}

	@Override
	public void removeCategory(long category_id) {
		// TODO Auto-generated method stub
		categoryDao.remove(category_id);
	}

	@Override
	public void editCategory(Category category) {
		// TODO Auto-generated method stub
		categoryDao.update(category);
	}

	@Override
	public List<Category> getCategoryList() {
		// TODO Auto-generated method stub
		return categoryDao.getAll();
	}



}
