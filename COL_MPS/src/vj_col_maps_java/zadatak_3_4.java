package vj_col_maps_java;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class zadatak_3_4 {

    static class Robot {
        final int id;
        final String opis;

        Robot(int id, String opis) {
            this.id = id;
            this.opis = opis;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Robot)) return false;
            Robot r = (Robot) o;
            return this.id == r.id;
        }

        @Override
        public int hashCode() {
            return Integer.hashCode(id);
        }

        @Override
        public String toString() {
            return "Robot{id=" + id + ", opis='" + opis + "'}";
        }
    }

    public static void main(String[] args) {

        Robot flying = new Robot(1, "flying robot");
        Robot cleaning = new Robot(2, "cleaning robot");
        Robot thinking = new Robot(3, "thinking robot");
        Robot humorous = new Robot(4, "humorous robot");
        Robot friendly = new Robot(5, "friendly robot");
        Robot weird = new Robot(6, "weird robot");

        Map<Integer, Robot> mapa = new LinkedHashMap<>();
        mapa.put(flying.id, flying);
        mapa.put(cleaning.id, cleaning);
        mapa.put(thinking.id, thinking);
        mapa.put(humorous.id, humorous);
        mapa.put(friendly.id, friendly);
        mapa.put(weird.id, weird);

        Set<Robot> skup = new LinkedHashSet<>(mapa.values());

        mapa.put(friendly.id, friendly);
        skup.add(friendly);

        Robot friendly2 = new Robot(5, "friendly robot (kopija)");
        mapa.put(friendly2.id, friendly2);
        skup.add(friendly2);

        System.out.println("=== LinkedHashMap ===");
        for (Map.Entry<Integer, Robot> e : mapa.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        System.out.println("\n=== LinkedHashSet ===");
        for (Robot r : skup) {
            System.out.println(r);
        }
    }
}

/*
odabir kriterija jednakosti ovisi o znacenju domene; ako id
predstavlja jedinstveni identifikator, tada je dovoljno usporedivati
samo id, a ako je vazan i opis, tada se moze koristiti kombinacija oba atributa.
 */