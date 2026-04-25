package abs_cls_interfaces_final.zadatak_S_P1;

public class EmailObavijest implements Obavijestiv {
    private String adresa;

    public EmailObavijest(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public void posaljiObavijest(String poruka) {
        System.out.println("Slanje emaila na " + adresa + ": " + poruka);
    }
}