package Exception.Seminare01.Homework01.Task01_01;

/**
 Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.

 Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива

 Метод divisionByZero - Деление на 0

 Метод numberFormatException - Ошибка преобразования строки в число

 Важно: они не должны принимать никаких аргументов
 */
class Answer {
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        int[] arr = {1,2,3};
        System.out.println(arr[10]);


    }

    public static void divisionByZero() {
        // Напишите свое решение ниже
        int x=3/0;

    }

    public static void numberFormatException() {
        // Напишите свое решение ниже
        String myString = "five";
        int foo = Integer.parseInt(myString);



    }
}
