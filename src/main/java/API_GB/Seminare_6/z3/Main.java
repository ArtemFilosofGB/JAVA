package API_GB.Seminare_6.z3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /**
         * 3) Найти пересечения слов в массивах и указать их общее количество.
         * Пример:
         * Mas1= [“qwe”,”asd”,”qwe”,”x”]
         * Mas2=[“qwe”,”v”]
         * Результат:
         * qwe=3
         */

        String[] mas1 = {"qwe","asd","qwe","x","asd","asd"};
        String[] mas2 = {"qwe","v","asd"};

        Set<String> set = new HashSet<>(Arrays.asList(mas1));
        set.retainAll(new HashSet<>(Arrays.asList(mas2)));

        List<String> lst = new ArrayList<>(Arrays.asList(mas1));
        lst.addAll(Arrays.asList(mas2));

      Map<String,Integer> CounterMap =new HashMap<>();
        for (String elem : set) {
            int count = 0;
            for (String s : lst) {
                if (elem == s) {
                    count++;
                }
            }
            System.out.println("count = " + elem + " " + count);
        }


        System.out.println("mas1 = " + mas1.toString());
        System.out.println("mas2 = " + mas2.toString());
    }
}
