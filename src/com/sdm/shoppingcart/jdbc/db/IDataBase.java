package com.sdm.shoppingcart.jdbc.db;

import java.util.List;

public interface IDataBase {
	public IDataBaseDomain addItem(IDataBaseDomain t);

	public void removeItemWithId(long id);

	public void updateItem(IDataBaseDomain t);

	public IDataBaseDomain getItemById(long id);
	
	public List<IDataBaseDomain> getAll();
}
