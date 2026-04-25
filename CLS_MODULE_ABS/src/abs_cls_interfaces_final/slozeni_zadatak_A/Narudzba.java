package abs_cls_interfaces_final.slozeni_zadatak_A;

public class Narudzba {
    private Proizvod[] stavke;

    public Narudzba(Proizvod[] stavke) {
        this.stavke = stavke;
    }

    public double izracunajUkupno() {
        double ukupno = 0;

        for (Proizvod p : stavke) {
            ukupno += p.ukupnaCijena();
        }

        return ukupno;
    }

    public void ispisiRacun() {
        System.out.println("========== RACUN ==========");
        for (Proizvod p : stavke) {
            System.out.println("  " + p);
        }

        System.out.println("--------------------------");
        System.out.println("UKUPNO: "
                + String.format("%.2f", izracunajUkupno())
                + " EUR");
        System.out.println("==========================");
    }
}