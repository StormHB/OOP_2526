package abs_cls_interfaces_final.slozeni_zadatak_S1;

public class Main {

    public static void otvoriSve(Pregledljivo[] niz) {
        for (Pregledljivo p : niz) {
            p.otvori();
        }
    }

    public static int ukupnaVelicina(Pregledljivo[] niz) {
        int suma = 0;

        for (Pregledljivo p : niz) {
            suma += p.velicinaKB();
        }

        return suma;
    }

    public static Pregledljivo pronadiNajveci(Pregledljivo[] niz) {
        Pregledljivo max = niz[0];

        for (int i = 1; i < niz.length; i++) {
            if (niz[i].velicinaKB() > max.velicinaKB()) {
                max = niz[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Pregledljivo[] materijali = {
                new PDFMaterijal("Skripta OOP", 2400),
                new VideoMaterijal("Predavanje 3", 185000),
                new Prezentacija("Slajdovi - sucelja", 5100),
                new PDFMaterijal("Zadaci za vjezbu", 980)
        };

        System.out.println("=== Otvaranje svih materijala ===");
        otvoriSve(materijali);

        System.out.println("\nUkupna velicina: "
                + ukupnaVelicina(materijali) + " KB");

        Pregledljivo najveci = pronadiNajveci(materijali);

        System.out.println("Najveci materijal:");
        System.out.println(najveci.naziv()
                + " (" + najveci.velicinaKB() + " KB)");
    }
}
