package pckg_arr_2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ArrPomocna {

    public static Float[] getUserDefinedTemp(Scanner scanner, int numElements) {
        Float[] temps = new Float[numElements];

        for (int k = 0; k < numElements; k++) {
            System.out.print("Unesite " + (k + 1) + ". temperaturu: ");
            temps[k] = scanner.nextFloat();
        }

        return temps;
    }

    public static Float[] genRandomTemp(int numTemps) {
        Float MAX = 39f;
        Float MIN = -10f;
        Float[] temps = new Float[numTemps];

        for (int k = 0; k < numTemps; k++) {
            temps[k] = ThreadLocalRandom.current().nextFloat(MIN, MAX);
        }

        return temps;
    }

    public static float avgTemp(Float[] temps) {
        float acumSum = 0;

        for (Float el : temps) {
            acumSum += el;
        }

        return acumSum / temps.length;
    }

    public static void aboveBelow(Float[] temps) {
        int above = 0;
        int below = 0;
        int eq = 0;

        float avg = avgTemp(temps);

        for (Float el : temps) {
            if (el > avg) {
                above++;
            } else if (el < avg) {
                below++;
            } else {
                eq++;
            }
        }

        System.out.println("----------------------------");
        System.out.println("Prosjecna temperatura: " + avg);
        System.out.println("Ukupan broj mjerenja: " + temps.length);
        System.out.println("Broj temperatura iznad prosjeka: " + above);
        System.out.println("Broj temperatura ispod prosjeka: " + below);
        System.out.println("Broj temperatura jednakih prosjeku: " + eq);
    }
}