package abs_cls_interfaces_final.zadatak_A2;

public class HonorarniZaposlenik extends Zaposlenik {
    private double satnaPlaca;
    private int brojSati;

    public HonorarniZaposlenik(String ime, String prezime, double satnaPlaca, int brojSati) {
        super(ime, prezime);
        this.satnaPlaca = satnaPlaca;
        this.brojSati = brojSati;
    }

    @Override
    public double izracunajPlacu() {
        return satnaPlaca * brojSati;
    }
}
