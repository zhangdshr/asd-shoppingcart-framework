package com.example.demo.controller;

import com.sdm.shoppingcart.api.BuyerAPIImpl;
import com.sdm.shoppingcart.api.OrderAPIImpl;
import com.sdm.shoppingcart.api.OrderStateOperationAPIImpl;
import com.sdm.shoppingcart.factory.OrderFactory;
import com.sdm.shoppingcart.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("order")
public class OrderController {
    private OrderAPIImpl orderAPI = new OrderAPIImpl();
    private OrderStateOperationAPIImpl operationAPI = new OrderStateOperationAPIImpl();
    private BuyerAPIImpl buyerAPI = new BuyerAPIImpl();

    @RequestMapping("detail")
    public Order getOrderByID(@RequestParam long id) {
        return orderAPI.getOrderDetailById(id);
    }

    @RequestMapping("listbyuid")
    public List getOrderByUserID(@RequestParam long uid) {
        return orderAPI.getOrderListByBuyerId(uid);
    }

    /*
    waitting for pay,state == 1
    shipping, state == 3
    recived, state == 4
     */
    @RequestMapping("listbystate")
    public List getOrderByUserID(@RequestParam int state, @RequestParam long uid) {
        if (state == 1) {
            return orderAPI.getOrderListByStateAndBuyerId(OrderState.STATE.CONSTRUCT, uid);
        } else if (state == 3) {
            return orderAPI.getOrderListByStateAndBuyerId(OrderState.STATE.SHIPPMENT, uid);
        } else if (state == 4) {
            return orderAPI.getOrderListByStateAndBuyerId(OrderState.STATE.RECIVED, uid);
        } else {
            return null;
        }
    }

    @RequestMapping("creat")
    public ResponseEntity creatOrder(@RequestBody Address address) {
        List<CartItem> cartItems = buyerAPI.getCartItemListInShoppingList(1);
        if (cartItems.size() < 1) {
            return new ResponseEntity("Error: There are no products in cart!", HttpStatus.BAD_REQUEST);
        }
        List<OrderItem> orderItems = new ArrayList<>();
        Iterator iterator = cartItems.iterator();

        while(iterator.hasNext()) {
            CartItem item = (CartItem) iterator.next();
            OrderItem orderItem = new OrderItem();
            orderItem.product = item.product;
            orderItem.count = item.count;
            orderItems.add(orderItem);
            buyerAPI.removeProductFromShoppingCart(item.id);
        }

        Order order = new Order();
        order.items = orderItems;
        order.userId = 1;
        order.addr = address;
        order.totalPrice = buyerAPI.getPriceOfSelectedCartItemsByUserType(cartItems, 1, 1, 80);

        try {
            operationAPI.creatOrder(order);
            return new ResponseEntity(order, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping("pay")
    public ResponseEntity payOrder(@RequestParam long order_id) {
        Order order = orderAPI.getOrderDetailById(order_id);
        try {
            operationAPI.pay(order);
            return new ResponseEntity(order, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping("recive")
    public ResponseEntity reciveOrder(@RequestParam long order_id) {
        Order order = orderAPI.getOrderDetailById(order_id);
        try {
            operationAPI.recived(order);
            return new ResponseEntity(order, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }

    }
}
