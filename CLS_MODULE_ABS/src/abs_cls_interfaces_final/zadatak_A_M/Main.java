package abs_cls_interfaces_final.zadatak_A_M;

public class Main {

    public static Osoba pronadiPoOIB(Osoba[] niz, String oib) {
        for (Osoba o : niz) {
            if (o.getOib().equals(oib)) {
                return o;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Osoba[] osobe = {
                new Student("Ana", "Anic", "12345678901",
                        "0036500001", 4.25),

                new Profesor("Marko", "Markovic", "98765432109",
                        "docent", 12),

                new Student("Ivan", "Ivic", "11122233344",
                        "0036500002", 3.80),

                new Profesor("Petra", "Petric", "55566677788",
                        "redoviti profesor", 45)
        };

        System.out.println("=== Sve osobe ===");
        for (Osoba o : osobe) {
            System.out.println(o);
        }

        String[] oibi = {"98765432109", "12345678901"};

        System.out.println("\n=== Pretraga po OIB-u ===");

        for (String oib: oibi) {
            Osoba trazena = pronadiPoOIB(osobe, oib);
            if (trazena != null) {
                System.out.println("Pronadeno: " + trazena);
            } else {
                System.out.println("Osoba nije pronadena.");
            }
        }
    }
}
