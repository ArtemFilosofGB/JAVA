package Exception.Seminare01;

public class Task03 {
    public static void main(String[] args) {
        int[][] arr={
                {0,1,1,0,1},
                {0,1,1,0,1},
                {0,1,1,0,1},
                {0,1,1,0,1},
                {0,1,1,0,1},
        };
        System.out.println("findSumTwoDimArray(arr) = " + findSumTwoDimArray(arr));
    }
    public static int findSumTwoDimArray(int[][] arr){
        int height = arr.length; //колличество строк
        int summ =0;
        for (int[] ints: arr){
            if(ints.length != height)
                throw new RuntimeException("Array is not squared");
            for (int anInt: ints){
                if (anInt == 0 || anInt == 1){
                    summ +=anInt;
                }else {
                    throw new RuntimeException("unacceptable value");
                }
            }
        }
        return summ;
    }
}
