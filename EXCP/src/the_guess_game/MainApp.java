package the_guess_game;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameManager manager = new GameManager(scanner);
        manager.start();
        scanner.close();
    }
}
