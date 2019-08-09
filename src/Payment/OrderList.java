package Payment;

import com.sdm.shoppingcart.model.Order;
import com.sdm.shoppingcart.model.OrderItem;

import java.util.ArrayList;
import java.util.List;

public class OrderList {
Order order;
OrderItem orderItem;
    private final List<OrderItem> items;

    public OrderList() {
        items = new ArrayList<>();
    }

    public void addItem(OrderItem item) {

        items.add(item);
    }

    public double calcTotalCost() {

        double total = 0.0;
        for (OrderItem item : items) {
            total += item.getPrice();
        }

        return total;
    }

    public boolean pay(PaymentMethod method) {

        double totalCost = calcTotalCost();
        return method.pay(totalCost);
    }
}