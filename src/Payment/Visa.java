package Payment;

public class Visa implements PaymentMethod {
    private final String name;
    private final String cardNumber;
//    private final Date expires;

    public Visa(String name, String cardNumber) {
        super();
        this.name = name;
        this.cardNumber = cardNumber;
//        this.expires = expires;
    }

    @Override
    public boolean pay(double amount) {

        // Open Comms to Visa
        // Verify connection
        // Paybill using these details
        return true; // if payment goes through
    }
}
