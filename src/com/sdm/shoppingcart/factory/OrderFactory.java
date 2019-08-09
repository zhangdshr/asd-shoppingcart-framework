package com.sdm.shoppingcart.factory;

import java.util.Iterator;
import java.util.List;

import com.sdm.shoppingcart.model.Address;
import com.sdm.shoppingcart.model.Order;
import com.sdm.shoppingcart.model.OrderItem;
import com.sdm.shoppingcart.model.OrderState;
import com.sdm.shoppingcart.model.OrderState.STATE;

public class OrderFactory {
	public static Order creatOrder(List<OrderItem> items, Address addr, long userId) {
		Order order = new Order();
		order.items = items;
		order.addr = addr;
		order.userId = userId;
		int totalPrice = 0;
		for (Iterator<OrderItem> iterator = items.iterator(); iterator.hasNext();) {
			OrderItem orderItem = iterator.next();
			totalPrice += orderItem.price;
		}
		order.totalPrice = totalPrice;
		order.orderState = new OrderState(STATE.CONSTRUCT);
		return order;
	}
}
