/**
 * Lesson1
 */
import java.util.ArrayList;
import java.util.List;
public class Lesson1 {
    public static void main(String[] args) {
        List<Integer> availableDivider = findAvalableDivider(12);
        for (Integer integer:availableDivider){
            System.out.println(integer);
        }
        List<Integer> simpleNunber = findSimpleNumbers(100);
        for (Integer integer:simpleNunber){
            System.out.println(integer);
        }

    }
    /**
     * линейная сложность алгоритма
     * @param number
     * @return
     */
    public static List<Integer> findAvalableDivider(int number) {
        List<Integer> result = new ArrayList<>();
        int counter=0;
        for (int i = 1; i <= number; i++) {
            if(number%i==0) result.add(i);
            counter++;
            
        }
        System.out.println(counter);
        return result;
    }
    /**
     * +-квадратичная сложность алгоритма
     * @param max
     * @return
     */
    public static List<Integer> findSimpleNumbers(int max){
        List<Integer> result = new ArrayList<>();
        int counter=0;
        for (int i = 1; i < max; i++) {
            boolean simple=true;
            for (int j = 2; j < i; j++) {
                counter++;
                if (i%j==0) {
                    simple=false;
                    break;
                    
                }
                
            }
            if (simple){
                result.add(i);
            }
        }
        System.out.println(counter);
        return result; 
    }
}