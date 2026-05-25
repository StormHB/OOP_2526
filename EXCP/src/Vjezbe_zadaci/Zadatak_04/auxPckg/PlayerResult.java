package Vjezbe_zadaci.Zadatak_04.auxPckg;

public class PlayerResult {

    private final String username;
    private final int attempts;

    public PlayerResult(String username, int attempts) {
        this.username = username;
        this.attempts = attempts;
    }

    public int getAttempts() {
        return attempts;
    }

    @Override
    public String toString() {
        return username + " - pokusaja: " + attempts;
    }
}
