package pckg_arr_7;

import java.util.concurrent.ThreadLocalRandom;

public class HelpApp {

    public static final int ROWS = 3;
    public static final int COLS = 4;
    public static final int MIN = 0;
    public static final int MAX = 100;

    public static int [][] genArray () {
        int [][] arr = new int[ROWS][COLS];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr [i][j] = ThreadLocalRandom.current().nextInt(MIN, MAX);
            }
        }
        return arr;
    }

    public static int findMax(int [][] arr) {
        int max = arr [0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr [i][j] > max) {
                    max = arr [i][j];
                }
            }
        }
        return max;
    }

    public static void print2DArray (int [][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr [i][j] + "\t");
            }
            System.out.println();
        }
    }
}
