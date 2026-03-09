package pckg_cls_obj;

public class AppTest {
    public static void main(String[] args) {
        Student s1 = new Student("Petar", "Petrić", 12);
        Student s2 = new Student("Franka", "Franić", 43);
        s1.subscribeToStudentService();
        s2.subscribeToStudentService();
        System.out.println(s1);
        Hlace h1 = new Hlace("Levis 501");
        h1.koristeneHlace();
        Hlace h2;
        h2 = h1.nekakoOciscene(s1);
        System.out.println(h1);
        System.out.println(h2);
    }
}
