package Exception.Seminare02;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println(
                "Укажите индекс элемента массива, " +
                        "в который хотите записать значение 1");
        int index = 0;

        if (scanner.hasNextInt()) {
            index = scanner.nextInt();
        } else {
            System.out.println("Error");
        }

        try {
            arr[index] = 1;
        }
        catch (IndexOutOfBoundsException e) {
            System.err.println("Указан индекс за пределами массива");
        }
    }
}
