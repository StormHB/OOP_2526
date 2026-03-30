package pckg_interface;

public class SuperMan extends Man implements Fly, RunFast {
    public SuperMan(String name) {
        super(name);
    }

    @Override
    public void flyingAbility() {
        System.out.println("Can naturally fly...");
    }

    @Override
    public void fastRunningAbility() {
        System.out.println("He can run really fast!");
    }
}
