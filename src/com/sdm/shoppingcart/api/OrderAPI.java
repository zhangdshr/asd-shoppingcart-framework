package com.sdm.shoppingcart.api;

interface OrderAPI {
	
	void getOrderStateById();
	
	void getOrderDetailById();
	
	void getOrderListByStateId();
	
	void editOrder();
	
	void removeOrder();
	
	void getOrderListByBuyerId();
	
	void updateOrder();
	
	//...

}
