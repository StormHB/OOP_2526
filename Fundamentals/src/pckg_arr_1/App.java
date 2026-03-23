package pckg_arr_1;

import java.util.Scanner;

public class App {
    private static Scanner scanner;


    public static void main(String[] args) {
        String [] elem = {"Vasa", "vana plurimum", "sonant"};
        String res = AUX_CLS.concatenateArrElements(elem);
        System.out.println(res);
        scanner = new Scanner(System.in);
        String[] elms = AUX_CLS.userInputsArray(scanner, 4);
        AUX_CLS.printElementsFromArray(elms);
    }
}
