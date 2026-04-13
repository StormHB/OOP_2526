package zadaci_int;

public class VideoMaterijal implements Pregledljivo{

    private String naziv;
    private int velicinaKB;
    public VideoMaterijal(String naziv, int velicinaKB) {
        this.naziv = naziv;
        this.velicinaKB = velicinaKB;
    }

    @Override
    public String naziv() {
        return this.naziv;
    }

    @Override
    public int velicinaKB() {
        return this.velicinaKB;
    }

    @Override
    public void otvori() {
        System.out.println("Ovaj se otvara na poseban nacin jer je video naziva: " + this.naziv);
    }
}
