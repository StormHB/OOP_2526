package the_guess_game;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    private final Scanner scanner;
    private final String username;
    private int secretNumber;

    public GuessGame(Scanner scanner, String username) {
        this.scanner = scanner;
        this.username = username;
    }

    public PlayerResult play() {
        System.out.println("\nIgra pocinje za korisnika: " + username);
        System.out.println("Mozete unijeti \"exit\" za izlazak iz igre.");

        int attempts = 0;

        int lowerLimit = readInteger("Unesite donju granicu: ");
        int upperLimit = readInteger("Unesite gornju granicu: ");

        if (lowerLimit > upperLimit) {
            System.out.println("Donja granica ne moze biti veca od gornje.");
            return null;
        }

        Random random = new Random();
        secretNumber = random.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;

        while (true) {
            System.out.print("Pogodite broj (" + lowerLimit + " - " + upperLimit + "): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Korisnik je izasao iz igre.");
                return null;
            }

            try {
                int guess = Integer.parseInt(input);

                validateGuess(guess, lowerLimit, upperLimit);

                attempts++;

                if (guess == secretNumber) {
                    System.out.println("Tocno! Pogodili ste broj iz " + attempts + ". pokusaja.");
                    return new PlayerResult(username, attempts);
                } else if (guess < secretNumber) {
                    System.out.println("Trazeni broj je veci.");
                    lowerLimit = guess + 1;
                } else {
                    System.out.println("Trazeni broj je manji.");
                    upperLimit = guess - 1;
                }

            } catch (NumberFormatException e) {
                System.out.println("Morate unijeti cijeli broj ili \"exit\".");
            } catch (InvalidGuessException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private int readInteger(String message) {
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine();

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Unos mora biti cijeli broj.");
            }
        }
    }

    private void validateGuess(int guess, int lowerLimit, int upperLimit) throws InvalidGuessException {
        if (guess < lowerLimit || guess > upperLimit) {
            throw new InvalidGuessException(
                    "Broj mora biti izmedu " + lowerLimit + " i " + upperLimit + "."
            );
        }
    }
}