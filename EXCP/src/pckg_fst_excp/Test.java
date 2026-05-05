package pckg_fst_excp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        /*ArrayList<String> stringList = null;
        stringList.add("New string");
        System.out.println(stringList);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite double ili float vrijednost!\n");
        double num = scanner.nextDouble();
        System.out.println(num);
        scanner.close();
        System.out.println("Unesite novi broj!\n");
        double newNum = scanner.nextDouble();
        System.out.println(newNum);*/
        ArrayList<String> stringList = null;
        System.out.println(stringList);
        String filePath = "./EXCP/src/pckg_fst_excp/podaci1.csv";
        try {
            Scanner scanner = new Scanner(new File(filePath));
        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found!");
            fnfe.printStackTrace();
        }


    }
}
