package abs_cls_interfaces_final.zadatak_A2;

public class Main {
    public static void main(String[] args) {
        Zaposlenik z1 = new StalniZaposlenik("Martin", "Prtenjaca", 1200.0);
        Zaposlenik z2 = new HonorarniZaposlenik("Dino", "Grgic", 15.0, 40);
        System.out.println(z1);
        System.out.println(z2);
    }
}
