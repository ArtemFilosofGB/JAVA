package Exception.Seminare01;

public class Task01 {
    public static void main(String[] args) {
        System.out.println("checkArray(new int[]{1,2,3},5) = " + checkArrayLens(new int[]{1, 2, 3}, 2));
    }

    private static int checkArrayLens(int[] arr, int min) {
        if (arr.length<min)
            return -1;
        else return arr.length;
    }
}
