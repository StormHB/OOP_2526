package abs_cls_interfaces_final.slozeni_zadatak_S2;

public class SeminarskiRad implements Ispisivo, Bodovljivo {
    private String tema;
    private int ostvareniBodovi;

    public SeminarskiRad(String tema, int ostvareniBodovi) {
        this.tema = tema;
        this.ostvareniBodovi = ostvareniBodovi;
    }

    @Override
    public void ispisi() {
        System.out.println("Seminar: " + tema +
                " (" + ostvareniBodovi + " bodova)");
    }

    @Override
    public int bodovi() {
        return ostvareniBodovi;
    }
}