package abs_cls_interfaces_final.zadatak_A_P1;

public abstract class PaymentMethod {

    protected String paymentMethodName;
    protected double balance;

    protected PaymentMethod (String paymentMethodName, double balance) {
        this.paymentMethodName = paymentMethodName;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public abstract boolean performPayment (double amount);

    @Override
    public String toString() {
        return paymentMethodName + " [ balance : " + String . format ("%.2f",
                balance ) + " EUR ]";
    }
}
