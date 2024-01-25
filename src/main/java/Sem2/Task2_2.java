package Sem2;

/**
 * 2) Дан массив целых чисел. Найти количество пар соседних элементов, где первый
 * элемент вдвое больше второго.
 */

public class Task2_2 {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,1,12,6};
        int count=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]/arr[i+1]==2)count++;

        }
        System.out.println("Колличество пар соседних элементов, где первый\n" +
                " * элемент вдвое больше второго: ");
        System.out.println(count);

    }
}
