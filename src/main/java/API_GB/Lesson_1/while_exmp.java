package API_GB.Lesson_1;

public class while_exmp {
    public static void main(String[] args) {
        int value = 321;
        int count = 0;
        while (value != 0) {
            value /= 10;
            count++;
        }
        System.out.println(count);

        value = 321;
        count = 0;


        do {
            value /= 10;
            count++;
        } while (value != 0);
        System.out.println(count);

    }
}
