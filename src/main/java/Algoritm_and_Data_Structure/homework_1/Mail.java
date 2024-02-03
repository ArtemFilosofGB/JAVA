package Algoritm_and_Data_Structure.homework_1;

import java.util.Arrays;

public class Mail {
    public static void main(String[] args) {

        int[] arr = {100, 5, -7, 85, -500, 1, 19};
        heapSort(arr);
        System.out.println("arr = " + Arrays.toString(arr));

    }

    /**
     * Урок 2. Структуры данных. Массивы. Алгоритмы массивов.
     * Реализовать алгоритм пирамидальной сортировки (сортировка кучей).
     * @param arr
     */
    private static void heapSort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, i, n);

        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            heapify(arr,0,i);
        }

    }

    private static void heapify(int[] arr, int i, int n) {
        int l = i * 2 ;
        int r = i * 2 + 1;
        int largest = i;

        if (l < n && arr[l] > arr[largest])
            largest = l;
        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (i != largest) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, largest, n);//рекурсия
        }

    }
}
