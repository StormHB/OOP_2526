package zadaci_int;

public class PDFMaterijal implements Pregledljivo{

    private String naziv;
    private int velicinaKB;
    public PDFMaterijal(String naziv, int velicinaKB){
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
        System.out.println("Otvorio sam: " + this.getClass().getSimpleName() + " naziva: " + this.naziv);
    }
}
