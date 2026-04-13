package zadaci_int;

import java.util.ArrayList;

public class AppTest {
    static void main(String[] args) {
        ArrayList<Pregledljivo> materijali = new ArrayList<>();
        materijali.add(new PDFMaterijal("Java Effective snd edd.", 1024));
        materijali.add(new VideoMaterijal("Superman IV", 124554330));
        materijali.add(new Prezentacija("Predavanje strukture podataka", 1589));
        int velicina = AUX_CLS.ukupnaVelicina(materijali);
        System.out.println("Ukupna velicina: " + velicina);
        AUX_CLS.otvoriSve(materijali);
        Pregledljivo najveci = AUX_CLS.pronadiNajveci(materijali);
        System.out.println(najveci.velicinaKB());
        System.out.println(najveci.naziv());
    }
}
