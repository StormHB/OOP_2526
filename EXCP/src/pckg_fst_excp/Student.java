package pckg_fst_excp;

public class Student {

    private String name;
    private float score;

    public Student () {

    }

    public Student(String name, float score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
