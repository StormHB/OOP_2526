package vj_col_maps_java;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class zadatak_3_2 {
    static void ispisiMapu(Map<Integer, String> mapa) {
        for (Map.Entry<Integer, String> e : mapa.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }

    public static void main(String[] args) {

        System.out.println("=== HashMap ===");

        Map<Integer, String> h = new HashMap<>();
        h.put(21, "Stipe");
        h.put(159, "Divna");
        h.put(985, "Etna");
        h.put(455, "Petar");
        h.put(5788, "Vlatka");

        ispisiMapu(h);


        System.out.println("\n=== TreeMap (sortirano po ključevima) ===");

        Map<Integer, String> t = new TreeMap<>(h);
        ispisiMapu(t);


        System.out.println("\n=== LinkedHashMap (redoslijed umetanja) ===");

        Map<Integer, String> lhm = new LinkedHashMap<>();
        lhm.put(21, "Stipe");
        lhm.put(159, "Divna");
        lhm.put(985, "Etna");
        lhm.put(455, "Petar");
        lhm.put(5788, "Vlatka");

        ispisiMapu(lhm);
    }
}

/*
ako ponovno pozovemo put(21, "NovoIme"), mapa neće imati dva zapisa s ključem 21
nego ce prepisati novu vrijednost preko postojece na kljucu 21
 */