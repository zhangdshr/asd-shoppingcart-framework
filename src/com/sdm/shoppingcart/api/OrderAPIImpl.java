package com.sdm.shoppingcart.api;

import com.sdm.shoppingcart.dao.OrderDao;
import com.sdm.shoppingcart.dao.ProductDao;
import com.sdm.shoppingcart.model.Order;
import com.sdm.shoppingcart.model.OrderState;
import com.sdm.shoppingcart.model.OrderState.STATE;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class OrderAPIImpl implements OrderAPI  {




	@Override
	public OrderState getOrderStateByOrderId(long stateid) {
		// TODO Auto-generated method stub
		return OrderDao.getInstance().getOrderStateByOrderId(stateid);
	}

	@Override
	public Order getOrderDetailById(long id) {
		return OrderDao.getInstance().getById(id);
	}


	@Override
	public List<Order>  getOrderListByState(STATE state) {
		// TODO Auto-generated method stub
		return OrderDao.getInstance().getOrderListByState(state);
	}
	@Override
	public void editOrder(Order order) {
		// TODO Auto-generated method stub
		OrderDao.getInstance().update(order);
	}

	@Override
	public void removeOrder(long id) {
		// TODO Auto-generated method stub
		OrderDao.getInstance().remove(id);
	}

	@Override
	public List<Order> getOrderListByBuyerId(long userid) {
		// TODO Auto-generated method stub
		return OrderDao.getInstance().getOrderListByBuyerId(userid);
	}

	@Override
	public void updateOrder(Order order) {
		OrderDao.getInstance().update(order);

	}



	@Override
	public void saveOrder(Order order) {
		OrderDao.getInstance().save(order);
	}


}
