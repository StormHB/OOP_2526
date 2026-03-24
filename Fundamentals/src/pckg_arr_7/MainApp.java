package pckg_arr_7;

import pckg_arr_7.HelpApp;

public class MainApp {

    public static void main(String[] args) {
        int [][] arr = HelpApp.genArray();
        int max = HelpApp.findMax(arr);

        System.out.println("Nasumicno generirani 2D niz: ");
        HelpApp.print2DArray(arr);

        System.out.println("\nMaksimalna vrijednost u nizu je : " + max);
    }
}
