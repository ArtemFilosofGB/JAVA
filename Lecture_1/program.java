package Lecture_1;
/**
 * Лекция 1
 * program
 */
public class program {

    public static void main(String[] args) {
        System.out.println("Hello");
        var x =1.1;
        var y =2_000;
        System.out.println(x+y);
        System.out.println(getType(x));
        System.out.println(Integer.MAX_VALUE);

        String s ="qwerty";
        System.out.println(s.charAt(1));

        int a = 123;
        a++;
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);

        x=10;
        System.out.println(--x);
        System.out.println(x--);
        System.out.println(x);
        x= x-- - --x;
        System.out.println(x);

    }
    static String getType(Object o){
        return o.getClass().getSimpleName();
    }
}