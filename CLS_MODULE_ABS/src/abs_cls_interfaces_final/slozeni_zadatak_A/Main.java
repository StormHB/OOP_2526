package abs_cls_interfaces_final.slozeni_zadatak_A;

public class Main {
    public static void main(String[] args) {
        Proizvod[] stavke = {
                new FizickiProizvod("Laptop", 800.0, 2.5),
                new DigitalniProizvod("E-knjiga", 15.0),
                new PretplataProizvod("Cloud storage", 9.99, 12)
        };

        Narudzba narudzba = new Narudzba(stavke);
        narudzba.ispisiRacun();
    }
}