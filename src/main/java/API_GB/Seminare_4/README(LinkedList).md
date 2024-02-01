# LinkedList Java
public class z1 {
public static void main(String[] args) {
LinkedList<Integer> intrgerList = new LinkedList<>();

Добавление элемента:

```agsl
intrgerList.add(1);
intrgerList.add(2);
intrgerList.add(3);
```
```agsl
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
        
```

### Описание :

1. Создание объекта LinkedList: Объявление и инициализация нового объекта LinkedList.

2. Добавление элементов в LinkedList: Используя метод `add()`, добавляем элементы в LinkedList.

3. Вывод размера LinkedList: С помощью метода `size()` выводим текущий размер LinkedList.

4. Проверка, является ли LinkedList пустым: С помощью метода `isEmpty()` проверяем, является ли LinkedList пустым.

5. Получение элемента по индексу: Используя метод `get()`, получаем элемент по указанному индексу.

6. Изменение элемента по индексу: Используя метод `set()`, изменяем элемент по указанному индексу.

7. Удаление элемента по значению: С помощью метода `remove()`, удаляем элемент из LinkedList по указанному значению.

8. Перебор элементов LinkedList с помощью цикла for-each: С использованием цикла for-each перебираем и выводим каждый элемент LinkedList.

9. Удаление всех элементов LinkedList: С помощью метода `clear()` удаляем все элементы из LinkedList.

10. Вывод размера LinkedList после удаления всех элементов: С помощью метода `size()` выводим размер LinkedList после удаления всех элементов.






