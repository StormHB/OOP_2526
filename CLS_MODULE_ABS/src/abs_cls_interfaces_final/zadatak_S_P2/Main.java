package abs_cls_interfaces_final.zadatak_S_P2;

public class Main {
    public static void main(String[] args) {
        double cijena = 200.0;
        System.out.println("Pocetna cijena: " + cijena + " EUR");

        Popust[] popusti = {
                new PostotniPopust(10),
                new FiksniPopust(20)
        };

        for (Popust p : popusti) {
            double nova = p.primijeni(cijena);
            System.out.println(p + " -> nova cijena: "
                    + String.format("%.2f", nova) + " EUR");
        }
    }
}
