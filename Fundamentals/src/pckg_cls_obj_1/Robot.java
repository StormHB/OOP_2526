package pckg_cls_obj_1;

import java.util.Random;

public class Robot {

    private int id;
    private String name;
    private int[][] arr;
    private int row;
    private int col;
    private Random random;

    public Robot(int id, String name) {
        this.id = id;
        this.name = name;
        this.arr = new int[5][4];
        this.row = 0;
        this.col = 0;
        this.random = new Random();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void walk() {
        System.out.println(name + " seta. I roboti znaju hodati!");
    }

    public long factJel(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factJel(n - 1);
    }

    public void fillArr() {
        if (row >= arr.length) {
            System.out.println("2D niz je vec popunjen. Nema vise mjesta.");
            return;
        }

        arr[row][col] = random.nextInt(100); // 0 - 99

        col++;

        if (col == arr[row].length) {
            col = 0;
            row++;
        }
    }

    public void printArr() {
        System.out.println("Sadrzaj 2D niza:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}