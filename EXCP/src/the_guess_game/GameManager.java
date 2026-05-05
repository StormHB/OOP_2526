package the_guess_game;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class GameManager {
    private final Scanner scanner;
    private final List<PlayerResult> results = new ArrayList<>();

    public GameManager(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        boolean programRunning = true;

        while (programRunning) {
            System.out.print("Unesite ime korisnika: ");
            String username = scanner.nextLine();

            boolean sameUserPlaying = true;

            while (sameUserPlaying) {
                GuessGame game = new GuessGame(scanner, username);
                PlayerResult result = game.play();

                if (result != null) {
                    results.add(result);
                } else {
                    System.out.println("Rezultat nije zabiljezen.");
                }

                System.out.print("Ponovno igranje? (da = isti korisnik, novi = novi korisnik, ne = izlaz): ");
                String answer = scanner.nextLine();

                if (answer.equalsIgnoreCase("da")) {
                    sameUserPlaying = true;
                } else if (answer.equalsIgnoreCase("novi")) {
                    sameUserPlaying = false;
                } else {
                    sameUserPlaying = false;
                    programRunning = false;
                }

                System.out.println();
            }
        }

        printRankingList();
    }

    private void printRankingList() {
        System.out.println("\n====== RANG LISTA ======");

        if (results.isEmpty()) {
            System.out.println("Nema rezultata.");
            return;
        }

        results.sort(Comparator.comparingInt(PlayerResult::getAttempts));

        System.out.println("Pobjednik: " + results.get(0));
        System.out.println();

        for (int i = 0; i < results.size(); i++) {
            System.out.println((i + 1) + ". " + results.get(i));
        }
    }
}