package zadaci_abs;

public class App {
    static void main(String[] args) {
        FizickiProizvod p1 = new FizickiProizvod("Banana", 1.25f, 3);
        float ukp1 = p1.ukupnaCijenaProizvoda();
        DigitalniProizvod p2 = new DigitalniProizvod("Knjiga e-book", 10.2f, 5);
        PretplataProizvod p3 = new PretplataProizvod("Dnevne novine", 1.5f, 15);
        Narudzba narudzba = new Narudzba(3);
        narudzba.addProizvod(p1);
        narudzba.addProizvod(p2);
        narudzba.addProizvod(p3);
        narudzba.addProizvod(p3);
        float ukupno = narudzba.ukupnaCijenaNarudzbe();
        narudzba.ispisiRacun();
    }
}
