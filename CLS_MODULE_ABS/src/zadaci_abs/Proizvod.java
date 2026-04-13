package zadaci_abs;

public abstract class Proizvod {
    protected String naziv;
    protected int id;
    private static int cntID = 1;
    protected float jedCijena;
    protected float kolicina;
    protected float ukupnaCijena;

    protected Proizvod(String naziv, float jedCijena, float kolicina) {
        this.id = cntID++;
        this.naziv = naziv;
        this.jedCijena = jedCijena;
        this.kolicina = kolicina;
        this.ukupnaCijena = 0f;
    }

    public abstract float ukupnaCijenaProizvoda();

    @Override
    public String toString() {
        return "Proizvod{" +
                "naziv='" + naziv + '\'' +
                ", id=" + id +
                ", jedCijena=" + jedCijena +
                ", kolicina=" + kolicina +
                '}';
    }
}

