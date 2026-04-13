package zadaci_abs;

public class DigitalniProizvod extends Proizvod{

    private static final float DIG_NAKNADA = 0.23f;
    protected DigitalniProizvod(String naziv, float jedCijena, float kolicina) {
        super(naziv, jedCijena, kolicina);
    }

    @Override
    public float ukupnaCijenaProizvoda() {
        this.ukupnaCijena = this.jedCijena*this.kolicina + this.kolicina*DIG_NAKNADA;
        System.out.println("Ukupna cijena za: " + this.getClass().getSimpleName() + " je: " + this.ukupnaCijena);
        return ukupnaCijena;
    }
}
