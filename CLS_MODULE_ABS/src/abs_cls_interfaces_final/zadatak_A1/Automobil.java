package abs_cls_interfaces_final.zadatak_A1;

public class Automobil extends Vozilo {
    public Automobil() {
        super("Automobil");
    }

    @Override
    public int maxBrzina() {
        return 200;
    }
}
