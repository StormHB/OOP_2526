package scanner_primer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

    private static Scanner scanner;

    public static void main(String[] args) {
        try {
            scanner = new Scanner(System.in);
            double num;
            System.out.println("Enter some real number:\t");
            num = scanner.nextDouble();
            System.out.println(num);
        } catch (InputMismatchException ime) {
            /*ime.printStackTrace();*/
            System.out.println("This is exception due to the input mismatch - expected Double.");
        }
        readTxtFile("./POLI/src/scanner_primer/primjer.txt", scanner);
        try {
            readTxtFileSnd("./POLI/src/scanner_primer/primjer2.txt", scanner);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public static void readTxtFile(String filePath, Scanner scanner) {
        try {
            scanner = new Scanner(new File(filePath));
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            System.out.println("Finished reading file.");
        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found!");
            System.out.println(fnfe.getMessage());
        }
    }

    public static void readTxtFileSnd(String filePath, Scanner scanner) throws FileNotFoundException {
        scanner = new Scanner(new File(filePath));
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        System.out.println("Finished reading file.");
    }
}
