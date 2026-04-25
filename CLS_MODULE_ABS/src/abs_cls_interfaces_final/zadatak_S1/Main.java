package abs_cls_interfaces_final.zadatak_S1;

public class Main {
    public static void main(String[] args) {
        Pozdravlja [] pozdravi = {
                new FormalniPozdrav(),
                new NeformalniPozdrav()
        };
        for (Pozdravlja p: pozdravi) {
            System.out.println(p.pozdrav());
        }
    }
}
