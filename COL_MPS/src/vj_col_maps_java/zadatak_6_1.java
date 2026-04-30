package vj_col_maps_java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class zadatak_6_1 {

    static class Zapis {
        final String studentId;
        final String nazivProvjere;
        final int bodovi;

        Zapis(String studentId, String nazivProvjere, int bodovi) {
            this.studentId = studentId;
            this.nazivProvjere = nazivProvjere;
            this.bodovi = bodovi;
        }
    }

    public static void main(String[] args) {

        List<Zapis> zapisi = new ArrayList<>();

        zapisi.add(new Zapis("007", "Kolokvij 1", 30));
        zapisi.add(new Zapis("003", "Kolokvij 1", 20));
        zapisi.add(new Zapis("001", "Kolokvij 1", 14));
        zapisi.add(new Zapis("002", "Kolokvij 1", 18));
        zapisi.add(new Zapis("005", "Kolokvij 1", 10));
        zapisi.add(new Zapis("006", "Kolokvij 1", 15));
        zapisi.add(new Zapis("001", "Kolokvij 2", 16));
        zapisi.add(new Zapis("002", "Kolokvij 2", 37));
        zapisi.add(new Zapis("003", "Kolokvij 2", 35));
        zapisi.add(new Zapis("005", "Kolokvij 2", 20));
        zapisi.add(new Zapis("006", "Kolokvij 2", 10));
        zapisi.add(new Zapis("007", "Kolokvij 2", 28));
        zapisi.add(new Zapis("004", "Kolokvij 1", 55));

        Map<String, Integer> ukupniBodovi = new HashMap<>();

        for (Zapis z : zapisi) {
            ukupniBodovi.put(
                    z.studentId,
                    ukupniBodovi.getOrDefault(z.studentId, 0) + z.bodovi
            );
        }

        System.out.println("Ukupni bodovi po studentu:");
        for (Map.Entry<String, Integer> e : ukupniBodovi.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        Map.Entry<String, Integer> najbolji = null;

        for (Map.Entry<String, Integer> e : ukupniBodovi.entrySet()) {
            if (najbolji == null || e.getValue() > najbolji.getValue()) {
                najbolji = e;
            }
        }

        System.out.println("\nStudent s najvise bodova:");
        System.out.println(najbolji.getKey() + " -> " + najbolji.getValue());

        List<Map.Entry<String, Integer>> rangLista =
                new ArrayList<>(ukupniBodovi.entrySet());

        rangLista.sort((a, b) -> {
            int usporedbaBodova = Integer.compare(b.getValue(), a.getValue());

            if (usporedbaBodova != 0) {
                return usporedbaBodova;
            }

            return a.getKey().compareTo(b.getKey());
        });

        System.out.println("\nRang-lista:");
        for (Map.Entry<String, Integer> e : rangLista) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
