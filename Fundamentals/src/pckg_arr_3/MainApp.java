package pckg_arr_3;

public class MainApp {

    public static void main(String[] args) {

        Float[][] dvals = {
                {1f, 125855f, 105625f},
                {2f, 284569f, 155748f},
                {3f, 324152f, 198455f},
                {4f, 204563f, 195251f},
                {5f, 452198f, 257654f},
                {6f, 471326f, 322188f},
                {7f, 505169f, 355748f},
                {8f, 498569f, 315782f},
                {9f, 367163f, 389455f},
                {10f, 289568f, 302369f},
                {11f, 115255f, 109854f},
                {12f, 98544f, 85223f}
        };

        int fst = dvals[0].length;
        int all = dvals.length;

        System.out.println("Broj redaka: " + all);
        System.out.println("Broj stupaca: " + fst);

        // POM_ARR.print2DArrayFloat(dvals);

        Float[] profits = POM_ARR.calcProfit(dvals);

        System.out.print("Prosjecni profit tvrtke za promatranu godinu je: ");
        System.out.println(POM_ARR.avgProfit(profits));

        System.out.print("Ukupni profit tvrtke za promatranu godinu je: ");
        System.out.println(POM_ARR.yearlyProfit(profits));
    }
}