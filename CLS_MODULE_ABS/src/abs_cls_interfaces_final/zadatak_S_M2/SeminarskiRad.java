package abs_cls_interfaces_final.zadatak_S_M2;

public class SeminarskiRad implements Ocjenjivo {
    private int bodovi;

    public SeminarskiRad(int bodovi) {
        this.bodovi = bodovi;
    }

    @Override
    public int bodovi() {
        return bodovi;
    }

    @Override
    public String naziv() {
        return "Seminarski rad";
    }
}
