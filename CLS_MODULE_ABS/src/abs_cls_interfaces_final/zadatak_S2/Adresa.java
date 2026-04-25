package abs_cls_interfaces_final.zadatak_S2;

public class Adresa implements PretvorivoUTekst {

    private String ulica;
    private String grad;
    private int postanskiBroj;
    public Adresa(String ulica, String grad, int postanskiBroj) {
        this.ulica = ulica;
        this.grad = grad;
        this.postanskiBroj = postanskiBroj;
    }

    @Override
    public String uTekst() {
        return ulica + ", " + postanskiBroj + " " + grad;
    }
}
