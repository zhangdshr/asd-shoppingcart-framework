package com.sdm.shoppingcart.dao;

import java.util.List;

public interface InterfaceDao<T> {
	public T save(T t);

	public void remove(long id);

	public void update(T t);

	public T getById(long id);
	
	public List<T> getAll();
}
