package abs_cls_interfaces_final.zadatak_A2;

public abstract class Zaposlenik {
    protected String ime;
    protected String prezime;
    protected Zaposlenik(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }
    public abstract double izracunajPlacu();

    @Override
    public String toString() {
        return ime + " " + prezime + " -> placa : " + String.format("%.2f", izracunajPlacu()) + " EUR ";
    }
}
