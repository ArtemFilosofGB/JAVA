package API_GB.Seminare_4.homework4_1;

import java.util.LinkedList;

public class LLTasks {
    public static LinkedList<Object> revert(LinkedList<Object> ll) {
        // Напишите свое решение ниже
        LinkedList<Object> resultList = new LinkedList<>();
        while (!ll.isEmpty()){
            resultList.add(ll.getLast());
            ll.pollLast();
//            System.out.println("ll = " + ll);
//            System.out.println("resultList = " + resultList);

        }

        return resultList;
    }
}
