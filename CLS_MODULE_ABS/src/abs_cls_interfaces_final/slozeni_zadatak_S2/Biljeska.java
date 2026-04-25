package abs_cls_interfaces_final.slozeni_zadatak_S2;

public class Biljeska implements Ispisivo {
    private String tekst;

    public Biljeska(String tekst) {
        this.tekst = tekst;
    }

    @Override
    public void ispisi() {
        System.out.println("Biljeska: " + tekst);
    }
}