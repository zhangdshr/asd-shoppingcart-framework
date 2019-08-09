package com.sdm.shoppingcart.api;

import com.sdm.shoppingcart.model.Order;
import com.sdm.shoppingcart.model.OrderState;

import java.util.List;

interface OrderAPI {



	OrderState getOrderStateById(long id);
	
	Order getOrderDetailById(long id);

	List<Order> getOrderListByStateId(long id);
	
	void editOrder(Order order);
	
	void removeOrder(long id);

	List<Order> getOrderListByBuyerId(long userid);
	
	void updateOrder(Order order);

	void saveOrder(Order order);
	
	//...

}
