package com.sdm.shoppingcart.state;

import com.sdm.shoppingcart.dao.OrderDao;
import com.sdm.shoppingcart.model.Order;
import com.sdm.shoppingcart.model.OrderState;
import com.sdm.shoppingcart.model.OrderState.STATE;

public class CreatOrderState implements IOrderState {

	@Override
	public void change(Order order, StateManager stateManager) {
		// TODO Auto-generated method stub
		order.orderState = new OrderState(STATE.CREATED);
		OrderDao.getInstance().save(order);
	}

}
