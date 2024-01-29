package API_GB.Lesson_3;

public class Ex01_object {
    public static void main(String[] args) {
        System.out.println(Sum(1, 2));
        System.out.println(Sum(1.0, 2));
        System.out.println(Sum(1, 2.0));
        System.out.println(Sum(3.5, 7.1));
        System.out.println(Sum("каша", "маша"));
    }
    static Object Sum(Object a, Object b) {
        if (a instanceof Double && b instanceof Double) {
            return (Object)((Double) a + (Double) b);
        } else if(a instanceof Integer && b instanceof Integer) {
            return (Object)((Integer) a + (Integer) b);
        } else if (a instanceof String && b instanceof String) {
            return (Object) ((String) a + (String) b);
        } else return 0;
    }

}
