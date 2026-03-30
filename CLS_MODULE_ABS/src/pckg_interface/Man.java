package pckg_interface;

public class Man {

    private String name;
    private int id;
    private static int cntID = 10;

    public Man(String name) {
        this.id = cntID++;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
