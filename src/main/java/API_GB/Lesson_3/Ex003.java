package API_GB.Lesson_3;

import java.util.ArrayList;

public class Ex003 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>(10);
        ArrayList<Integer> list4 = new ArrayList<>(list3);

        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        System.out.println("list3 = " + list3);
        list3.add(123);
        list3.add(23);
        list3.add(23);
        System.out.println("list3 = " + list3);
        list4 =list3;
        System.out.println("list4 = " + list4);

    }
}
