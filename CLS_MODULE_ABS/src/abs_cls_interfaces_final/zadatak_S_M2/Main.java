package abs_cls_interfaces_final.zadatak_S_M2;

public class Main {
    public static int ukupno(Ocjenjivo[] aktivnosti) {
        int suma = 0;

        for (Ocjenjivo a : aktivnosti) {
            suma += a.bodovi();
        }

        return suma;
    }

    public static void main(String[] args) {
        Ocjenjivo[] aktivnosti = {
                new Ispit(45),
                new SeminarskiRad(20),
                new Laboratorij(25)
        };

        for (Ocjenjivo a : aktivnosti) {
            System.out.println(a.naziv() + ": " + a.bodovi()
                    + " bodova");
        }

        System.out.println("Ukupno: "
                + ukupno(aktivnosti) + " bodova");
    }
}