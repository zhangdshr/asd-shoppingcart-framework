package com.sdm.shoppingcart.model;


import com.sdm.shoppingcart.jdbc.db.IDataBaseDomain;

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
    public int stateId;

    /**
     * 
     */
    public long userId;

    public ShippingInfo shippingInfo;

    public OrderState orderState;
    /**
     * 
     */
    public float totalPrice;

//    public Order(List<OrderItem> items, long submitTime, Address addr, OrderState orderState, long userId, float totalPrice) {
//        this.items = items;
//        this.submitTime = submitTime;
//        this.addr = addr;
//        this.orderState = orderState;
//        this.userId = userId;
//        this.totalPrice = totalPrice;
//    }


    public int getStateId() {
        return stateId;
    }

    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public void setSubmitTime(long submitTime) {
        this.submitTime = submitTime;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public void setShippingInfo(ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public long getSubmitTime() {
        return submitTime;
    }

    public Address getAddr() {
        return addr;
    }

    public OrderState getOrderState() {
        return orderState;
    }

    public long getUserId() {
        return userId;
    }

    public float getTotalPrice() { return totalPrice; }

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
                ", items=" + items +
                ", submitTime=" + submitTime +
                ", addr=" + addr +
                ", stateId=" + stateId +
                ", userId=" + userId +
                ", shippingInfo=" + shippingInfo +
                ", orderState=" + orderState +
                ", totalPrice=" + totalPrice +
                '}';
    }
}