package pckg_arr_3;

public class POM_ARR {

    public static void print2DArrayFloat(Float[][] fArr) {
        for (int row = 0; row < fArr.length; row++) {
            for (int col = 0; col < fArr[row].length; col++) {
                System.out.print(fArr[row][col] + " ");
            }
            System.out.println();
        }
    }

    /*public static Float[] calcProfit(Float[][] prihodRashod) {
        Float[] profit = new Float[prihodRashod.length];

        for (int k = 0; k < profit.length; k++) {
            profit[k] = prihodRashod[k][1] - prihodRashod[k][2];
            System.out.println("Profit za " + prihodRashod[k][0].intValue() + ". mjesec je: " + profit[k]);
        }

        return profit;
    }*/

    public static Float[] calcProfit(Float[][] prihodRashod) {
        Float[] profit = new Float[prihodRashod.length];

        for (int k = 0; k < profit.length; k++) {
            profit[k] = prihodRashod[k][1] - prihodRashod[k][2];
        }

        return profit;
    }

    public static float avgProfit(Float[] profits) {
        float accuSum = 0.0f;
        for (Float el : profits) {
            accuSum += el;
        }
        return accuSum / profits.length;
    }

    public static float yearlyProfit(Float[] profits) {
        float yearlyProfit = 0.0f;
        for (Float el : profits) {
            yearlyProfit += el;
        }
        return yearlyProfit;
    }
}