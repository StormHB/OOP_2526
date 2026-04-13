package hm_pckg;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class POM_CLS {
    public static String readDataFromTxtFile(String filePath){
        String result = null;
        try {
            Scanner scanner = new Scanner(new File(filePath));
            String line = scanner.nextLine();
            while(scanner.hasNextLine()){
                line += scanner.nextLine();
            }
            result = line;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}
