package abs_cls_interfaces_final.slozeni_zadatak_S2;

public class Main {

    public static int zbroj(Bodovljivo[] niz) {
        int suma = 0;

        for (Bodovljivo b : niz) {
            suma += b.bodovi();
        }

        return suma;
    }

    public static void main(String[] args) {

        Ispit ispit1 = new Ispit("Programiranje I", 42);
        Ispit ispit2 = new Ispit("Baze podataka", 35);
        SeminarskiRad sem1 =
                new SeminarskiRad("Apstraktne klase u Javi", 18);

        Biljeska biljeska =
                new Biljeska("Ponoviti sučelja za kolokvij!");

        Ispisivo[] sviZaIspis = {
                ispit1, ispit2, sem1, biljeska
        };

        System.out.println("=== Ispis svih ===");
        for (Ispisivo i : sviZaIspis) {
            i.ispisi();
        }

        Bodovljivo[] bodovani = {
                ispit1, ispit2, sem1
        };

        System.out.println("\nUkupno bodova: " + zbroj(bodovani));
    }
}