package API_GB.Lesson_3;

import java.util.ArrayList;
import java.util.List;

public class Ex006 {
    public static void main(String[] args) {
        Character value = null;
        //List<Character> list1 = List.of('S', 'e', 'r', 'g', 'e', 'y');// java.lang.UnsupportedOperationException
        List<Character> list1 = new ArrayList<Character>();
        list1.add('A');
        list1.add('r');
        list1.add('T');


        System.out.println("list1 = " + list1);
        list1.remove(1);
        System.out.println("list1 = " + list1);
        List<Character> list2 = List.copyOf(list1);
        
    }
}
