package pckg_snd_excp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AUX_CLS_YEARS {
    public static void enterAge(Scanner scanner) {
        boolean repeatEntry = true;
        while (repeatEntry) {
            System.out.println("Please enter your age as an integer: ");
            try {
                int userAge = scanner.nextInt();
                checkNegativeValues(userAge);
                System.out.println("Entered age is: " + userAge);
                repeatEntry = false;
            } catch (InputMismatchException ime) {
                System.out.println("Entered value must be an integer value.");
                scanner.nextLine();
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
                scanner.nextLine();
            }
        }


    }

    private static void checkNegativeValues(int inputAge) {
        if (inputAge <= 0) {
            throw new IllegalArgumentException("Negative number or zero is not legal for age value.");
        } else {
            System.out.println("Good value for age.");
        }
    }
}
