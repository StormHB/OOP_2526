package vj_hm;

import com.sun.source.tree.Tree;

import java.util.*;

public class Test {
    static void main(String[] args) {
        HashMap<Integer, String> podaci = new HashMap<>();
        HashMap<Student, Integer[]> studentiPodaci = new HashMap<>();
        studentiPodaci.put(new Student("Miro"), new Integer[]{2, 3, 4, 5, 5});
        studentiPodaci.put(new Student("Olga"), new Integer[]{2, 3, 4, 5, 5});
        studentiPodaci.put(new Student("Mira"), new Integer[]{2, 3, 4, 5, 5});
        listMapElements(studentiPodaci);
        TreeMap<Student, Integer[]> tmStudenti = new TreeMap<>(studentiPodaci);
        System.out.println(tmStudenti);
        podaci.put(21, "Stipe");
        podaci.put(159, "Divna");

        podaci.put(985, "Etna");
        podaci.put(455, "Petar");
        podaci.put(5788, "Vlatka");
        System.out.println(podaci);
        listMapElements(podaci);
        TreeMap<Integer, String> tmPodaci = new TreeMap<>(podaci);
        System.out.println(tmPodaci);
        listMapElements(tmPodaci);
    }

    /*private static void listMapElements(Map<Integer, String> podaci) {
        Set<Map.Entry<Integer, String>> entrySet = podaci.entrySet();
        for (Map.Entry<Integer, String> es : entrySet) {
            System.out.println(es.getKey() + " - " + es.getValue());
        }
    }

    private static void listMapElementsNew(Map<Student, Integer[]> podaci) {
        Set<Map.Entry<Student, Integer[]>> entrySet = podaci.entrySet();
        for (Map.Entry<Student, Integer[]> es : entrySet) {
            System.out.println(es.getKey() + " - " + Arrays.toString(es.getValue()));
        }
    }*/

    private static <K, V> void listMapElements(Map <K, V> podaci) {
        Set<Map.Entry<K, V>> entrySet = podaci.entrySet();
        for(Map.Entry<K, V> es : entrySet) {
            System.out.println(es.getKey() + " - " + es.getValue());
        }
    }
}
