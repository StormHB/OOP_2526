package fst_serial;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        /*
        SpaceShip sp1 = new SpaceShip("Enterprise");
        SpaceShip sp2 = new SpaceShip("Millenium Falcon");
        SpaceShip sp3 = new SpaceShip("Discovery");
        List<SpaceShip> spaceShipList = List.of(sp1, sp2, sp3);
        listAllSpaceShips(spaceShipList);
        String filePath = "./DATA/SpaceShipData.bin";
        saveSpaceShips(spaceShipList, filePath);
        SpaceShip sp4 = new SpaceShip("FFR123");
        SpaceShip sp5 = new SpaceShip("457HH-4");
        //List<SpaceShip> spsl = List.of(spaceShipList, sp4, sp5);
        List<SpaceShip> spsl = new ArrayList<>(spaceShipList);
        spsl.add(sp4);
        spsl.add(sp5);
        saveSpaceShips(spsl, filePath);

        SpaceShip sp6 = new SpaceShip("Seven45-45");
        SpaceShip sp7 = new SpaceShip("EFE-34");
        // addSpaceShip(sp6, filePath2);
        // addSpaceShip(sp7, filePath2);
        List<SpaceShip> spList = new ArrayList<>();
        spList.add(sp6);
        spList.add(sp7);

         */
        String filePath2 = "./DATA/spaceShipDataFile3.dat";
        List<SpaceShip> newSpList = readSpaceShipData(filePath2);
        listAllSpaceShips(newSpList);
    }

    private static void listAllSpaceShips(List<SpaceShip> spl) {
        for (SpaceShip sp : spl) {
            System.out.println(sp);
        }
    }

    private static void saveSpaceShips(List<SpaceShip> ships, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(filePath)))) {
            oos.writeObject(ships);
            System.out.println("Finished writing to a file!");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
            ioe.printStackTrace();
            System.out.println("Can not write into the file!");
        }
    }

    private static void addSpaceShip(SpaceShip spaceShip, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(filePath), true))) {
            oos.writeObject(spaceShip);
            System.out.println("Finished writing one spaceship to a file!");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
            ioe.printStackTrace();
            System.out.println("Can not write into the file!");
        }
    }

    private static List<SpaceShip> readSpaceShipData(String filePath) {
        List<SpaceShip> spaceShipList = null;
        try (FileInputStream fis = new FileInputStream(new File(filePath))) {
            ObjectInputStream ois = new ObjectInputStream(fis);
            spaceShipList = (List<SpaceShip>)ois.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}