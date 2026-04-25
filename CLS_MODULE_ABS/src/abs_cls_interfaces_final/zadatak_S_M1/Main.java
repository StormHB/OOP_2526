package abs_cls_interfaces_final.zadatak_S_M1;

public class Main {

    public static void sortiraj(Student[] niz, KomparatorStudenata komp) {
        for (int i = 0; i < niz.length - 1; i++) {
            for (int j = 0; j < niz.length - 1 - i; j++) {
                if (komp.usporedi(niz[j], niz[j + 1]) > 0) {
                    Student temp = niz[j];
                    niz[j] = niz[j + 1];
                    niz[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Student[] studenti = {
                new Student("Ana", "Zoric", 4.5),
                new Student("Ivan", "Antic", 3.8),
                new Student("Petra", "Babic", 4.9),
                new Student("Marko", "Antic", 4.1)
        };

        System.out.println("=== Po imenu ===");
        sortiraj(studenti, new PoImenu());
        for (Student s : studenti) {
            System.out.println(s);
        }

        System.out.println("\n=== Po prosjeku (silazno) ===");
        sortiraj(studenti, new PoProsjeku());
        for (Student s : studenti) {
            System.out.println(s);
        }
    }
}