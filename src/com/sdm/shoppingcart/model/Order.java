package com.sdm.shoppingcart.model;


import com.sdm.shoppingcart.jdbc.db.IDataBaseDomain;
import com.sdm.shoppingcart.model.OrderState.STATE;

import java.util.*;

/**
 * 
 */
public class Order implements IDataBaseDomain {

    /**
     * Default constructor
     */
    public Order() {
    }

    public long id;

    /**
     * 
     */
    public List<OrderItem> items;

    /**
     * 
     */
    public long submitTime;

    /**
     * 
     */
    public Address addr;

    /**
     * 
     */
    public long userId;

    public ShippingInfo shippingInfo;

    public OrderState orderState = new OrderState(STATE.CONSTRUCT);
    /**
     * 
     */
    public float totalPrice;


    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
this.id=id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
//                ", items=" + items +
                ", submitTime=" + submitTime +
                ", addr=" + addr +
                ", userId=" + userId +
                ", shippingInfo=" + shippingInfo +
                ", orderState=" + orderState +
                ", totalPrice=" + totalPrice +
                '}';
    }
}