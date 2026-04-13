package zadaci_abs;

public class PretplataProizvod extends Proizvod{

    private static final float POPUST = 0.1f;

    protected PretplataProizvod(String naziv, float jedCijena, float kolicina) {
        super(naziv, jedCijena, kolicina);
    }

    private float popustZaPretplatu(){
        if(this.kolicina >= 12){
            return POPUST*this.jedCijena*this.kolicina;
        } else {
            return 0;
        }
    }

    @Override
    public float ukupnaCijenaProizvoda() {
        this.ukupnaCijena = this.jedCijena*this.kolicina - popustZaPretplatu();
        System.out.println("Ukupna cijena za: " + this.getClass().getSimpleName() + " je: " + this.ukupnaCijena);
        return this.ukupnaCijena;
    }
}
