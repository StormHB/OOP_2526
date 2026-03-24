package pckg_arr_9;

public class MainApp {
    public static void main(String[] args) {

        float [] nums = {2.44f, 4.55f, 7.88f, 44.32f, 51.11f};
        int index = 0;

        for (float i : nums) {
            System.out.println("Index: " + index + " <-> Value: " + i);
            index++;
        }
    }
}
