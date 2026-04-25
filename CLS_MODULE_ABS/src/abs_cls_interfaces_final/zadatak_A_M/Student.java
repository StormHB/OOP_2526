package abs_cls_interfaces_final.zadatak_A_M;

public class Student extends Osoba {
    private String jmbag;
    private double prosjek;

    public Student(String ime, String prezime, String oib,
                   String jmbag, double prosjek) {
        super(ime, prezime, oib);
        this.jmbag = jmbag;
        this.prosjek = prosjek;
    }

    @Override
    public String uloga() {
        return "Student (JMBAG: " + jmbag
                + ", prosjek: " + String.format("%.2f", prosjek) + ")";
    }
}