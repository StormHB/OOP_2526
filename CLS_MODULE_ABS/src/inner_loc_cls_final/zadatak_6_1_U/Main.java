package inner_loc_cls_final.zadatak_6_1_U;

public class Main {
    public static void main(String[] args) {

        CounterService service = new CounterService();

        CounterService.Subscription sub = service.subscribe(
                value -> System.out.println("Value changed: " + value)
        );

        service.inc();
        service.inc();

        sub.unsubscribe();

        service.inc();
    }
}