package pckg_fst_excp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AUX_CLS_SCORES {
    public static List<Student> readStudentScores(String filePath) throws FileNotFoundException {
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(new File(filePath));
        String line = null;
        while(scanner.hasNextLine()) {
            line = scanner.nextLine();
            try {
                Student student = parseStudentLine(line);
                students.add(student);
                System.out.println("New student added to a list.");
            } catch (IllegalArgumentException iae) {
                System.out.println("Illegal line for parsing.");
            }
        }
            return students;
    }

    private static Student parseStudentLine(String line) {
        String[] parts = line.split(",");
        Student student = new Student();
        if (parts.length!= 2) {
            throw new IllegalArgumentException("There should be two parts - name and score!");
        } else {
            try {
                String name = parts[0].trim();
                float score = Float.parseFloat(parts[1].trim());
                student = new Student(name, score);
            } catch (NumberFormatException nfe) {
                throw new IllegalArgumentException("There is no number for score value!");
            }
        }
        return student;
    }

    public static void listStudentScores(List<Student> scores) {
        for(Student  student: scores) {
            System.out.println(student);
        }
    }
}
