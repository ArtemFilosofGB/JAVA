package Exception.Seminare01;

public class Main {
    public static void main(String[] args) {
        double x =divide(5,0);
        System.out.println("x = " + x);

    }

    /**
     * @apiNote проверка деления на 0
     * @param a
     * @param b
     * @return
     */
    public static double divide(int a, int b){
        double result = Double.POSITIVE_INFINITY;
        try {
            result = a/b;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        return result;
    }
}
