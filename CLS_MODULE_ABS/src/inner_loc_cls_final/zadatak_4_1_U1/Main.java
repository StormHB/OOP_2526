package inner_loc_cls_final.zadatak_4_1_U1;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== INNER CLASS HAS REFERENCE TO OUTER CLASS INSTANCE ===");

        Session sharedSession = new Session();

        Session.Tracker trackerA = sharedSession.tracker();
        Session.Tracker trackerB = sharedSession.tracker();

        trackerA.hit();
        trackerB.hit();
        trackerA.hit();

        System.out.println("Both Tracker objects reference the SAME Session instance");
        System.out.println("→ shared state (same 'events' field)");
        System.out.println("Tracker A count: " + trackerA.count());
        System.out.println("Tracker B count: " + trackerB.count());

        System.out.println("\n=== INNER CLASS WITH DIFFERENT OUTER INSTANCES ===");

        Session session1 = new Session();
        Session session2 = new Session();

        Session.Tracker tracker1 = session1.tracker();
        Session.Tracker tracker2 = session2.tracker();

        tracker1.hit();
        tracker2.hit();
        tracker1.hit();

        System.out.println("Each Tracker references a DIFFERENT Session instance");
        System.out.println("→ independent state (separate 'events' fields)");
        System.out.println("Session 1 Tracker count: " + tracker1.count());
        System.out.println("Session 2 Tracker count: " + tracker2.count());
    }
}