package pckg_arr_1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arrInt = AUX_CLS.genIntArray(10);
        System.out.println(Arrays.toString(arrInt));
        String [] someStrings = {"String1", "Novi", "Treći", "Tako dalje", "Finalni"};
        String [] anotherStr;
        String [] newString = new String[7];
        anotherStr = newString;
        printStringArrayElements(someStrings);
        System.out.println("-------------------------------------------------");
        printStringArrayElements(anotherStr);
        anotherStr = someStrings;
        System.out.println(anotherStr);
        System.out.println(anotherStr.length);
        anotherStr = newString;
        System.out.println(newString);
        /* ne moze se naknadno inicijalizirati
        anotherStr = {"blablabla"} */
        System.out.println(newString.length);
        Student[] studenti = new Student[10];
        Student[] studenti2 = {new Student("Marko"), new Student("Ivana"), new Student("Petra")};


    }

    private static void printStringArrayElements(String [] arr) {
        for(String el : arr) {
            System.out.println(el);
        }
    }
}
