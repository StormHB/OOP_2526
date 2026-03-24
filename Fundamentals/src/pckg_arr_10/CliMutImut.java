package pckg_arr_10;

import java.util.Arrays;

public class CliMutImut {

    public static void main(String[] args) {
        String somStr = "Neki ne poseban string";
        int[] nums = {23, 3, 55, 789, 123, 100};
        /*
         * to print each character in the string
         * please see String JAVA API
         */

        for (int k = 0; k < somStr.length(); k++) {
            System.out.println(somStr.charAt(k));
        }
        System.out.println("******************** Analysing String ********************");
        System.out.print("Before some changes in the string - ");
        System.out.println(somStr.getClass().getCanonicalName() + "@" + Integer.toHexString(somStr.hashCode()));
        System.out.println(somStr);
        String newStr = somStr.replace("g", "G");
        System.out.print("After some changes in the string - ");
        System.out.println(newStr.getClass().getCanonicalName() + "@" + Integer.toHexString(newStr.hashCode()));
        System.out.println(newStr);
        System.out.println("****************** Analysing int Arrays ******************");
        System.out.print("Before some changes in an array - ");
        System.out.println(nums.getClass().getCanonicalName() + "@" + Integer.toHexString(nums.hashCode()));
        System.out.println(Arrays.toString(nums));
        nums[nums.length-2] = 100000;
        System.out.print("After some changes in an array - ");
        System.out.println(nums.getClass().getCanonicalName() + "@" + Integer.toHexString(nums.hashCode()));
        System.out.println(Arrays.toString(nums));
    }
    /* iz ispisa se vidi da je kod Stringa promijenjena adresa u memoriji (2831 -> 2811 na kraju) jer je
    String immutable data type, dakle kreiralo je novi objekt u memoriji umjesto da promijeni postojeci
    kod int [] arraya vidimo da je promijenjen jedan element, medutim adresa u memoriji je ostala jednaka
    int [] array je mutable data type, sto znaci da se njegovi elementi mogu mijenjati bez da radimo
    novi objekt
     */
}