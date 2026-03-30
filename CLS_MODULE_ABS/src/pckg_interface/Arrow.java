package pckg_interface;

public class Arrow extends Man implements Fly, RunFast {
    public Arrow(String name) {
        super(name);
    }

    @Override
    public void flyingAbility() {
        System.out.println("Can not fly!");
    }

    @Override
    public void fastRunningAbility() {
        System.out.println("He is a bit slower than Spiderman.");
    }
}
