package vj_hm_2;

import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {

        TreeMap<Student, Integer[]> studenti = new TreeMap<Student, Integer[]>();
        Student s1 = new Student("Lovre", 19);
        Student s2 = new Student("Kristijan", 22);
        Student s3 = new Student("Lucija", 20);
        Student s4 = new Student("Božena", 23);
        Student s5 = new Student("Luka", 25);
        Student s6 = new Student("Iva", 29);
        studenti.put(s1, new Integer[]{2,3,3,3});
        studenti.put(s2, new Integer[]{2,4,3,2});
        studenti.put(s3, new Integer[]{4,4,4,4});
        studenti.put(s4, new Integer[]{5,4,3,3});
        studenti.put(s5, new Integer[]{5,4,5,5});
        studenti.put(s6, new Integer[]{2,2,2,2});
        System.out.println(studenti);
        TreeMap<Student, Integer[]> studentiImena = new TreeMap<>(new NameLengthComparator());
        studentiImena.putAll(studenti);
        System.out.println(studentiImena);
        TreeMap<Student, Integer[]> studentiGodine = new TreeMap<>(new AgeComparator().reversed());
        studentiGodine.putAll(studenti);
        System.out.println(studentiGodine);
        TreeMap<Student, Integer[]> studentiHash = new TreeMap<>(new HashCodeComparator());
        studentiHash.putAll(studenti);
        for (Student s : studenti.keySet()) {
            System.out.println(s.getName() + " -> " + s.hashCode());
        }
        System.out.println(studentiHash);
        listAllElements(studentiImena);
    }

    private static void listAllElements(TreeMap<Student, Integer[]> tMap) {
        for(Map.Entry<Student, Integer[]> elem : tMap.entrySet()) {
            System.out.println("Key: " + elem.getKey().getName());
            for(Integer ocj: elem.getValue()){
                System.out.println("Ocjena: " + ocj);
            }
        }
    }

    private static <K, V> void listAllMapElements(Map<K, V> map) {
        for(Map.Entry<K, V> elem : map.entrySet()) {
            System.out.println("Key: " + elem.getKey());
            System.out.println("Value: " + elem.getValue());
        }
    }
}
