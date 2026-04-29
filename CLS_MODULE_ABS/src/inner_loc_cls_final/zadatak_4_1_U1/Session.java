package inner_loc_cls_final.zadatak_4_1_U1;

public class Session {
    private int events = 0;

    public class Tracker {
        public void hit() {
            events++;
        }

        public int count() {
            return events;
        }
    }

    public Tracker tracker() {
        return new Tracker();
    }
}
