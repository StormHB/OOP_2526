package pckg_ide_2;

import java.util.Scanner;

public class Zadatak_2_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number which you want to calculate the square and cube of: ");
        double number = sc.nextDouble();

        double square = number * number;
        double cube = number * number * number;

        System.out.println("Square: " + square);
        System.out.println("Cube: " + cube);

        sc.close();
    }
}
