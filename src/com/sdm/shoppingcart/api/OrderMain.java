package com.sdm.shoppingcart.api;


import com.sdm.shoppingcart.dao.ProductDao;
import com.sdm.shoppingcart.factory.OrderFactory;
import com.sdm.shoppingcart.model.Address;
import com.sdm.shoppingcart.model.Order;
import com.sdm.shoppingcart.model.OrderItem;
import com.sdm.shoppingcart.model.Product;
import com.sdm.shoppingcart.model.OrderState.STATE;

import java.util.ArrayList;
import java.util.List;


public class OrderMain {
    public static void main(String []args){
    	Address address = new Address();
    	address.state = "Iowa";
    	address.city = "Fairfield";
    	address.desc = "1000 N 4TH ST";
    	address.email = "12345@outlook.com";
    	
    	List<OrderItem> items = new ArrayList<OrderItem>();
    	for (int i = 1; i < 4; i++) {
    		Product product = new Product();
    		product.name = "Computer" + i;
    		product.price = 222 * i;
    		
    		ProductDao productDao = ProductDao.getInstance();
    		productDao.save(product);
    		
			OrderItem orderItem = new OrderItem(product, 1, product.price);
			
			items.add(orderItem);
		}
    	
        Order order = OrderFactory.creatOrder(items, address, 1);

        OrderStateOperationAPIImpl orderStateOperationAPIImpl = new OrderStateOperationAPIImpl();


        orderStateOperationAPIImpl.creatOrder(order);
        orderStateOperationAPIImpl.pay(order);
        orderStateOperationAPIImpl.shipping(order);
        orderStateOperationAPIImpl.recived(order);


        OrderAPI orderAPI = new OrderAPIImpl();
        orderAPI.getOrderDetailById(order.getId());


        List<Order> orderStateById = orderAPI.getOrderListByState(STATE.RECIVED);
        System.out.println(orderStateById);

    }
   }

