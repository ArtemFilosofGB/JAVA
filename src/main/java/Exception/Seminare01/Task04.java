package Exception.Seminare01;

import java.util.ArrayList;
import java.util.List;

public class Task04 {
    public static void main(String[] args) {
        checkArray(new Integer[]{1, 2, null,3, null});

    }

    public static void checkArray(Integer[] arr) {
        List<Integer> cash = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null)
                cash.add(i);
            //throw new RuntimeException(String.format("В ячейке с индексом %s встретился null %n", i));
            //System.out.printf("В ячейке с индексом %s встретился null %n", i);
        }
        if (!cash.isEmpty()){
            throw new RuntimeException(String.format("В ячейке с индексами %s встретился null %n", cash));
        }
        else
            System.out.println("Null не найден");
    }
}
