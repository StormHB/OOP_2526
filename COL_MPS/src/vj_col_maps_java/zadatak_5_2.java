package vj_col_maps_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class zadatak_5_2 {

    static class Stavka {
        final String kategorija;
        final int iznos;

        Stavka(String kategorija, int iznos) {
            this.kategorija = kategorija;
            this.iznos = iznos;
        }
    }

    public static void main(String[] args) {

        List<Stavka> ulaz = Arrays.asList(
                new Stavka("HRANA", 25),
                new Stavka("PRIJEVOZ", 10),
                new Stavka("HRANA", 40),
                new Stavka("ZABAVA", 60),
                new Stavka("PRIJEVOZ", 12)
        );

        Map<String, List<Integer>> poKategoriji = new HashMap<>();

        for (Stavka s : ulaz) {
            poKategoriji
                    .computeIfAbsent(s.kategorija, k -> new ArrayList<>())
                    .add(s.iznos);
        }

        System.out.println("Iznosi po kategoriji:");
        System.out.println(poKategoriji);

        System.out.println("\nZbrojevi po kategoriji:");
        for (Map.Entry<String, List<Integer>> e : poKategoriji.entrySet()) {
            int suma = 0;

            for (int x : e.getValue()) {
                suma += x;
            }

            System.out.println(e.getKey() + " suma = " + suma);
        }
    }
}

/*
onda kad nam nisu potrebni pojedinacni iznosi, nego ukupan iznos po kategoriji
 */