package pckg_arr_6;

import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {

        int[] original = HelpApp.generateArray(15);
        int[] copy = HelpApp.copyArray(original);

        boolean equal = HelpApp.checkEquality(original, copy);

        System.out.println("Originalni niz: " + Arrays.toString(original));
        System.out.println("Kopirani niz:   " + Arrays.toString(copy));

        if (equal) {
            System.out.println("Nizovi su jednaki.");
        } else {
            System.out.println("Nizovi nisu jednaki.");
        }
    }
}