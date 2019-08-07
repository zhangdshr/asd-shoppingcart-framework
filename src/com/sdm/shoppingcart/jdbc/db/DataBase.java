package com.sdm.shoppingcart.jdbc.db;

import java.util.HashMap;
import java.util.Map;

public class DataBase implements IDataBase {
	private Map<Long, IDataBaseDomain> data = new HashMap<Long, IDataBaseDomain>();
	private Long pid = (long) 1;
	@Override
	public IDataBaseDomain addItem(IDataBaseDomain t) {
		// TODO Auto-generated method stub
		if (t.getId() > 0) {
			updateItem(t);
		} else {
			data.put(pid, t);
			t.setId(pid);
			pid++;
			System.out.println("SAVE TO DB:");
			System.out.println("    " + t.toString());
			System.out.println();
		}
		return t;
	}

	@Override
	public void removeItemWithId(long id) {
		// TODO Auto-generated method stub
		data.remove(id);
		System.out.println("REMOVE FROM DB:");
		System.out.println("    " + id);
		System.out.println();
	}

	@Override
	public void updateItem(IDataBaseDomain t) {
		// TODO Auto-generated method stub
		data.replace(t.getId(), t);
		System.out.println("UPDATE TO DB:");
		System.out.println("    " + t.toString());
		System.out.println();
	}

	@Override
	public IDataBaseDomain getItemById(long id) {
		// TODO Auto-generated method stub
		IDataBaseDomain t = data.get(id);
		System.out.println("SEARCH FROM DB:");
		System.out.println("    " + t.toString());
		System.out.println();
		return t;
	}
	
}
