package Payment;

import com.sdm.shoppingcart.model.OrderItem;

public class PayingBillUsingVisa {
    OrderList instance = new OrderList();

    OrderItem a = new OrderItem("gloves", 23.43);
    instance.addItem(a);

    OrderItem b = new OrderItem("hat", 10.99);
    instance.addItem(b);

//    Date expiryDate = getCardExpireyDate();
    PaymentMethod visa = new Visa("CaptainDebug", "1234234534564567");

    boolean result = instance.pay(visa);
    assertTrue(result);

}

    private Date getCardExpireyDate() {
        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(2015, Calendar.JANUARY, 21);
        return cal.getTime();
}
