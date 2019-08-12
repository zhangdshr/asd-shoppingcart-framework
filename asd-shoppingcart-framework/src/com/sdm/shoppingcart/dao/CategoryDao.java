package com.sdm.shoppingcart.dao;

import java.util.List;

import com.sdm.shoppingcart.jdbc.IJdbcManager;
import com.sdm.shoppingcart.jdbc.JdbcMemoryManager;
import com.sdm.shoppingcart.jdbc.db.DBLog;
import com.sdm.shoppingcart.jdbc.db.IDataBaseDomain;
import com.sdm.shoppingcart.model.Category;

public class CategoryDao implements InterfaceDao<Category> {
	private static IJdbcManager manager = new JdbcMemoryManager();
	private static CategoryDao instance = new CategoryDao();  
	private CategoryDao (){}  
    public static CategoryDao getInstance() {  
    	return instance;  
    }
	@Override
	public Category save(Category t) {
		// TODO Auto-generated method stub
		Category category = (Category) manager.addItem(t);
		DBLog.log("save by DAO:", t);
		return category;
	}

	@Override
	public void remove(long id) {
		// TODO Auto-generated method stub
		manager.removeItemWithId(id);
		DBLog.log("save by DAO:", id);
	}

	@Override
	public void update(Category t) {
		// TODO Auto-generated method stub
		manager.updateItem(t);
		DBLog.log("update by DAO:", t);
	}

	@Override
	public Category getById(long id) {
		// TODO Auto-generated method stub
		Category product = (Category) manager.getItemById(id);
		DBLog.log("get by DAO:", product);
		return product;
	}

	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		List<IDataBaseDomain> domains = manager.getAll();
		List presenter = domains;
		List<Category> list = presenter;
		DBLog.log("get all by DAO count:", list.size());
		return list;
	}

}
