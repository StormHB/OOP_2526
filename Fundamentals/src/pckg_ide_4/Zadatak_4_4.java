package pckg_ide_4;

import java.util.Scanner;

public class Zadatak_4_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text;
        String cont;

        while (true) {
            System.out.print("Unesite neki string: ");
            text = sc.nextLine();

            System.out.println("Unijeli ste: \"" + text + "\"");

            System.out.println("Zelite li ponoviti unos? (y za ponavljanje): ");
            cont = sc.nextLine();

            if (!cont.equalsIgnoreCase("y")) {
                System.out.println("Izlaz iz programa.");
                break;
            }
        }
    }
}
