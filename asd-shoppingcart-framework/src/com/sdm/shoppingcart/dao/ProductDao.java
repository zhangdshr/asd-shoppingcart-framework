package com.sdm.shoppingcart.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.sdm.shoppingcart.jdbc.IJdbcManager;
import com.sdm.shoppingcart.jdbc.JdbcMemoryManager;
import com.sdm.shoppingcart.jdbc.db.DBLog;
import com.sdm.shoppingcart.jdbc.db.IDataBaseDomain;
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
		DBLog.log("save by DAO:", t);
		return product2;
	}

	@Override
	public void remove(long id) {
		// TODO Auto-generated method stub
		manager.removeItemWithId(id);
		DBLog.log("save by DAO:", id);
	}

	@Override
	public void update(Product t) {
		// TODO Auto-generated method stub
		manager.updateItem(t);
		DBLog.log("update by DAO:", t);
	}

	@Override
	public Product getById(long id) {
		// TODO Auto-generated method stub
		Product product = (Product) manager.getItemById(id);
		DBLog.log("get by DAO:", product);
		return product;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		List<IDataBaseDomain> domains = manager.getAll();
		List presenter = domains;
		List<Product> list = presenter;
		DBLog.log("get all by DAO count:", list.size());
		return list;
	}
	
	public List<Product> getProductListByCategoryId(long category_id) {
		List<Product> domains = getAll();
		List<Product> list = new ArrayList<Product>();
		for (Iterator<Product> iterator = domains.iterator(); iterator.hasNext();) {
			Product product = iterator.next();
			if (product.categeryId == category_id) {
				list.add(product);
			}
		}
		DBLog.log("get Product List By CategoryId by DAO count:", list.size());
		return list;
	}
}
