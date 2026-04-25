package abs_cls_interfaces_final.zadatak_A_P1;

public class CashPayment extends PaymentMethod{

    protected CashPayment(String paymentMethodName, double balance) {
        super(paymentMethodName, balance);
    }

    @Override
    public boolean performPayment(double amount) {
        if (amount > balance) {
            System.out.println("Not enough credit to cover the payment!");
            return false;
        } else {
            balance -= amount;
            System.out.println("Payment of " + String.format("%.2f", amount) + " Euro performed succesfully.");
            System.out.println("Remaining balance: " + String.format("%.2f", balance) + "Euro.");
            return true;
        }
    }
}
