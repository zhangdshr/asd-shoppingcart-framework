package com.sdm.shoppingcart.factory;

import java.util.List;

import com.sdm.shoppingcart.model.Address;
import com.sdm.shoppingcart.model.Order;
import com.sdm.shoppingcart.model.OrderItem;

public class OrderFactory {
	public static Order creatOrder(List<OrderItem> items, float totalPrice, Address addr, long userId) {
		Order order = new Order();
		order.items = items;
		order.addr = addr;
		order.userId = userId;
		order.totalPrice = totalPrice;
		return order;
	}
}
