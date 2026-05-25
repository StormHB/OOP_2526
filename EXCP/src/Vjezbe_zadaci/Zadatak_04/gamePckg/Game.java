package Vjezbe_zadaci.Zadatak_04.gamePckg;

import Vjezbe_zadaci.Zadatak_04.auxPckg.Generator;
import Vjezbe_zadaci.Zadatak_04.auxPckg.UserInputException;
import Vjezbe_zadaci.Zadatak_04.auxPckg.UserInputs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {

    private static final Scanner sc = new Scanner(System.in);
    private static final int MIN_AGE = 1;
    private static final int MAX_AGE = 120;

    public static void runGame() {

        int ageToGuess = Generator.genAge2Guess(MIN_AGE, MAX_AGE);
        int counter = 0;
        boolean playing = true;

        System.out.println("Igra pogodi godine je pokrenuta.");
        System.out.println("Tražena vrijednost je između " + MIN_AGE + " i " + MAX_AGE + ".");

        while (playing) {

            try {
                UserInputs userInputs = userInputs();

                counter++;

                boolean guessed = guessStatus(userInputs, ageToGuess, counter);

                if (guessed) {
                    System.out.println("Pogodak!!!");
                    System.out.println("Broj pokusaja: " + counter);
                    playing = false;
                } else {
                    playing = contGame();
                }

            } catch (InputMismatchException e) {
                System.out.println("Pogresan unos -> dozvoljeni su samo cijeli brojevi.");
                sc.nextLine();
                playing = contGame();

            } catch (UserInputException e) {
                System.out.println(e.getMessage());
                playing = contGame();
            }
        }

        System.out.println("Kraj igre.");
    }

    private static UserInputs userInputs() throws UserInputException {

        System.out.print("Unesi donju granicu: ");
        int lowerBound = sc.nextInt();
        isInputNegative(lowerBound);

        System.out.print("Unesi gornju granicu: ");
        int upperBound = sc.nextInt();
        isInputNegative(upperBound);

        if (lowerBound >= upperBound) {
            throw new UserInputException("Donja granica mora biti manja od gornje granice.");
        }

        if (lowerBound < MIN_AGE || upperBound > MAX_AGE) {
            throw new UserInputException("Granice moraju biti u rasponu od " + MIN_AGE + " do " + MAX_AGE + ".");
        }

        System.out.print("Pogodi godine: ");
        int guess = sc.nextInt();
        isInputNegative(guess);

        if (guess < lowerBound || guess > upperBound) {
            throw new UserInputException("Unos godina mora biti unutar zadanog intervala.");
        }

        UserInputs userInputs = new UserInputs(lowerBound, upperBound, guess);
        userInputs.setStatus(true);

        return userInputs;
    }

    private static void isInputNegative(int value) throws UserInputException {

        if (value < 0) {
            throw new UserInputException("Negativne vrijednosti nisu dozvoljene.");
        }
    }

    private static boolean contGame() {

        try {
            System.out.println();
            System.out.println("Želite li nastaviti -> 1 za DA, a bilo koji drugi broj za NE!");
            int answer = sc.nextInt();

            return answer == 1;

        } catch (InputMismatchException e) {
            sc.nextLine();
            return false;
        }
    }

    private static boolean guessStatus(UserInputs userInputs, int ageToGuess, int counter) {

        int lowerBound = userInputs.getLowerBound();
        int upperBound = userInputs.getUpperBound();
        int guess = userInputs.getGuess();

        if (guess == ageToGuess) {
            System.out.println();
            System.out.println(counter + ": Vaša vrijednost = " + guess);
            return true;
        }

        System.out.println();
        System.out.println("Promašaj!!!");
        System.out.println(counter + ": Vaša vrijednost = " + guess);

        if (ageToGuess < lowerBound) {
            System.out.println("Tražena vrijednost je manja od " + lowerBound + "!");
        } else if (ageToGuess > upperBound) {
            System.out.println("Tražena vrijednost je veća od " + upperBound + "!");
        } else {
            System.out.println("Tražena vrijednost je unutar zadanog intervala, ali nije " + guess + ".");
        }

        return false;
    }
}