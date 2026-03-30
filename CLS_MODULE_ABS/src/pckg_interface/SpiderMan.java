package pckg_interface;

public class SpiderMan extends Man implements Fly, RunFast {


    public SpiderMan(String name) {
        super(name);
    }

    @Override
    public void flyingAbility() {

        System.out.println("Spiderman can fly using nets...");
    }

    @Override
    public void fastRunningAbility() {
        System.out.println("Spiderman is running fast.");

    }
}
