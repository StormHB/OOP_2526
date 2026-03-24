package pckg_ide_3;

import java.util.Scanner;

public class Zadatak_3_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite neki cijeli broj: ");

        while (!sc.hasNextInt()) {
            System.out.print("Pogresan unos! Unesite neki cijeli broj: ");
            sc.next();
        }
        int broj = sc.nextInt();
        System.out.println("Unijeli ste broj: " + broj);
    }
}
