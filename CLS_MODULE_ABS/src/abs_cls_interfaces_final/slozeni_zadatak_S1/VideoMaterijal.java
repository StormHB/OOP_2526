package abs_cls_interfaces_final.slozeni_zadatak_S1;

public class VideoMaterijal implements Pregledljivo {
    private String naziv;
    private int velicinaKB;

    public VideoMaterijal(String naziv, int velicinaKB) {
        this.naziv = naziv;
        this.velicinaKB = velicinaKB;
    }

    @Override
    public String naziv() {
        return naziv;
    }

    @Override
    public int velicinaKB() {
        return velicinaKB;
    }

    @Override
    public void otvori() {
        System.out.println("Pokrenut video: " + naziv
                + " (" + velicinaKB + " KB)");
    }
}