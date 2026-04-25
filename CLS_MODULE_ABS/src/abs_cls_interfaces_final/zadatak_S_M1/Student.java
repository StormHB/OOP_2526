package abs_cls_interfaces_final.zadatak_S_M1;

public class Student {
    private String ime;
    private String prezime;
    private double prosjek;

    public Student(String ime, String prezime, double prosjek) {
        this.ime = ime;
        this.prezime = prezime;
        this.prosjek = prosjek;
    }

    public String getIme() { return ime; }
    public String getPrezime() { return prezime; }
    public double getProsjek() { return prosjek; }

    @Override
    public String toString() {
        return prezime + " " + ime + " (prosjek: "
                + String.format("%.2f", prosjek) + ")";
    }
}