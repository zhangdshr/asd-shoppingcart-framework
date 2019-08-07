package com.sdm.shoppingcart.jdbc;

import com.sdm.shoppingcart.jdbc.db.IDataBaseDomain;

public interface IJdbcManager {
	public IDataBaseDomain addItem(IDataBaseDomain t);

	public void removeItemWithId(long id);

	public void updateItem(IDataBaseDomain t);

	public IDataBaseDomain getItemById(long id);
}
