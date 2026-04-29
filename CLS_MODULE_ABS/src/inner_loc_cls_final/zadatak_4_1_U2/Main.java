package inner_loc_cls_final.zadatak_4_1_U2;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart(100); // početni iznos

        Cart.Discount discount = cart.discount();

        double result1 = discount.apply(10);  // 10% popusta
        double result2 = discount.apply(25);  // 25% popusta

        System.out.println("Original: 100");
        System.out.println("10% off: " + result1); // 90
        System.out.println("25% off: " + result2); // 75

        try {
            discount.apply(150);
        } catch (IllegalArgumentException e) {
            System.out.println("Greska: " + e.getMessage());
        }
    }
}