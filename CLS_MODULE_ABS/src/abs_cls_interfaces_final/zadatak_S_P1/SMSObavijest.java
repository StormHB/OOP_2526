package abs_cls_interfaces_final.zadatak_S_P1;

public class SMSObavijest implements Obavijestiv {
    private String broj;

    public SMSObavijest(String broj) {
        this.broj = broj;
    }

    @Override
    public void posaljiObavijest(String poruka) {
        System.out.println("Slanje SMS-a na " + broj + ": " + poruka);
    }
}