package abs_cls_interfaces_final.zadatak_S_M2;

public class Laboratorij implements Ocjenjivo {
    private int bodovi;

    public Laboratorij(int bodovi) {
        this.bodovi = bodovi;
    }

    @Override
    public int bodovi() {
        return bodovi;
    }

    @Override
    public String naziv() {
        return "Laboratorij";
    }
}