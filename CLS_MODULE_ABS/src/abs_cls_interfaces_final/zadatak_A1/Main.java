package abs_cls_interfaces_final.zadatak_A1;

public class Main {
    public static void main(String[] args) {
        Vozilo[] vozila = {new Automobil(), new Bicikl() };
        for (Vozilo v : vozila) {
            v.info();
        }
    }
}
