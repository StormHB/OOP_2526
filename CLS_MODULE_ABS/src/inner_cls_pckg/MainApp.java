package inner_cls_pckg;

public class MainApp {
    public static void main(String[] args) {
        CLSWithLocal test = new CLSWithLocal();

        String[] data = {
                "Martin;32;Zadar",
                "Dino;26;Zadar",
                "Pere;12",
                "Jure,32,Dubrovnik",
                "Marko;30;Zadar",
        };

        test.processStringData(data);
    }
}

