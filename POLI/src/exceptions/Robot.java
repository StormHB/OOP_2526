package exceptions;

public abstract class Robot {
    protected String name;
    protected int id;
    private static int cntID = 100;

    protected Robot(String name) {
        this.name = name;
        this.id = cntID++;
    }

    protected void turnOn() {
        System.out.println(this.getClass().getSimpleName() + " is turning on.");
    }

    protected void turnOff() {
        System.out.println(this.getClass().getSimpleName() + " is turning off.");
    }

    protected abstract void chargeState();

    protected abstract void change();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
