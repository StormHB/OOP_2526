package pckg_cls_obj_veh;

public class SportsCar extends Vehicle {
    public SportsCar(String model, String brand, String date) {
        super(brand, model);
        setDate(date);
    }

    @Override
    public void startVehicle() {
        System.out.println("SportsCar starting the engine!");
        System.out.println("Something specific for class SportsCar");
        System.out.println("Related to starting procedure...");
    }

    @Override
    public String toString() {
        return "SportsCar [brand=" + brand +
                ", model=" + model +
                ", date=" + date +
                ", vehID=" + vehID + "]";
    }
}
