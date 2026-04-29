package vj_col_maps_java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class zadatak_3_3 {

    static void napuni(Set<String> skup) {
        skup.add("Ana");
        skup.add("Ivo");
        skup.add("Marko");
        skup.add("Ema");
        skup.add("Lana");
    }

    static boolean osigurajElement(Set<String> skup, String trazeni) {
        if (skup.contains(trazeni)) {
            System.out.println("'" + trazeni + "' vec postoji.");
            return false;
        }

        skup.add(trazeni);
        System.out.println("'" + trazeni + "' je dodan.");
        return true;
    }

    static void ispisi(Set<String> skup) {
        for (String element : skup) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    static boolean obrisi(Set<String> skup, String element) {
        return skup.remove(element);
    }

    public static void main(String[] args) {

        List<Set<String>> skupovi = Arrays.asList(
                new HashSet<>(),
                new LinkedHashSet<>(),
                new TreeSet<>()
        );

        for (Set<String> skup : skupovi) {
            System.out.println("\n=== " + skup.getClass().getSimpleName() + " ===");

            napuni(skup);

            System.out.print("Pocetni skup: ");
            ispisi(skup);

            System.out.println("\nProvjera elementa 'Nema ga':");
            osigurajElement(skup, "Nema ga");

            System.out.print("Nakon dodavanja: ");
            ispisi(skup);

            System.out.println("\nPokusaj ponovnog dodavanja 'Nema ga':");
            osigurajElement(skup, "Nema ga");

            System.out.print("Nakon ponovnog pokusaja: ");
            ispisi(skup);

            boolean obrisan = obrisi(skup, "Marko");

            System.out.println("\nBrisanje elementa 'Marko': " + obrisan);
            System.out.print("Nakon brisanja: ");
            ispisi(skup);
        }
    }
}

/*
1. jer Set ne dopusta duplikate
2. LinkedHashSet cuva redoslijed kojim smo ih umetali
3. TreeSet ispisuje elemente sortirano (abecedno ako nema kljuc za sort)
 */