package exceptions;

public class FlyingRobot extends Robot {

    private int hours;

    protected FlyingRobot(String name, int fHours) {
        super(name);
        this.hours = fHours;
    }

    @Override
    protected void chargeState() {
        System.out.println("Charging in the air "+ this.getClass().getSimpleName());
    }

    @Override
    protected void change() {
        System.out.println("Fly or land.");
    }
}
