package API_GB.Seminare_4.z1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
//Построить однонаправленный список целых чисел. Найти сумму четных элементов списка.
public class Sum_Chet {
    public static void main(String[] args) {
        List<Integer> intList = new LinkedList<>(Arrays.asList(
                1,2,3,4,5,6
        ));
        System.out.println("getSum(intList) = " + getSum(intList));

        System.out.println("changeArr(intList) = " + changeArr(intList));

    }

    private static int getSum(List<Integer> intList) {
        int sum =0;
        for (Integer item : intList) {
            if(item % 2 ==0) sum +=item;
            
        }
        return sum;
    }
    private static int getSumEven(List<Integer> intList) {
        int sum =0;
        for (Integer item : intList) {
            if(item % 2 !=0) sum +=item;

        }
        return sum;
    }
    /**
     * Заменить некратные 3 элементы списка, суммой нечетных элементов.
     */
    private static List<Integer> changeArr(List<Integer> intList){
        int sum = getSumEven(intList);
        for (int i = 0; i < intList.size(); i++) {
            if(intList.get(i)%3!=0){
                intList.set(i,sum);
            }
        }

        return intList;
    }

}

