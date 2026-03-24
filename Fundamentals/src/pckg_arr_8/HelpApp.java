package pckg_arr_8;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class HelpApp {

    public static final int SIZE = 15;
    public static final double MIN = 0.0;
    public static final double MAX = 100.0;

    public static double [] genArray() {
        double [] arr = new double [SIZE];

        for (int i = 0; i < arr.length; i++) {
            double value = ThreadLocalRandom.current().nextDouble(MIN, MAX);

            arr [i] = Math.round(value * 100.0)/100.0;
        }
        return arr;
    }

    public static double [] copyArray (double [] arr) {
        return Arrays.copyOf(arr, arr.length);
    }

    public static void sortDescending (double [] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    double temp = arr [i];
                    arr [i] = arr [j];
                    arr [j] = temp;
                }
            }
        }
    }
}
