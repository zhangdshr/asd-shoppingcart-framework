package com.sdm.shoppingcart.api;

import com.sdm.shoppingcart.model.Order;
import com.sdm.shoppingcart.state.StateManager;

public class OrderStateOperationAPIImpl implements OrderStateOperationAPI {

	private StateManager stateManager = new StateManager();
	@Override
	public void creatOrder(Order order) {
		// TODO Auto-generated method stub
		stateManager.creatOrder(order);
	}

	@Override
	public void pay(Order order) {
		// TODO Auto-generated method stub
		stateManager.pay(order);
	}

	@Override
	public void shipping(Order order) {
		// TODO Auto-generated method stub
		stateManager.shipping(order);
	}

	@Override
	public void recived(Order order) {
		// TODO Auto-generated method stub
		stateManager.recived(order);
	}

}
