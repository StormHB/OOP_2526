package zadaci_int;

public class Prezentacija implements Pregledljivo{

    private String naziv;
    private int velicinaKB;
    public Prezentacija(String naziv, int velicinaKB){
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
        System.out.println(this.getClass().getSimpleName() + " naziva: " + this.naziv + " je otvorena!");
    }
}
