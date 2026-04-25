package abs_cls_interfaces_final.slozeni_zadatak_S2;

public class Ispit implements Ispisivo, Bodovljivo {
    private String naziv;
    private int ostvareniBodovi;

    public Ispit(String naziv, int ostvareniBodovi) {
        this.naziv = naziv;
        this.ostvareniBodovi = ostvareniBodovi;
    }

    @Override
    public void ispisi() {
        System.out.println("Ispit: " + naziv +
                " (" + ostvareniBodovi + " bodova)");
    }

    @Override
    public int bodovi() {
        return ostvareniBodovi;
    }
}
