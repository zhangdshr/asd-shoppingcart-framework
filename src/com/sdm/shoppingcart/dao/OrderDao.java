package com.sdm.shoppingcart.dao;

import com.sdm.shoppingcart.jdbc.IJdbcManager;
import com.sdm.shoppingcart.jdbc.JdbcMemoryManager;
import com.sdm.shoppingcart.jdbc.db.DBLog;
import com.sdm.shoppingcart.jdbc.db.IDataBaseDomain;
import com.sdm.shoppingcart.model.Order;
import com.sdm.shoppingcart.model.OrderState;
import com.sdm.shoppingcart.model.OrderState.STATE;
import com.sdm.shoppingcart.model.Product;

import java.util.ArrayList;
import java.util.List;

public class OrderDao implements InterfaceDao<Order> {
    private static IJdbcManager manager = new JdbcMemoryManager();
    private static OrderDao orderinstance = new OrderDao();
    private OrderDao (){}
    public static OrderDao getInstance() {
        return orderinstance;
    }
    @Override
    public Order save(Order t) {
        // TODO Auto-generated method stub
        Order order2 = (Order) manager.addItem(t);
        DBLog.log("save by DAO:", t);
        return order2;
    }

    @Override
    public void remove(long id) {
        // TODO Auto-generated method stub
        manager.removeItemWithId(id);
        DBLog.log("save by DAO:", id);
    }

    @Override
    public void update(Order t) {
        // TODO Auto-generated method stub
        manager.updateItem(t);
        DBLog.log("update by DAO:", t);
    }

    @Override
    public  Order getById(long id) {
        // TODO Auto-generated method stub
        Order order = (Order) manager.getItemById(id);
        DBLog.log("get by DAO:", order);
        return order;
    }

    @Override
    public List<Order> getAll() {
        // TODO Auto-generated method stub
        List<IDataBaseDomain> domains = manager.getAll();
        List presenter = domains;
        List<Order> list = presenter;
        DBLog.log("get all by DAO count:", list.size());
        return list;
    }

    public OrderState getOrderStateByOrderId(long id) {
        Order order = getById(id);
        OrderState state = order.orderState;
        DBLog.log("getOrderStateByOrderId", state);
        return state;
    }

    public List<Order> getOrderListByBuyerId(long userid) {
        // TODO Auto-generated method stub

        List<Order> orders = new ArrayList<>();
        for (Order r:getAll()) {
            if(userid==r.userId){
                orders.add(r);
            }
        }
        DBLog.log("getOrderListByBuyerId", orders.size());
        return orders;
    }

    public List<Order> getOrderListByState(STATE state) {
        // TODO Auto-generated method stub

        List<Order> orders = new ArrayList<>();
        for (Order s:getAll()) {
            if(state == s.orderState.state){
            	orders.add(s);
            }
        }
        DBLog.log("getOrderListByStateId", orders.size());
        return orders;
    }

    public List<Order> getOrderListByStateAndBuyerId(STATE state, long userid) {
        // TODO Auto-generated method stub

        List<Order> orders = new ArrayList<>();
        for (Order s:getAll()) {
            if(state == s.orderState.state && userid==s.userId){
            	orders.add(s);
            }
        }
        DBLog.log("getOrderListByStateId", orders.size());
        return orders;
    }
}
