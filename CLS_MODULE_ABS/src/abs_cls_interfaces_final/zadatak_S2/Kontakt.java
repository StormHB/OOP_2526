package abs_cls_interfaces_final.zadatak_S2;

public class Kontakt implements PretvorivoUTekst {

    private String ime;
    private String email;
    public Kontakt(String ime, String email) {
        this.ime = ime;
        this.email = email;
    }

    @Override
    public String uTekst() {
        return ime + " (" + email + ")";
    }
}
