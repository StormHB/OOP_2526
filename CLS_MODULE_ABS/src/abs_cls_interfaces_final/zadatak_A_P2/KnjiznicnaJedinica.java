package abs_cls_interfaces_final.zadatak_A_P2;

public abstract class KnjiznicnaJedinica {
    protected String naslov;
    protected int godina;

    public KnjiznicnaJedinica(String naslov, int godina) {
        this.naslov = naslov;
        this.godina = godina;
    }

    public abstract String podaci();

    @Override
    public String toString() {
        return podaci();
    }
}