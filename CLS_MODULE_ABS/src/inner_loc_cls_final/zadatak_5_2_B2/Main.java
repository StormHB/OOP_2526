package inner_loc_cls_final.zadatak_5_2_B2;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== VALID INPUT ===");
        System.out.println(LocalPortParser.parsePort("8080"));

        System.out.println("\n=== INVALID RANGE ===");
        try {
            System.out.println(LocalPortParser.parsePort("70000"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n=== NOT A NUMBER ===");
        try {
            System.out.println(LocalPortParser.parsePort("abc"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}