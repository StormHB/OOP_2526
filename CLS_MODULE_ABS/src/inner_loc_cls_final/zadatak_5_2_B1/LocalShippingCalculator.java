package inner_loc_cls_final.zadatak_5_2_B1;

public class LocalShippingCalculator {

    public static double calculateShipping(double weightKg, boolean express) {

        class Pricing {
            double price() {
                double base = 2.0 + 1.2 * weightKg;
                return express ? base * 1.5 : base;
            }
        }

        return new Pricing().price();
    }
}