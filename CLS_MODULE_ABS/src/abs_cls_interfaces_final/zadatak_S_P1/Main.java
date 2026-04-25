package abs_cls_interfaces_final.zadatak_S_P1;

public class Main {
    public static void main(String[] args) {

        Obavijestiv[] kanali = {
                new EmailObavijest("test@example.com"),
                new SMSObavijest("+385912345678")
        };

        for (Obavijestiv kanal : kanali) {
            kanal.posaljiObavijest("Sustav radi ispravno.");
        }
    }
}