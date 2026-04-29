package inner_loc_cls_final.zadatak_4_2_L2;

import java.util.List;

public class LocalStringCounter {

    public static int countLongerThan(List<String> input, int n) {

        class LongerThan {
            boolean ok(String s) {
                return s != null && s.length() > n;
            }
        }

        LongerThan checker = new LongerThan();

        int count = 0;

        for (String s : input) {
            if (checker.ok(s)) {
                count++;
            }
        }

        return count;
    }
}