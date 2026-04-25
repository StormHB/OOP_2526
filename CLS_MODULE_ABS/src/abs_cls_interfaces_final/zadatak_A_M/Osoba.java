package abs_cls_interfaces_final.zadatak_A_M;

public abstract class Osoba {
    protected String ime;
    protected String prezime;
    protected String oib;

    public Osoba(String ime, String prezime, String oib) {
        this.ime = ime;
        this.prezime = prezime;
        this.oib = oib;
    }

    public abstract String uloga();

    public String getOib() {
        return oib;
    }

    @Override
    public String toString() {
        return ime + " " + prezime + " (OIB: " + oib + ") - "
                + uloga();
    }
}