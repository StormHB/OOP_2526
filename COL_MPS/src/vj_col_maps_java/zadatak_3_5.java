package vj_col_maps_java;

import java.util.*;

public class zadatak_3_5 {
    public static void main(String[] args) {

        List<String> lst = new ArrayList<>(Arrays.asList(
                "auto", "svemirski brod", "avion", "helikopter",
                "jedrilica", "gliser", "romobil", "bicikla"
        ));

        System.out.println("Bez sortiranja: " + lst);

        Collections.sort(lst);
        System.out.println("Abecedno: " + lst);

        lst.sort(Comparator.comparingInt(String::length));
        System.out.println("Po duljini: " + lst);
    }
}

/*
1. prirodni poredak za String je abecedni (leksikografski) poredak
2. Comparator koristimo kada zelimo definirati vlastiti kriteri sortiranja koji nije prirodni poredak
3. lst.sort(
    Comparator.comparingInt(String::length)
              .thenComparing(String::compareTo)
);
 */