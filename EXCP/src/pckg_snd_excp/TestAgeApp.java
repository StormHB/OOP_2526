package pckg_snd_excp;

import pckg_fst_excp.AUX_CLS_SCORES;

import java.util.Scanner;

public class TestAgeApp {

    private static Scanner scanner;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Neka proizvoljna int vrijednost - unesi: ");
        int exampleInt = scanner.nextInt();
        System.out.println(exampleInt);
        //scanner.close();
        Scanner scnr = new Scanner(System.in);
        AUX_CLS_YEARS.enterAge(scnr);
    }
}
