package com.sdm.shoppingcart.dao;

import java.util.List;

import com.sdm.shoppingcart.jdbc.IJdbcManager;
import com.sdm.shoppingcart.jdbc.JdbcMemoryManager;
import com.sdm.shoppingcart.jdbc.db.DBLog;
import com.sdm.shoppingcart.jdbc.db.IDataBaseDomain;
import com.sdm.shoppingcart.model.AccountUser;

public class UserDao implements InterfaceDao<AccountUser> {
	
	private static IJdbcManager manager = new JdbcMemoryManager();
	private static UserDao instance = new UserDao();  
	private UserDao (){}  
    public static UserDao getInstance() {  
    	return instance;  
    }

	@Override
	public AccountUser save(AccountUser t) {
		// TODO Auto-generated method stub
		AccountUser user = (AccountUser)manager.addItem(t);
		DBLog.log("save by DAO:", t);
		return user;
	}

	@Override
	public void remove(long id) {
		// TODO Auto-generated method stub
		manager.removeItemWithId(id);
		DBLog.log("save by DAO:", id);
	}

	@Override
	public void update(AccountUser t) {
		// TODO Auto-generated method stub
		manager.updateItem(t);
		DBLog.log("update by DAO:", t);
	}

	@Override
	public AccountUser getById(long id) {
		// TODO Auto-generated method stub
		AccountUser user = (AccountUser) manager.getItemById(id);
		DBLog.log("get by DAO:", user);
		return user;
	}

	@Override
	public List<AccountUser> getAll() {
		// TODO Auto-generated method stub
		List<IDataBaseDomain> domains = manager.getAll();
		List presenter = domains;
		List<AccountUser> list = presenter;
		DBLog.log("get all by DAO count:", list.size());
		return list;
	}

}
