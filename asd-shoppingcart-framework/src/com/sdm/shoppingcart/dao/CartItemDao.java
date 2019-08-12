package com.sdm.shoppingcart.dao;

import java.util.ArrayList;
import java.util.List;

import com.sdm.shoppingcart.jdbc.IJdbcManager;
import com.sdm.shoppingcart.jdbc.JdbcMemoryManager;
import com.sdm.shoppingcart.jdbc.db.DBLog;
import com.sdm.shoppingcart.jdbc.db.IDataBaseDomain;
import com.sdm.shoppingcart.model.CartItem;

public class CartItemDao implements InterfaceDao<CartItem> {
	
	private static IJdbcManager manager = new JdbcMemoryManager();
	private static CartItemDao instance = new CartItemDao();  
	private CartItemDao (){}  
    public static CartItemDao getInstance() {  
    	return instance;  
    }

	@Override
	public CartItem save(CartItem t) {
		// TODO Auto-generated method stub
		CartItem cartItem = (CartItem)manager.addItem(t);
		DBLog.log("save by DAO:", t);
		return cartItem;
	}

	@Override
	public void remove(long id) {
		// TODO Auto-generated method stub
		manager.removeItemWithId(id);
		DBLog.log("save by DAO:", id);
	}

	@Override
	public void update(CartItem t) {
		// TODO Auto-generated method stub
		manager.updateItem(t);
		DBLog.log("update by DAO:", t);
	}

	@Override
	public CartItem getById(long id) {
		// TODO Auto-generated method stub
		CartItem cartItem = (CartItem) manager.getItemById(id);
		DBLog.log("get by DAO:", cartItem);
		return cartItem;
	}

	@Override
	public List<CartItem> getAll() {
		// TODO Auto-generated method stub
		List<IDataBaseDomain> domains = manager.getAll();
		List presenter = domains;
		List<CartItem> list = presenter;
		DBLog.log("get all by DAO count:", list.size());
		return list;
	}
	
	public List<CartItem> getAllByUserId(long userId) {
		
		List<IDataBaseDomain> domains = manager.getAll();
		List presenter = domains;
		List<CartItem> list = presenter;
		List<CartItem> res = new ArrayList<CartItem>();
		
		for (CartItem item: list) {
			if (item.userId == userId) {
				res.add(item);
			}
		}
		
		DBLog.log("get all by DAO count:", list.size());
		return res;
	}

}
