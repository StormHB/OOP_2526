package Vjezbe_zadaci.Zadatak_04.auxPckg;

import java.util.concurrent.ThreadLocalRandom;

public class Generator {

    public static int genAge2Guess(int lower, int upper) {
        return ThreadLocalRandom.current().nextInt(lower, upper + 1);
    }
}
