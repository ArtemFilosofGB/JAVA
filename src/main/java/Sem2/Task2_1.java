package Sem2;

import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов в последовательности: ");
        int n = scanner.nextInt();
        System.out.println("Сумма элементов: ");
        System.out.println(getSum(scanner, n));
    }

    /**
     * @param scanner
     * @param n
     * @return Сумма
     * @APInote 1) Дана последовательность из N целых чисел.
     * // Найти сумму чисел, оканчивающихся на 5, перед которыми идет четное число.
     */
    private static int getSum(Scanner scanner, int n) {
        int sum = 0;
        int current = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int next = scanner.nextInt();
            if (next % 10 == 5 && current % 2 == 0) {
                sum += next;
            }
            current = next;
        }
        return sum;
    }
}
