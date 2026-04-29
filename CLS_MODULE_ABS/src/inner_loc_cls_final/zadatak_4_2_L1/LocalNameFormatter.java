package inner_loc_cls_final.zadatak_4_2_L1;

import java.util.*;

public class LocalNameFormatter {

    public static List<String> formatNames(List<String> names) {

        class NameFormatter {
            String format(String s) {
                if (s == null) return null;

                String t = s.trim();
                if (t.isEmpty()) return t;

                return t.substring(0, 1).toUpperCase()
                        + t.substring(1).toLowerCase();
            }
        }

        NameFormatter f = new NameFormatter();
        List<String> out = new ArrayList<>();

        for (String n : names) {
            out.add(f.format(n));
        }

        return out;
    }
}