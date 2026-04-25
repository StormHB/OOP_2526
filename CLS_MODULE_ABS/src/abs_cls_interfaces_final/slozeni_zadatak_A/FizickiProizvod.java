package abs_cls_interfaces_final.slozeni_zadatak_A;

public class FizickiProizvod extends Proizvod {
    private double tezina;
    private static final double DOSTAVA_PO_KG = 5.0;

    public FizickiProizvod(String naziv, double cijena,
                           double tezina) {
        super(naziv, cijena);
        this.tezina = tezina;
    }

    @Override
    public double ukupnaCijena() {
        return osnovnaCijena + tezina * DOSTAVA_PO_KG;
    }
}