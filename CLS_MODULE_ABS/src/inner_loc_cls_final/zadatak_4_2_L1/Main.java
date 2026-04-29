package inner_loc_cls_final.zadatak_4_2_L1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "ana",
                "  MARKO",
                "iVaNa",
                "   petar   ",
                "",
                "   ",
                null
        );

        List<String> formatted = LocalNameFormatter.formatNames(names);

        System.out.println("Original:");
        System.out.println(names);

        System.out.println("\nFormatted:");
        System.out.println(formatted);
    }
}