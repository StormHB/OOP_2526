package inner_loc_cls_final.zadatak_5_1_A1;

public class Main {
    public static void main(String[] args) {

        User user = User.createEmpty()
                .builder()
                .id("U1")
                .name("Ana")
                .email("ana@example.com")
                .build();

        System.out.println(user);

        User updated = user.builder()
                .email("ana.novo@example.com")
                .build();

        System.out.println(updated);
    }
}