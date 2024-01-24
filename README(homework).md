## Java Seminare

## Homework

1.1 Вычислить n-ое треугольного число(сумма чисел от 1 до n).

Внутри класса Answer напишите метод countNTriangle, который принимает число n и возвращает его n-ое треугольное число.
Если число n < 1 (ненатуральное) метод должен вернуть -1.

```
class Answer {
  public int countNTriangle(int n){
    // Введите свое решение ниже
    int result=0;
    
    for (int i = 1; i <= n; i++) {
      result=i+result;
    }

    
    return result;
  }
}
```

1.2 Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке от 1 до 1000, каждое на новой строке.

```
class Answer {
    public void printPrimeNums() {
        // Напишите свое решение ниже
        for (int i = 2; i < 1000; i++) {
            boolean simple = true;
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    simple = false;
                    break;

                } else {

                }
            }
            if (simple) {
                System.out.println(i);
            }

        }

    }
}

```

1.3 В методе calculate класса Calculator реализовать калькулятор, который будет выполнять математические операции (+, -, *, /) над двумя целыми числами и возвращать результат вещественного типа.

В классе Printer необходимо реализовать проверку переданного оператора, при некорректном операторе программа должна вывести сообщение об ошибке "Некорректный оператор: 'оператор'".

Аргументы, передаваемые в метод/функцию:

'3'
'+'
'7'

На выходе:


10.0

```


class Calculator {
    public float calculate(char op, int a, int b) {
        // Введите свое решение ниже
        float result = 0;
        if (op == '+') {
            result = a+b;
        }
        if (op =='-') {
            result= a-b;
            
        }
        if (op=='*') {
            result=a*b;
            
        }
        if (op=='/') {
            result=a/b;
            
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
            a = 12;
            op = '/';
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
```