package fst_gui;

import javax.swing.*;
import java.io.*;

public class AUX_IO {

    private static final BrowseFileChooser fileChooser = new BrowseFileChooser();

    public static void saveTxtDataFromArea(String data, String filePath) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write(data);
            System.out.println("Txt Data written in the file: " + filePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void saveTxtDataWithFileChooser(String data) {
        int returnVal = fileChooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            String filePath = fileChooser.getSelectedFile().getAbsolutePath();
            saveTxtDataFromArea(data, filePath);
        }
    }

    public static String loadTxtDataFromFile(String filePath) {
        StringBuilder stringBuilder = new StringBuilder();
        String line = null;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                stringBuilder.append(line + "\n");
            }
            System.out.println("Data read from file: " + filePath);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stringBuilder.toString();
    }

    public static String loadTxtDataWithFileChooser() {
        String data = "";
        int returnVal = fileChooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            String filePath = fileChooser.getSelectedFile().getAbsolutePath();
            data = loadTxtDataFromFile(filePath);
        }
        return data;
    }
}
