package abs_cls_interfaces_final.zadatak_S2;

public class Main {
    public static void main(String[] args) {
        PretvorivoUTekst a = new Adresa("Sibenska 4a", "Zadar", 23000);
        PretvorivoUTekst k = new Kontakt("Martin Prtenjaca", "mprtenjac25@unizd.hr");
        System.out.println(a.uTekst());
        System.out.println(k.uTekst());
    }
}
