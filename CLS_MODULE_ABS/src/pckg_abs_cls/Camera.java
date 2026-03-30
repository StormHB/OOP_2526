package pckg_abs_cls;

public class Camera extends Device{
    protected Camera(String manufacturer, String model) {
        super(manufacturer, model);
    }

    @Override
    protected void operate() {
        System.out.println(this.getClass().getSimpleName() + " operates as a simple digital camera.");
    }


}
