package abs_cls_interfaces_final.zadatak_A_P2;

public class Main {
    public static void main(String[] args) {

        KnjiznicnaJedinica[] gradja = {
                new Knjiga("Na Drini cuprija", 1945,
                        "Ivo Andric", "9789530607620"),

                new Casopis("Informatica", 2024, 47,
                        "Dr. Maric"),

                new Knjiga("Mali princ", 1943,
                        "Antoine de Saint-Exupery",
                        "9783140464079")
        };

        System.out.println("=== Bibliotecka gradja ===");

        for (KnjiznicnaJedinica bj : gradja) {
            System.out.println(bj);
        }
    }
}