package com.sdm.shoppingcart.state;

import com.sdm.shoppingcart.model.Order;

public interface IOrderState {
	public void change(Order order, StateManager stateManager);
}
