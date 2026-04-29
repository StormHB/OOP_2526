package inner_loc_cls_final.zadatak_5_2_B2;

public class LocalPortParser {

    public static int parsePort(String s) {

        class PortRules {
            boolean ok(int p) {
                return p >= 1 && p <= 65535;
            }

            String explain(int p) {
                return "Port mora biti 1..65535, dobiveno: " + p;
            }
        }

        int p;

        try {
            p = Integer.parseInt(s.trim());
        } catch (Exception e) {
            throw new IllegalArgumentException("Port nije broj: " + s);
        }

        PortRules rules = new PortRules();

        if (!rules.ok(p)) {
            throw new IllegalArgumentException(rules.explain(p));
        }

        return p;
    }
}