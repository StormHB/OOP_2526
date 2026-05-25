package Vjezbe_zadaci.Zadatak_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppClient {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            try {
                System.out.print("Please enter one integer: ");
                int input = sc.nextInt();
                System.out.println("You have entered: " + input);
                running = false;
            } catch (InputMismatchException ime) {
                System.out.println("Wrong input; only integers are allowed.");
                sc.nextLine();
                System.out.print("Try again? 'y' for yes, anything else for no: ");
                String choice = sc.nextLine();
                if (!choice.equals("y")) {
                    System.out.println("Program turning off.");
                    running = false;
                }
            }
        }
        sc.close();
    }
}
