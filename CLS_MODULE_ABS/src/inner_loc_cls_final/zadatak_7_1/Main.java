package inner_loc_cls_final.zadatak_7_1;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();

        menu.submenu("File")
                .action("New", () -> System.out.println("New file"))
                .submenu("Open Recent")
                .action("Project 1", () -> System.out.println("Project 1"))
                .action("Project 2", () -> System.out.println("Project 2"))
                .end()
                .action("Exit", () -> System.out.println("Exit"));

        menu.print();
    }
}