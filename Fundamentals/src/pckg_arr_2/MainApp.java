package pckg_arr_2;

import java.util.Scanner;

public class MainApp {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Unesite broj mjerenja: ");
        int brojMjerenja = scanner.nextInt();

        Float[] temps = ArrPomocna.getUserDefinedTemp(scanner, brojMjerenja);

        ArrPomocna.aboveBelow(temps);
    }
}