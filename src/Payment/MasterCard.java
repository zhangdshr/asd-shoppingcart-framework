package Payment;

public class MasterCard implements PaymentMethod{
    private final String name;
    private final String cardNumber;


    public MasterCard(String name, String cardNumber) {
        super();
        this.name = name;
        this.cardNumber = cardNumber;

    }

    @Override
    public boolean pay(double amount) {

        // Open Comms to Mastercard
        // Verify connection
        // Paybill using these details
        return true; // if payment goes through
    }

}
