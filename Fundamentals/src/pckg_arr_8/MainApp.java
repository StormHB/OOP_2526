package pckg_arr_8;

import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {

        double [] original = HelpApp.genArray();
        double [] sorted = HelpApp.copyArray(original);

        HelpApp.sortDescending(sorted);

        System.out.println("Nesortirani niz: ");
        System.out.println(Arrays.toString(original));

        System.out.println("\nSortirani niz (descending): ");
        System.out.println(Arrays.toString(sorted));
    }
}
