package abs_cls_interfaces_final.zadatak_A1;

public abstract class Vozilo {
    protected String naziv;
    protected Vozilo(String naziv) {
        this.naziv = naziv;
    }
    public abstract int maxBrzina();

    public void info() {
        System.out.println(naziv + ": max brzina: " + maxBrzina() + "km/h");
    }
}
