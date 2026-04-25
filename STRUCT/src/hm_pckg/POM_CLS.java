package hm_pckg;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

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

    public static ArrayList<String[]> readDataAsListFromTxtFile(String filePath){
        ArrayList<String[]> lines = new ArrayList<>();
        try{
            Scanner scanner = new Scanner(new File(filePath));
            String line = null;
            while(scanner.hasNextLine()){
                line = scanner.nextLine();
                String[] parts = line.split(",");
                lines.add(parts);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File can not be found!");
        }
        System.out.println("Data reading from file - finished!");
        return lines;
    }

    public static void listArrayListElements(ArrayList<String[]> elements){
        for(String[] arr : elements){
            System.out.println(Arrays.toString(arr));
        }
    }

    public static HashMap<String, String> mapFromList(ArrayList<String[]> lines){
        HashMap<String, String> mapScientists = new HashMap<>();
        for(String[] line : lines){
            String key = line[0].trim();
            String value = line[1].trim();
            mapScientists.put(key, value);
        }
        System.out.println("Mapping finished!");
        return mapScientists;
    }

    public static void listMapElements(HashMap<String, String> mapa){
        for(String key : mapa.keySet()) {
            System.out.println(key + ": " + mapa.get(key));
        }
    }

    public static void listMapElementsFast(HashMap<String, String> mapa){
        Set<Map.Entry<String, String>> pairs = mapa.entrySet();
        for(Map.Entry<String, String> k : pairs){
            System.out.println(k.getKey() + ": " + k.getValue());
        }
    }
}
