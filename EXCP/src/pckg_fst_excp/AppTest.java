package pckg_fst_excp;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) {
        String filePath = "./EXCP/src/pckg_fst_excp/podaci.csv";
        try {
            List<Student> students = AUX_CLS_SCORES.readStudentScores(filePath);
            System.out.println("\n--------------------------------------------------------------");
            AUX_CLS_SCORES.listStudentScores(students);
        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found!");
        }

    }
}
