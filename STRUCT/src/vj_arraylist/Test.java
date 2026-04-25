package vj_arraylist;

import hm_pckg.POM_CLS;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
    static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<>();
        POM_CLSS.addElementToList(lst, "FST");
        POM_CLSS.addElementToList(lst, "SND");
        POM_CLSS.addElementToList(lst, "TRD");
        POM_CLSS.addElementToList(lst, "FRTH");
        POM_CLSS.addElementToList(lst, "FFTH");
        System.out.println(lst);
        LinkedList<String> vezana = new LinkedList<>(lst);
        System.out.println(vezana);
        System.out.println(lst.getClass().getSimpleName() + "@" + Integer.toHexString(lst.hashCode()));
        System.out.println(vezana.getClass().getSimpleName() + "@" + Integer.toHexString(vezana.hashCode()));
        lst.add("200");
        vezana.add("300");
        System.out.println(lst);
        System.out.println(vezana);
        System.out.println(lst.getClass().getSimpleName() + "@" + Integer.toHexString(lst.hashCode()));
        System.out.println(vezana.getClass().getSimpleName() + "@" + Integer.toHexString(vezana.hashCode()));
        vezana.addFirst("Na prvi");
        vezana.addLast("Na zadnji");
        System.out.println(vezana);
        vezana.add(3, "NEW with index position");
        System.out.println(vezana);
        vezana.set(3, "ERASE THRD");
        System.out.println(vezana);
    }
}
