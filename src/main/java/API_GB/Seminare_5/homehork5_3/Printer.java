package API_GB.Seminare_5.homehork5_3;

import java.util.Arrays;
//--------------------------

//------------------------
class HeapSort {
    public static void buildTree(int[] tree, int sortLength) {
        // Введите свое решение ниже
        int n = sortLength;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapSort(tree, n);

        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = tree[i];
            tree[i] = tree[0];
            tree[0] = temp;
            heapSort(tree,n);
        }

    }

    public static void heapSort(int[] sortArray, int sortLength) {
// Введите свое решение ниже
        int l = 0 ;
        int r = sortLength;
        int largest = (r+l)/2;

        if (l < sortLength && sortArray[l] > sortArray[largest])
            largest = l;
        if (r < sortLength && sortArray[r] > sortArray[largest])
            largest = r;

        if (sortLength != largest) {
            int temp = sortArray[sortLength];
            sortArray[sortLength] = sortArray[largest];
            sortArray[largest] = temp;

            heapSort(sortArray, largest);//рекурсия
        }
    }
}

// Не удаляйте и не меняйте метод Main!
public class Printer {
    public static void main(String[] args) {
        int[] initArray;

        if (args.length == 0) {
            initArray = new int[]{17, 32, 1, 4, 25, 17, 0, 3, 10, 7, 64, 1};
        } else {
            initArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));
        HeapSort.heapSort(initArray, initArray.length);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));
    }
}