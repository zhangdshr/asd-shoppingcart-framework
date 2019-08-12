package com.sdm.shoppingcart.jdbc;

import java.util.List;

import com.sdm.shoppingcart.jdbc.db.DataBase;
import com.sdm.shoppingcart.jdbc.db.IDataBase;
import com.sdm.shoppingcart.jdbc.db.IDataBaseDomain;

/*
 * This is a adapter
 */
public class JdbcMemoryManager implements IJdbcManager {
	private IDataBase dataBase = new DataBase();

	@Override
	public IDataBaseDomain addItem(IDataBaseDomain t) {
		// TODO Auto-generated method stub
		return dataBase.addItem(t);
	}

	@Override
	public void removeItemWithId(long id) {
		// TODO Auto-generated method stub
		dataBase.removeItemWithId(id);
	}

	@Override
	public void updateItem(IDataBaseDomain t) {
		// TODO Auto-generated method stub
		dataBase.updateItem(t);
	}

	@Override
	public IDataBaseDomain getItemById(long id) {
		// TODO Auto-generated method stub
		return dataBase.getItemById(id);
	}
	
	@Override
	public List<IDataBaseDomain> getAll() {
		// TODO Auto-generated method stub
		return dataBase.getAll();
	}

}
