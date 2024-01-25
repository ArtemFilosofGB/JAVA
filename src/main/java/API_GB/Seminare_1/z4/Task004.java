package API_GB.Seminare_1.z4;

import java.util.Scanner;

public class Task004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов");
        int n = scanner.nextInt();
        int [] arr = new int[n];//todo: int[] arr = {1,2,3}
        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();

        }

        System.out.println(isF(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr"+i+"="+arr[i]);
        }
        }

    private static boolean isF(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            if (arr[i] != arr[arr.length-1-i]) {
            return false;
            }
        }
        return true;
    }
}

