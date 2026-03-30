package pckg_cls_obj_veh;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Vehicle {

    protected String brand;
    protected String model;
    protected String date;
    protected int vehID;

    private static int autoInc = 300;

    public Vehicle() {
        vehID = autoInc;
        autoInc++;
    }

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
        vehID = autoInc;
        autoInc++;
    }

    public void setDate(String d) {
        this.date = d;
    }

    public void startVehicle() {
        System.out.println("Vehicle starting the engine!");
    }

    public void stopVehicle() {
        System.out.println("Vehicle stop the vehicle!");
        System.out.println("Vehicle turn off the engine!");
    }

    public void vehInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Vehicle [" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", date=" + date +
                ", vehID=" + vehID +
                ']';
    }
}
