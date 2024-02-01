package API_GB.Seminare_4.z1;

import java.util.LinkedList;
import java.util.List;

public class z1 {
    public static void main(String[] args) {
        LinkedList<Integer> intrgerList = new LinkedList<>();
        intrgerList.add(2);
        intrgerList.add(5);
        intrgerList.add(3);
        intrgerList.add(-13);
        intrgerList.add(10);
        System.out.println("intrgerList = " + intrgerList);

        System.out.println("intrgerList.peek() = " + intrgerList.peek());//ссылка на первый элемент списка
        System.out.println("intrgerList.pop() = " + intrgerList.pop());//удалить элемент
        System.out.println("intrgerList = " + intrgerList);


        intrgerList.addFirst(7);//Дбавить элемент в начало
        intrgerList.addLast(77);// Добавить в конец
        System.out.println("intrgerList = " + intrgerList);

        //Замена индекса
        intrgerList.set(3,100);// заменяет индекс - 3 на значение 100
        System.out.println("intrgerList = " + intrgerList);

        //Проверка
        System.out.println("intrgerList.contains(100) = " + intrgerList.contains(100));//проверка содержит ли элеммент
        System.out.println("intrgerList.contains(100) = " + intrgerList.contains(101));

        System.out.println("intrgerList.indexOf(100) = " + intrgerList.indexOf(100));//возврат индекса элемента

        //Удаление
        System.out.println("!  intrgerList = " + intrgerList);
        intrgerList.remove((Integer) 3);//Удаляется обьект= ячейку со значением 4
        System.out.println("!  intrgerList = " + intrgerList);
        intrgerList.remove( 3);//Удаляется ячейку с индексом 4
        System.out.println("!  intrgerList = " + intrgerList);


    }
}
