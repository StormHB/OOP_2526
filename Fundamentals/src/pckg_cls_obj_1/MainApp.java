package pckg_cls_obj_1;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Robot robot = new Robot(1, "Robo");

        robot.walk();

        System.out.print("Koliko brojeva zelite upisati u 2D niz (max 20)? ");
        int k = sc.nextInt();

        if (k > 20) {
            k = 20;
        }

        for (int i = 0; i < k; i++) {
            robot.fillArr();
        }

        robot.printArr();

        System.out.print("Unesite prirodni broj za faktorijelu: ");
        int n = sc.nextInt();

        System.out.println("Faktorijela broja " + n + " je: " + robot.factJel(n));

        sc.close();
    }
}
