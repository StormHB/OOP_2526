package abs_cls_interfaces_final.zadatak_S_P2;

public class PostotniPopust implements Popust {
    private double postotak;

    public PostotniPopust(double postotak) {
        this.postotak = postotak;
    }

    @Override
    public double primijeni(double cijena) {
        return cijena * (1.0 - postotak / 100.0);
    }

    @Override
    public String toString() {
        return "Popust: " + postotak + "%";
    }
}