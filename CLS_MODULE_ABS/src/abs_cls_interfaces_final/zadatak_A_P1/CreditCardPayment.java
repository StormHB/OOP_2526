package abs_cls_interfaces_final.zadatak_A_P1;

public class CreditCardPayment extends PaymentMethod {

    private static final double ADDITIONAL_CHARGES = 0.02;

    protected CreditCardPayment(String paymentMethodName, double balance) {
        super(paymentMethodName, balance);
    }

    @Override
    public boolean performPayment(double amount) {

        if (amount > balance) {
            System.out.println("Not enough credit to cover the payment!");
            return false;
        } else {
            double fee = amount * ADDITIONAL_CHARGES;
            balance -= amount + fee;
            System.out.println("Payment of: " + String.format("%.2f", amount)
                    + " Euro performed successfully with additional charges amounting to: "
                    + String.format("%.2f", fee));
            System.out.println("Remaining credit: " + String.format("%.2f", balance) + " Euro.");
            return true;
        }
    }
}
