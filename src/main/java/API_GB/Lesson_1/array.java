package API_GB.Lesson_1;

public class array {
    public static void main(String[] args) {

        int arrr[] = new int[]{1,2,3,4,5};
        arrr[0]=123;
        System.out.println(arrr[0]);

        int[] brr[] = new int[3][4];
        int[][] arr = new int[3][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d ", arr[i][j]);

            }
            System.out.println();
        }
    }

}
