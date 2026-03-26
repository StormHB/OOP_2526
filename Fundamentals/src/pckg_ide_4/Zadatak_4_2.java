package pckg_ide_4;

import java.util.Scanner;

public class Zadatak_4_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        while (true) {
            System.out.print("Unesite broj n: ");
            n = sc.nextInt();

            if (n > 0 && (long)n*(n+1)/2 <= Integer.MAX_VALUE) {
                break;
            } else {
                System.out.println("Uneseni broj je prevelik za granice int broja.");
            }
        }

        int suma = 0;

        for (int i = 1; i <= n; i++) {
            suma += i;
        }

        System.out.println("Suma prvih " + n + " prirodnih brojeva je: " + suma);
    }
}
