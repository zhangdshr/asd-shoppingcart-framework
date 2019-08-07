package com.sdm.shoppingcart.dao;

import com.sdm.shoppingcart.jdbc.IJdbcManager;
import com.sdm.shoppingcart.jdbc.JdbcMemoryManager;
import com.sdm.shoppingcart.model.Product;

public class ProductDao implements InterfaceDao<Product> {

	private static IJdbcManager manager = new JdbcMemoryManager();
	private static ProductDao instance = new ProductDao();  
	private ProductDao (){}  
    public static ProductDao getInstance() {  
    	return instance;  
    }
    
	@Override
	public Product save(Product t) {
		// TODO Auto-generated method stub
		Product product2 = (Product) manager.addItem(t);
		DaoLog.log("save by DAO:", t);
		return product2;
	}

	@Override
	public void remove(long id) {
		// TODO Auto-generated method stub
		manager.removeItemWithId(id);
		DaoLog.log("save by DAO:", id);
	}

	@Override
	public void update(Product t) {
		// TODO Auto-generated method stub
		manager.updateItem(t);
		DaoLog.log("update by DAO:", t);
	}

	@Override
	public Product getById(long id) {
		// TODO Auto-generated method stub
		Product product = (Product) manager.getItemById(id);
		DaoLog.log("get by DAO:", product);
		return product;
	}


}
