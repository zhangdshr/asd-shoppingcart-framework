package com.sdm.shoppingcart.state;

import com.sdm.shoppingcart.dao.OrderDao;
import com.sdm.shoppingcart.model.Order;
import com.sdm.shoppingcart.model.OrderState;
import com.sdm.shoppingcart.model.OrderState.STATE;

public class ShippingOrderState implements IOrderState {

	@Override
	public void change(Order order, StateManager stateManager) {
		// TODO Auto-generated method stub
		order.orderState = new OrderState(STATE.SHIPPMENT);
		OrderDao.getInstance().update(order);
	}

}
