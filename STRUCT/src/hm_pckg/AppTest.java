package hm_pckg;

import java.util.ArrayList;
import java.util.HashMap;

public class AppTest {
    static void main(String[] args) {
        String resultFile = POM_CLS.readDataFromTxtFile("./STRUCT/src/hm_pckg/data.txt");
        System.out.println(resultFile);
        ArrayList<String[]> lines = POM_CLS.readDataAsListFromTxtFile("./STRUCT/src/hm_pckg/data.txt");
        POM_CLS.listArrayListElements(lines);
        HashMap<String, String> scientist = POM_CLS.mapFromList(lines);
        System.out.println(scientist);
        POM_CLS.listMapElements(scientist);
        System.out.println("--------------------------------------------------------------------");
        POM_CLS.listMapElementsFast(scientist);
    }
}
