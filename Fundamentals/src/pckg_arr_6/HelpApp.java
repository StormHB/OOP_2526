package pckg_arr_6;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class HelpApp {

    private static final int MIN = 0;
    private static final int MAX = 100;

    public static int[] generateArray(int size) {
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(MIN, MAX);
        }

        return arr;
    }

    public static int[] copyArray(int[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }

    public static boolean checkEquality(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }
}