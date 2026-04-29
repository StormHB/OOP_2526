package inner_loc_cls_final.zadatak_5_2_B1;

public class Main {
    public static void main(String[] args) {

        double normal = LocalShippingCalculator.calculateShipping(5.0, false);
        double express = LocalShippingCalculator.calculateShipping(5.0, true);

        System.out.println("Normal shipping: " + normal);
        System.out.println("Express shipping: " + express);
    }
}