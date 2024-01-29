package API_GB.Seminare_3.z04;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashSet;

//4
//        Напишите метод, который на вход получает коллекцию объектов, а
//        возвращает коллекцию уже без дубликатов.

@Slf4j
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListInt = new ArrayList<Integer>();
        arrayListInt.add(1);
        arrayListInt.add(1);
        arrayListInt.add(2);
        arrayListInt.add(22);
        arrayListInt.add(3);
        arrayListInt.add(1);
        arrayListInt.add(3);
        HashSet resultArrayList = dubleKill(arrayListInt);
        System.out.println("resultArrayList = " + resultArrayList);

        System.out.println("resultArrayList = " + resultArrayList);



    }

    /**
     * Метод удаляет дубликаты
     * @param arrayListInt
     * @return
     */
    private static HashSet dubleKill(ArrayList<Integer> arrayListInt) {
        
        return new HashSet(arrayListInt);
    }
}


