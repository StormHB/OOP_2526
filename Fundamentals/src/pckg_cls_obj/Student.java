package pckg_cls_obj;

public class Student {

    private String name;
    private String surname;
    private int id;
    public Student(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }
    public void subscribeToStudentService() {
        System.out.println("Student's id: " + id);
        System.out.println(name + " - " + surname + " is subscribed to student service.");
    }
}
