package Exception.hw02.Task02;

public class Expr {
//    public static double expr(int[] intArray, int d) {
//        // Введите свое решение ниже
//        double result = Double.NaN;
////        if (d==0) throw new ArrayIndexOutOfBoundsException("It's not possible to evaluate the expression - intArray[8] / d as d = 0.");
//        if (intArray.length<9)
//            throw new RuntimeException("It\'s not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.");
//        try {
//            return result = intArray[8] / d;
//        } catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0.");
//        }
//
//        return result;
//    }


    public static double expr(int[] intArray, int d) {
        if (intArray.length < 9) {
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.");
            return Double.NaN;
        } else if (d == 0) {
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0.");
            return Double.NaN;
        } else {
            double catchedRes1 = (double) intArray[8] / d;
            System.out.println("intArray[8] / d = " + intArray[8] + " / " + d + " = " + catchedRes1);
            return catchedRes1;
        }
    }

}
