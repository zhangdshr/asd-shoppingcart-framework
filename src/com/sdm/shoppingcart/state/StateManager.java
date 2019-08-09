package com.sdm.shoppingcart.state;

import com.sdm.shoppingcart.api.OrderStateOperationAPI;
import com.sdm.shoppingcart.model.Order;
import com.sdm.shoppingcart.model.OrderState.STATE;

public class StateManager implements OrderStateOperationAPI {
	
	private CreatOrderState creatOrderState = new CreatOrderState();
	private PayOrderState payOrderState = new PayOrderState();
	private ShippingOrderState shippingOrderState = new ShippingOrderState();
	private ReciveOrderState reciveOrderState = new ReciveOrderState();
	
	@Override
	public void creatOrder(Order order) {
		// TODO Auto-generated method stub
		if (order.orderState.state == STATE.CONSTRUCT) {
			creatOrderState.change(order, this);
			System.out.println("operation a " + order.orderState.state + " Order");
		} else {
			System.out.println("Error: Order has Created\n   " + order.orderState.state);
		}
	}

	@Override
	public void pay(Order order) {
		// TODO Auto-generated method stub
		if (order.orderState.state == STATE.CREATED) {
			payOrderState.change(order, this);
			System.out.println("operation a " + order.orderState.state + " Order");
		} else {
			System.out.println("Error: Order has Paid\n   " + order.orderState.state);
		}
	}

	@Override
	public void shipping(Order order) {
		// TODO Auto-generated method stub
		if (order.orderState.state == STATE.PAID) {
			shippingOrderState.change(order, this);
			System.out.println("operation a " + order.orderState.state + " Order");
		} else {
			System.out.println("Error: Order has Shipped\n   " + order.orderState.state);
		}
	}

	@Override
	public void recived(Order order) {
		// TODO Auto-generated method stub
		if (order.orderState.state == STATE.SHIPPMENT) {
			reciveOrderState.change(order, this);
			System.out.println("operation a " + order.orderState.state + " Order");
		} else {
			System.out.println("Error: Order has Shipped\n   " + order.orderState.state);
		}
	}
	
	
}
