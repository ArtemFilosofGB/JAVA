package API_GB.Seminare_3.homework3_3;


import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

//Реализуйте метод, который принимает на вход целочисленный массив arr:
//- Создаёт список ArrayList, заполненный числами из исходого массива arr.
//- Сортирует список по возрастанию и выводит на экран.
//- Находит минимальное значение в списке и выводит на экран - Minimum is {число} - Находит максимальное значение в списке и выводит на экран - Maximum is {число}
//- Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
//Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers принимает на вход один параметр:
//
//Integer[] arr - массив целых чисел.
//
//Пример.
//Исходный массив:
//
//4, 2, 7, 5, 1, 3, 8, 6, 9
//Результаты:
//
//[1, 2, 3, 4, 5, 6, 7, 8, 9]
//Minimum is 1
//Maximum is 9
class Answer {
    public static void analyzeNumbers(Integer[] arr) {
        // Введите свое решение ниже
        int sum = 0;
        double average = 0.0;
        ArrayList<Integer> resulrArr = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            resulrArr.add(arr[i]);
            sum += arr[i];
        }
        bubleSortArr(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Minimum is " + Collections.min(resulrArr));
        System.out.println("Maximum is " + Collections.max(resulrArr));

        average = (double) sum / (double) resulrArr.size();
        System.out.println("Average is = " + average);


    }
    public static Integer[] bubleSortArr(Integer[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        return arr;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {

        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answer ans = new Answer();
        ans.analyzeNumbers(arr);
    }
}

