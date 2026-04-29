package inner_loc_cls_final.zadatak_6_2_L;

import java.util.List;

public class LocalStatPrinter {

    public static void printStats(List<Integer> numbers) {

        class Stats {
            int count = 0;
            long sum = 0;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            void accept(int x) {
                count++;
                sum += x;
                min = Math.min(min, x);
                max = Math.max(max, x);
            }

            String finish() {
                if (count == 0) {
                    return "Nema elemenata.";
                }

                double average = (double) sum / count;

                return "count=" + count +
                        ", min=" + min +
                        ", max=" + max +
                        ", avg=" + average;
            }
        }

        Stats stats = new Stats();

        for (int x : numbers) {
            stats.accept(x);
        }

        System.out.println(stats.finish());
    }
}