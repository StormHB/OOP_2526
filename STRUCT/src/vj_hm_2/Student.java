package vj_hm_2;

public class Student implements Comparable<Student>{

    private String name;
    private int id;
    private int age;
    private static int cntID = 20;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = cntID++;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", hash=" + this.hashCode() +
                '}';
    }

    @Override
    public int compareTo(Student other) {
        /*if (this.id > other.id) {
            return 1;
        } else if (this.id < other.id) {
            return -1;
        } else {
            return 0;
        }*/
        return Integer.compare(this.id, other.id);
    }
}
