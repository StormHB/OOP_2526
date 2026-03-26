package pckg_ide_4;

import java.util.Scanner;

public class Zadatak_4_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;

        while (true) {
            System.out.print("Molimo unesite broj n: ");
            n = sc.nextInt();

            if (n == 158) {
                break;
            }

            System.out.println("Unijeli ste broj " + n + ", sto nije trazena vrijednost.");
        }

        System.out.println("Cestitam, pogodili ste, broj je bio 158!");
    }
}
