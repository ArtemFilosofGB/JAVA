/**
 * Lesson1
 */

import Algoritm_and_Data_Structure.fibonachi;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Lesson1 {
    public static void main(String[] args) {
        List<Integer> availableDivider = findAvalableDivider(100);
        for (Integer integer : availableDivider) {
            System.out.println(integer);
        }
        List<Integer> simpleNunber = findSimpleNumbers(100);
        for (Integer integer : simpleNunber) {
            System.out.println(integer);
        }
        AtomicInteger counter = new AtomicInteger();
        for (int i = 10; i < 13; i++) {
            int fib = fibonachi.fibonachi(i, counter);
            System.out.println("Значение" + i + " Фибоначи: " + fib);
            System.out.println("Значение" + i + " Фибоначи стётчик: " + counter.get());
        }
    }

    /**
     * линейная сложность алгоритма, сложность О(n)
     *
     * @param number
     * @return
     */
    public static List<Integer> findAvalableDivider(int number) {
        List<Integer> result = new ArrayList<>();
        int counter = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) result.add(i);
            counter++;

        }
        System.out.println("Счётчик поиска делителей :" + counter);
        return result;
    }

    /**
     * @param max
     * @return
     * @apiNote Нахожденеи простых чисел
     * +-квадратичная сложность алгоритма , сложность О(n^2)
     */
    public static List<Integer> findSimpleNumbers(int max) {
        List<Integer> result = new ArrayList<>();
        int counter = 0;
        for (int i = 1; i < max; i++) {
            boolean simple = true;
            for (int j = 2; j < i; j++) {
                counter++;
                if (i % j == 0) {
                    simple = false;
                    break;

                }

            }
            if (simple) {
                result.add(i);
            }
        }
        System.out.println("Счётчик функции 'Простые числа' :" + counter);
        return result;
    }
}