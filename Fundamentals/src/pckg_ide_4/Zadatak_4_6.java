package pckg_ide_4;

import java.util.Scanner;

public class Zadatak_4_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String dobro = "dobro";
        String bolje = "bolje";
        String najbolje = "najbolje";

        System.out.print("Kako ste danas? ");
        String raspolozenje = sc.nextLine();

        switch (raspolozenje) {
            case "dobro":
                System.out.println("Hvala, danas sam: " + dobro);
                break;
            case "bolje":
                System.out.println("Hvala, danas sam: " + bolje);
                break;
            case "najbolje":
                System.out.println("Hvala, danas sam: " + najbolje);
                break;
            default:
                System.out.println("Sigurno ce biti bolje!");
        }
    }
}