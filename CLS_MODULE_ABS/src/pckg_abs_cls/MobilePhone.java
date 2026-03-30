package pckg_abs_cls;

public class MobilePhone extends Device {

    protected MobilePhone(String manufacturer, String model) {
        super(manufacturer, model);
    }

    @Override
    protected void operate() {
        System.out.println(this.getClass().getSimpleName() + " operates as a normal mobile phone does.");
    }
}
