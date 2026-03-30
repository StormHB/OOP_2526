package pckg_abs_cls;

import java.util.ArrayList;

public class TestDeviceApp {

    public static void main(String[] args) {
        Device mobilePhone = new MobilePhone("Samsung", "S26");
        mobilePhone.getMainInfo();
        mobilePhone.operate();
        Device camera = new Camera("Sony", "S345");
        camera.getMainInfo();
        camera.operate();
        Device mobile2 = new MobilePhone("IPhone", "17");
        Device cam2 = new Camera("KET", "45I");
        ArrayList<Device> devices = new ArrayList<>();
        addNewDevice(mobilePhone, devices);
        addNewDevice(mobile2, devices);
        addNewDevice(camera, devices);
        addNewDevice(cam2, devices);
        addNewDevice(mobilePhone, devices);
        addNewDevice(mobile2, devices);
        testAllDevices(devices);
        int val = 100;
        changeInt(val);
        System.out.println("\n------------------------\n");
        System.out.println(val);

    }

    private static void changeInt(int val) {
        System.out.println("Input value is: " + val);
        val += 100;
        System.out.println("Now, the value is: " + val);
    }

    private static void addNewDevice(Device device, ArrayList<Device> devices) {
        if(devices.contains(device)) {
            System.out.println("Device is already in the list!");
        } else {
            devices.add(device);
            System.out.println("New device added to the list.");
        }
    }

    private static void testAllDevices(ArrayList<Device> devices) {
        for(Device dev : devices) {
            dev.operate();
            dev.getMainInfo();
            System.out.println("\n-----------------------\n");
        }
    }
}
