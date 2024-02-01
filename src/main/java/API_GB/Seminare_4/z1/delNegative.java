package API_GB.Seminare_4.z1;

import java.util.Arrays;
import java.util.LinkedList;

public class delNegative {
    public static void main(String[] args) {
        LinkedList<Integer> integerList = new LinkedList<>(Arrays.asList(1, -2, 3, -4, -5));
        System.out.println("integerList = " + integerList);
        for (int i = integerList.size(); i > 0; i--) {
            if (integerList.get(i) < 0) {
                integerList.remove(i); //при удалении индексы элементов сдвигаются!!!
                //i--;
            }
        }
        System.out.println("integerList = " + integerList);


    }
}
