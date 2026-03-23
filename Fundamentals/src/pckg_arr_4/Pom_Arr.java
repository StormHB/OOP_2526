package pckg_arr_4;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Pom_Arr {
    public static void main(String[] args) {

        double [][] vars = new double[3][5];
        int nrows = vars.length;
        int nclmns = vars[0].length;

        double min = 500.45;
        double max = 12578.32;

        for (int i = 0; i < nrows; i++) {
            for (int j = 0; j < nclmns; j++) {
                vars [i][j] = ThreadLocalRandom.current().nextDouble(min, max);
            }
        }

        System.out.println(Arrays.deepToString(vars));

        // Nedostatak je sto se cijeli niz ispisuje u jednom retku, imamo 3 niza po 5 elemenata,
        // ne prilici recima i stupcima; nije tablicni prikaz
    }
}
