package the_guess_game;

public class InvalidGuessException extends Exception {
    public InvalidGuessException(String message) {
        super(message);
    }
}
