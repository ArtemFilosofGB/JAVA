package API_GB.Seminare_3.homework3_2;

import java.util.Arrays;
import java.util.ArrayList;

//Дан произвольный массив целых чисел. Создайте список ArrayList, заполненный данными из этого массива. Необходимо удалить из списка четные числа и вернуть результирующий.
//
//Напишите свой код в методе removeEvenNumbers класса Answer. Метод removeEvenNumbers принимает на вход один параметр: Integer[] arr - список целых чисел, возвращает список ArrayList<Integer>
//
//Примеры.
//Исходный массив:
//
//1, 2, 3, 4, 5, 6, 7, 8, 9
//Результат:
//
//[1, 3, 5, 7, 9]


class Answer {
    public static ArrayList<Integer> removeEvenNumbers(Integer[] arr) {
        // Введите свое решение ниже
        ArrayList<Integer> resultArr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
            resultArr.add(arr[i]);
            }

        }
        System.out.println(resultArr);
        return resultArr;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{-2, -1, 0, 1, 2, 3, 4, 5};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answer ans = new Answer();
        ans.removeEvenNumbers(arr);

    }
}