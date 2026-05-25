package Vjezbe_zadaci.Zadatak_03;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class AppClient {

    public static void main(String[] args) {

        int[] arr = genArr(10);

        try {

            System.out.println(arr[arr.length]);

        } catch (ArrayIndexOutOfBoundsException e) {

            StackTraceElement[] stack = e.getStackTrace();

            System.out.println(
                    "Exception: "
                            + e.getClass().getCanonicalName()
                            + " in: "
                            + stack[0]
            );

        } finally {

            System.out.println("Be careful -> array length is: " + arr.length);
        }
    }

    private static int[] genArr(int arraySize) {

        int[] arr = new int[arraySize];

        int index = 0;

        while (index < arraySize) {

            arr[index] = ThreadLocalRandom.current().nextInt(0, 100);

            index++;
        }

        System.out.println(Arrays.toString(arr));

        return arr;
    }
}