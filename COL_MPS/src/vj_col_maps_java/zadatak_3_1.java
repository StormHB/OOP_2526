package vj_col_maps_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class zadatak_3_1 {
    static String zamijeniBrisanjem(List<String> lista, int indeks, String novi) {
        String stari = lista.remove(indeks);
        lista.add(indeks, novi);
        return stari;
    }

    public static void main(String[] args) {
        List<String> arr = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));

        LinkedList<String> ln = new LinkedList<>();
        ln.addAll(arr);

        System.out.println("ArrayList: " + arr);
        System.out.println("LinkedList: " + ln);

        ln.addLast("KRAJ-1");
        ln.addFirst("POCETAK");
        ln.addLast("KRAJ-2");

        System.out.println("Prosirena LinkedList:");

        for (String s : ln) {
            System.out.print(s + " ");
        }

        System.out.println();

        String izbrisan = zamijeniBrisanjem(ln, 4, "NOVI");

        System.out.println("Izbrisan element: " + izbrisan);
        System.out.println("Nakon zamjene: " + ln);
    }
}

/*
1. add mozemo koristiti na bilo koji indeks koji je prisutan u listi (index, element),
pomice sve ostale elemente O(N),
addfirst samo za prvi index O(1),
addlast za zadnji index O(1)
2. vraca ga jer smo stavili return stari, pa ga mozemo spremiti ili ponovno koristiti
3. dobili bi IndexOutOfBoundsException
 */