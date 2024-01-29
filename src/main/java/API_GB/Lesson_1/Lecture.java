package API_GB.Lesson_1;

public class Lecture {
    public static void main(String[] args) {

        System.out.println("Логические операции, с битами");

        int a1 = 5;//101
        int a2 = 2;//010
        boolean b1 =true;
        boolean b2 = false;

        System.out.println("Побитовое & "+ (a1 & a2));
        System.out.println("Побитовое && "+ (b1 && b1));
        System.out.println("Побитовое | "+ (a1 | a2));
        System.out.println("Побитовое || "+ (b1 || b2));



        binary_move();

        bool_test();

        strangeQestion();

        print_min_int();
    }

    /**
     * Побитовый сдвиг использовать при нахожнджении корней
     */
    private static void binary_move() {
        int a = 8;//1000
        Integer b = 16;//10000
        String st = Integer.toBinaryString(b);
        System.out.println(b + " Binary " + st);

        System.out.println(a);
        System.out.println(b);

        a = a << 1;
        b = b << 1;

        System.out.println(a);
        System.out.println(b);
    }

    private static void bool_test() {
        boolean x = 123 > 124;
        System.out.println(x);
    }

    private static void strangeQestion() {
        int x = 112;
        x = x-- - --x;
        System.out.println(x);
    }

    private static void print_min_int() {
        System.out.println(Integer.MIN_VALUE);
    }


}
