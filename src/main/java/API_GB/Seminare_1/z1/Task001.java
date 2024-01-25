
package API_GB.Seminare_1.z1;

import java.util.Scanner;


public class Task001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //вспомогательный класс для ввода с клвавиатуры
        System.out.println("Введите число: ");
        int n = scanner.nextInt();
        int result = resultPrMinusSum(n);


        System.out.println("pr - summ " + (result));
        System.out.printf("pr-sum = %s tak?", (result));//

    }

    /**
     * @param n integer
     * @return произведение
     * @apiNote //Given an integer number n, return the difference between the product of its digits and the sum of its digits.
     * //
     * //
     * //Example 1:
     * //
     * //Input: n = 234
     * //Output: 15
     * //Explanation:
     * //Product of digits = 2 * 3 * 4 = 24
     * //Sum of digits = 2 + 3 + 4 = 9
     * //Result = 24 - 9 = 15
     */
    public static int resultPrMinusSum(int n) {
        int pr = 1; //todo: переименовать значение
        int sum = 0;
        while (n != 0) {
            pr *= n % 10;
            sum += n % 10;
            n /= 10;

        }
        return pr - sum;
    }
}
