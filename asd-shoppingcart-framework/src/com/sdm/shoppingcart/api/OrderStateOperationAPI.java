package com.sdm.shoppingcart.api;

import com.sdm.shoppingcart.model.Order;

public interface OrderStateOperationAPI {
	public void creatOrder(Order order) throws Exception;
	public void pay(Order order) throws Exception;
	public void shipping(Order order);
	public void recived(Order order) throws Exception;
}
