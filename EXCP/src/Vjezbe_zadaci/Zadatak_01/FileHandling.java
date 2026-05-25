package Vjezbe_zadaci.Zadatak_01;

import java.io.*;
import java.util.Scanner;

public class FileHandling {
    public static void readFileScanner(String fileName) {
        File file = new File(fileName);

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            System.out.println("Reading with Scanner finished.");
        } catch (FileNotFoundException fnfe) {
            System.out.println("Datoteka ne postoji: " + fileName);
        }
    }

    public static void readFileBufferedReader(String fileName) {
        File file = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("Reading with BufferedReader finished.");
        } catch (FileNotFoundException fnfe) {
            System.out.println("Datoteka ne postoji: " + fileName);
        } catch (IOException ioe) {
            System.out.println("Greska pri citanju datoteke: " + fileName);
        }
    }

    public static void writeToFile(String fileName, String text) {
        File file = new File(fileName);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write(text);
            bw.newLine();
            System.out.println("Writing finished.");
        } catch (IOException ioe) {
            System.out.println("Greska pri pisanju u datoteku: " + fileName);
        }
    }

    public static void askUserForFile() {
        Scanner input = new Scanner(System.in);
        boolean keepTrying = true;

        while (keepTrying) {
            System.out.println("Unesite ime datoteke za citanje: ");
            String fileName = input.nextLine();
            File file = new File(fileName);

            if (file.exists()) {
                readFileScanner(fileName);
                keepTrying = false;
            } else {
                System.out.println("Datoteka ne postoji: " + fileName);
                System.out.println("Zelite li pokusati ponovno? 'y' za da, bilo sto drugo za ne: ");
                String answer = input.nextLine();

                if (!answer.equalsIgnoreCase("y")) {
                    keepTrying = false;
                    System.out.println("Korisnik je prekinuo unos.");
                }

            }
        }
    }
}
