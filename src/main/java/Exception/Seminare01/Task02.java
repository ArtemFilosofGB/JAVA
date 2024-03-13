package Exception.Seminare01;

public class Task02 {
    public static void main(String[] args) {
        System.out.println("checkArray(new int[]{1,2,3},5) = " + checkArrayLens(new int[]{1, 2, 3}, 2, 5));
    }

    private static int checkArrayLens(int[] arr, int min, int numberToFind) {
        if (arr == null) {
            System.out.println("Array can not be null");
            return -1;
        } else if (arr.length < min) {
            System.out.println("Length of the array is less than min");
            return -3;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == numberToFind)
                    return i;

            }
            System.out.println("Number "+numberToFind+" in not in array");
            return -2;
        }
    }

}