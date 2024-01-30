package Algoritm_and_Data_Structure;

import org.apache.logging.log4j.core.util.SystemMillisClock;

import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {
        int[] array = Sorting.fillArrayRandInt(99000, 0, 99_000_000);
        int[] array2 = Sorting.arrayCopy(array);


//        System.out.println("array = " + Arrays.toString(array));
//        System.out.println("array2 = " + Arrays.toString(array2));

        long start_time = System.currentTimeMillis();
        //System.out.println("Sorting.bubleSortArr(array) = " + Arrays.toString(Sorting.bubleSortArr(array)));
        Sorting.bubleSortArr(array);
        System.out.println("Buble sort time = " + (System.currentTimeMillis() - start_time));

        start_time = System.currentTimeMillis();
        //System.out.println("Sorting.quikSortArr(array2) = " + Arrays.toString(Sorting.quikSortArr(array2, 0, array2.length - 1)));
        Sorting.quikSortArr(array2, 0, array2.length - 1);
        System.out.println("Quik sort time = " + (System.currentTimeMillis() - start_time));

        start_time =System.currentTimeMillis();
        Sorting.binarySearch(array2[1],array2,0,array2.length);
        System.out.println("Binary Search = " + (System.currentTimeMillis() - start_time));



    }
}
