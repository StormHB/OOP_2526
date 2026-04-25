package abs_cls_interfaces_final.zadatak_A_P1;

public class Main {
    public static void main(String[] args) {
        PaymentMethod [] payments = {
                new CashPayment("Cash", 33.28),
                new CreditCardPayment("CreditCard1", 200.25),
                new CashPayment("Cash", 2451.22),
                new CreditCardPayment("CreditCard2", 388.91),
        };

        double amount = 212.44;

        for (PaymentMethod payment: payments) {
            System.out.println(payment);
            if (payment.performPayment(amount)) {
                System.out.println("Payment successful!");
                System.out.println("----------------------------------------------------");
            } else {
                System.out.println("Payment failed!");
                System.out.println("Amount attempted: " + String.format("%.2f", amount) + " Euro.");
                System.out.println("----------------------------------------------------");
            }
        }
    }
}
