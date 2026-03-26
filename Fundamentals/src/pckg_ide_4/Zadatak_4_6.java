package pckg_ide_4;

import java.util.Scanner;

public class Zadatak_4_6 {

    public static void main(String[] args) {

        System.out.print("Kako si danas? ");
        Scanner sc = new Scanner(System.in);
        String raspolozenje = sc.nextLine();

        if ("dobro".equals(raspolozenje)) {
            System.out.println("Hvala, danas sam: " + raspolozenje);
        } else if ("bolje".equals(raspolozenje)) {
            System.out.println("Hvala, danas sam: " + raspolozenje);
        } else if ("najbolje".equals(raspolozenje)) {
            System.out.println("Hvala, danas sam: " + raspolozenje);
        } else {
            System.out.println("Sigurno ce biti bolje!");
        }
    }
}
