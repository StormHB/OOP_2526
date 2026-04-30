package vj_col_maps_java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class zadatak_5_1 {

    static List<Map.Entry<String, Integer>> topK(String tekst, int k) {

        String norm = tekst.toLowerCase().replaceAll("[^\\p{L}\\s]", " ");

        String[] dijelovi = norm.trim().isEmpty()
                ? new String[0]
                : norm.trim().split("\\s+");

        Map<String, Integer> freq = new HashMap<>();
        for (String r : dijelovi) {
            if (!r.isBlank()) {
                freq.put(r, freq.getOrDefault(r, 0) + 1);
            }
        }

        List<Map.Entry<String, Integer>> lista =
                new ArrayList<>(freq.entrySet());

        lista.sort((a, b) -> Integer.compare(b.getValue(), a.getValue()));

        if (lista.size() > k) {
            return lista.subList(0, k);
        }
        return lista;
    }

    public static void main(String[] args) {
        String t = "Java, java! Mapa i lista. Lista, mapa: Java?";

        for (Map.Entry<String, Integer> e : topK(t, 3)) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}

/*
metoda vraca listu Map.Entry jer svaki element mora sadrzavati
rijec i broj njezinih pojavljivanja, dok lista to ne moze
 */