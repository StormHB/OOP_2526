package vj_col_maps_java;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class zadatak_4_1 {

    private final Map<String, Set<String>> prisutnost = new HashMap<>();

    public void dodajPrisustvo(String termin, String student) {
        prisutnost
                .computeIfAbsent(termin, t -> new HashSet<>())
                .add(student);
    }

    public boolean jePrisutan(String termin, String student) {
        return prisutnost
                .getOrDefault(termin, Collections.emptySet())
                .contains(student);
    }

    public int brojPrisutnih(String termin) {
        return prisutnost.getOrDefault(termin, Collections.emptySet()).size();
    }

    public Set<String> studentiUTerminu(String termin) {
        return new HashSet<>(
                prisutnost.getOrDefault(termin, Collections.emptySet())
        );
    }

    public static void main(String[] args) {
        zadatak_4_1 evidencija = new zadatak_4_1();

        evidencija.dodajPrisustvo("PON-08:00", "123");
        evidencija.dodajPrisustvo("PON-08:00", "124");
        evidencija.dodajPrisustvo("PON-08:00", "123");

        System.out.println("Broj prisutnih za PON-08:00: "
                + evidencija.brojPrisutnih("PON-08:00"));

        System.out.println("Je li student 123 prisutan na PON-08:00? "
                + evidencija.jePrisutan("PON-08:00", "123"));

        System.out.println("Je li student 999 prisutan na PON-08:00? "
                + evidencija.jePrisutan("PON-08:00", "999"));

        System.out.println("\n=== Test studentiUTerminu ===");

        Set<String> studenti = evidencija.studentiUTerminu("PON-08:00");
        System.out.println("Studenti: " + studenti);

        studenti.add("999");

        System.out.println("Nakon izmjene kopije: " + studenti);
        System.out.println("Original ostaje: " + evidencija.studentiUTerminu("PON-08:00"));
    }
}

/*
1. set koristimo jer ne dopusta duplikate, pa isti student ne moze biti upisan vise puta u isti termin.
2. ako termin ne postoji, metoda treba vratiti 0.
3. ne, jer Set ne dopusta duplikate.
 */