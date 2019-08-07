package com.sdm.shoppingcart.jdbc.db;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
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
			DBLog.log("SAVE TO DB:", t);
		}
		return t;
	}

	@Override
	public void removeItemWithId(long id) {
		// TODO Auto-generated method stub
		data.remove(id);
		DBLog.log("REMOVE FROM DB:", id);
	}

	@Override
	public void updateItem(IDataBaseDomain t) {
		// TODO Auto-generated method stub
		data.replace(t.getId(), t);
		DBLog.log("UPDATE TO DB:", t);
	}

	@Override
	public IDataBaseDomain getItemById(long id) {
		// TODO Auto-generated method stub
		IDataBaseDomain t = data.get(id);
		DBLog.log("SEARCH FROM DB:", t);
		return t;
	}
	
	@Override
	public List<IDataBaseDomain> getAll() {
		// TODO Auto-generated method stub
		
		List<IDataBaseDomain> list;
		Collection<IDataBaseDomain> coll = data.values();
		if (coll instanceof List)
		  list = (List<IDataBaseDomain>)coll;
		else
		  list = new ArrayList<IDataBaseDomain>(coll);
		
		DBLog.log("GET ALL FROM DB COUNT:", list.size());
		
		return list;
	}
}
