package abs_cls_interfaces_final.zadatak_S_M1;

public class PoProsjeku implements KomparatorStudenata {
    @Override
    public int usporedi(Student s1, Student s2) {
        return Double.compare(s2.getProsjek(), s1.getProsjek());
    }
}
