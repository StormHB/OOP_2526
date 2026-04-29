package inner_loc_cls_final.zadatak_4_2_L2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<String> words = Arrays.asList(
                "Java",
                "programiranje",
                "OOP",
                "klasa",
                "",
                null,
                "lokalna",
                "inner"
        );

        int minLength = 3;

        int result = LocalStringCounter.countLongerThan(words, minLength);

        System.out.println("Input list:");
        System.out.println(words);

        System.out.println("\nCondition:");
        System.out.println("Count strings longer than " + minLength);

        System.out.println("\nResult:");
        System.out.println(result);
    }
}