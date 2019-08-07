package com.sdm.shoppingcart.jdbc.db;

public interface IDataBase {
	public IDataBaseDomain addItem(IDataBaseDomain t);

	public void removeItemWithId(long id);

	public void updateItem(IDataBaseDomain t);

	public IDataBaseDomain getItemById(long id);
}
