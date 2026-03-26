package pckg_ide_4;

import java.util.Scanner;

public class Zadatak_4_1 {
    public static void main(String[] args) {
        double r = 0;
        double volumen = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Koliki je polumjer kugle? (mora biti manji od 10): ");
        r = sc.nextDouble();

        while (r < 10) {
            volumen = (4.0/3)*Math.PI * Math.pow(r,3);
            System.out.println("Volumen kugle je: " + volumen);
            System.out.print("Koliki je polumjer kugle? (mora biti manji od 10): ");
            r = sc.nextDouble();
        }
    }
}
