package vj_hm_2;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student st1, Student st2) {
        return Integer.compare(st1.getAge(), st2.getAge());
    }
}
