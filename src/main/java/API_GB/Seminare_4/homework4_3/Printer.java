package API_GB.Seminare_4.homework4_3;

/**
 * В обычный калькулятор без логирования добавьте возможность отменить последнюю операцию.
 * <p>
 * Отмена последней операции должна быть реализована следующим образом:
 * если передан оператор '<' калькулятор должен вывести результат предпоследней операции.
 */

import java.util.ArrayDeque;
import java.util.Deque;

class Calculator {
    private Deque<Double> results = new ArrayDeque<>();

    public double calculate(char op, int a, int b) {
        // Напишите свое решение ниже
        switch (op) {
            case ('<'):
                if (results.size() >= 2) {
                    results.pop(); // Remove the last result
                    return results.peek(); // Return the previous result
                }
                break;
            case ('+'):
                double sum = a + b;
                results.push(sum); // Store the result
                return sum;
            case ('*'):
                double mn = a * b;
                results.push(mn); // Store the result
                return mn;
            case ('/'):
                double del = a / b;
                results.push(del); // Store the result
                return del;
            //break;
            case ('-'):
                double difference = a - b;
                results.push(difference); // Store the result
                return difference;
            default:
                break;
        }


        return -1;
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        int a, b, c, d;
        char op, op2, undo;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
//            a = 3;
//            op = '+';
//            b = 7;
//            c = 4;
//            op2 = '+';
//            d = 7;
//            undo = '<';

            a = 20;
            op = '-';
            b = 5;
            c = 4;
            op2 = '*';
            d = 4;
            undo = '<';

        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
            c = Integer.parseInt(args[3]);
            op2 = args[4].charAt(0);
            d = Integer.parseInt(args[5]);
            undo = args[6].charAt(0);
        }

        Calculator calculator = new Calculator();
        double result = calculator.calculate(op, a, b);
        System.out.println(result);
        double  result2 = calculator.calculate(op2, c, d);
        System.out.println(result2);
        double prevResult = calculator.calculate(undo, 0, 0);
        System.out.println(prevResult);
    }
}