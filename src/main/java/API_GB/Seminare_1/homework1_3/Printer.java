package API_GB.Seminare_1.homework1_3;

class Calculator {
    public float calculate(char op, int a, int b) {
        // Введите свое решение ниже
        float result = 0;
        if (op == '+') {
            result = a + b;
        }
        if (op == '-') {
            result = a - b;

        }
        if (op == '*') {
            result = a * b;

        }
        if (op == '/') {
            result = a / b;

        }

        return result;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 4;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }
        if (op != '+' & op != '-' & op != '*' & op != '/') {
            System.out.println("Некорректный оператор: 'оператор'");

        } else {
            Calculator calculator = new Calculator();
            float result = calculator.calculate(op, a, b);
            System.out.println(result);
        }
    }
}