package Algoritm_and_Data_Structure;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.Random;

@Data
@AllArgsConstructor
public class Sorting {
    /**
     * Buble sort array
     *
     * @param arr
     * @return sorted arr
     */
    public static int[] bubleSortArr(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        return arr;
    }

    /**
     * Quik sort int Array
     * @param arr
     * @param start
     * @param end
     * @return
     */
    public static int[] quikSortArr(int[] arr, int start, int end) {
        int left = start;
        int right = end;

        int position = arr[start +(end - start) / 2];
        do {
            while (arr[left] < position) {
                left++;
            }
            while (arr[right] > position) {
                right--;
            }
            if (left <= right) {
                if (left < right) {
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                }
                left++;
                right--;
            }

        } while (left <= right);


        if (left < end) {
            quikSortArr(arr, left, right);
        }
        if (start < right) {
            quikSortArr(arr, start, right);
        }
        return arr;
    }

    /**
     * @param size
     * @param fromRand
     * @param toRend
     * @return
     */
    public static int[] fillArrayRandInt(int size, int fromRand, int toRend) {
        int[] arrayFied = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arrayFied[i] = random.nextInt(fromRand, toRend);
        }
        return arrayFied;
    }
    public static int[] arrayCopy(int[] arr){

        int[] arr_coped = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr_coped[i]=arr[i];
        }
        return arr_coped;
    }
    public static int binarySearch(int value,int[] arr, int start, int end){
        int midpoint;
        if(start>end){
            return -1;
        }else {
            midpoint = start+ (end-start)/2;
        }
        if (arr[midpoint]<value){
            binarySearch(value,arr,start,midpoint-1);
        }else if (arr[midpoint]>value){
            binarySearch(value,arr,start,midpoint-1);
        }
        return midpoint;
    }
}
