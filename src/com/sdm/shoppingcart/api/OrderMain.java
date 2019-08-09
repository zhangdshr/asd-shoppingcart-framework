package com.sdm.shoppingcart.api;


import com.sdm.shoppingcart.dao.OrderDao;
import com.sdm.shoppingcart.model.Order;

import java.util.List;


public class OrderMain {
    public static void main(String []args){
        Order order = new Order();

        order.stateId = 2;
        Order order2=new Order();
        order2.stateId=3;
        order2.totalPrice=200;
        OrderAPIImpl orderAPIImp=new OrderAPIImpl();


        orderAPIImp.saveOrder(order);

        System.out.println(order);


        Order orderDetailById = orderAPIImp.getOrderDetailById(order.getId());

        System.out.println(orderDetailById);

        List<Order> orderStateById=orderAPIImp.getOrderListByStateId(order.getStateId());
        System.out.println(orderStateById);

         orderAPIImp.editOrder(order2);
         orderAPIImp.removeOrder(order.getId());
         orderAPIImp.getOrderStateById(order.getStateId());
    }
    }

