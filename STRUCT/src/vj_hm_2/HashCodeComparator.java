package vj_hm_2;

import java.util.Comparator;

public class HashCodeComparator implements Comparator<Student> {
    @Override
    public int compare(Student st1, Student st2) {
        return Integer.compare(st1.hashCode(), st2.hashCode());
    }
}
