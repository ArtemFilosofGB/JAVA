package API_GB.Seminare_6.z1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 5, 2, 3, 1, 232};
        unicProsent(arr);
    }

    /**
     * @param array of int
     * @apiNote Дан массив чисел, посчитать процент уникальных чисел.
     * процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
     */
    private static void unicProsent(int[] arr) {
        Set<Integer> set = new HashSet<>(Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new)));
        System.out.println("set = " + set);
        int unic = set.size() * 100 / arr.length;
        System.out.println("unic = " + unic);
    }
}
