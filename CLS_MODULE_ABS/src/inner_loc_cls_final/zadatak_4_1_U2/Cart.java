package inner_loc_cls_final.zadatak_4_1_U2;

public class Cart {
    private final double sum;

    public Cart(double sum) {
        this.sum = sum;
    }

    public class Discount {
        public double apply(double percent) {
            if (percent < 0 || percent > 100) {
                throw new IllegalArgumentException("Postotak mora biti veci od 0 i manji od 100!");
            }
            return sum * (1.0 - percent / 100.0);
        }
    }

    public Discount discount() {
        return new Discount();
    }

}
