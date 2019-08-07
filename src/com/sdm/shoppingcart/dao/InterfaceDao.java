package com.sdm.shoppingcart.dao;

public interface InterfaceDao<T> {
	public T save(T t);

	public void remove(long id);

	public void update(T t);

	public T getById(long id);
}
