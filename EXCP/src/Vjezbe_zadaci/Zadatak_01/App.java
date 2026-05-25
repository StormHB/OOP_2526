package Vjezbe_zadaci.Zadatak_01;

public class App {

    public static void main(String[] args) {

        String fileName = "randTekst.txt";

        System.out.println("********** Reading with Scanner **********");
        FileHandling.readFileScanner(fileName);

        System.out.println("\n********** Reading with BufferedReader **********");
        FileHandling.readFileBufferedReader(fileName);

        System.out.println("\n********** Writing to file **********");
        FileHandling.writeToFile("nova.txt", "Ovo je tekst koji zapisujemo u datoteku.");

        System.out.println("\n********** Reading non-existing file **********");
        FileHandling.readFileScanner("rndTekst.txt");

        System.out.println("\n********** Ask user for file **********");
        FileHandling.askUserForFile();
    }
}
