package inner_loc_cls_final.zadatak_7_2;

public class Main {
    public static void main(String[] args) {

        System.out.println(LocalExpressionEval.eval("2+3*4"));
        System.out.println(LocalExpressionEval.eval("(2+3)*4"));
        System.out.println(LocalExpressionEval.eval("10 / (2 + 3)"));
        System.out.println(LocalExpressionEval.eval("20 - 4 * 3"));

        try {
            System.out.println(LocalExpressionEval.eval("10 / 0"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}