package API_GB.Lesson_1;
import java.util.Scanner;

public class imput {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        iScanner.close();
        System.out.println("Age:");
        int x =iScanner.nextInt();
    }

}