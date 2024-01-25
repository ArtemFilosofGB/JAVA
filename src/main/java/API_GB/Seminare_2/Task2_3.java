package API_GB.Seminare_2;

public class Task2_3 {
    public static void main(String[] args) {
        Vector vector1 = new Vector(2.0,2.0,2.0);
        Vector vector2 = new Vector();
        System.out.println(vector1);
        System.out.println(vector2);

        System.out.println("vector1.lenght() = " + vector1.lenght());
        System.out.println("vector1.scalar(vector2) = " + vector1.scalar(vector2));
        Vector vector3 = vector1.multyply(vector2);
        System.out.println("vector3 = " + vector3);

        double coss = vector1.cos(vector2);
        System.out.println("vector2 = " + vector2);

        System.out.println("vector1.sum(vector2) = " + vector1.sum(vector2));
        System.out.println("vector1.degre(vector2) = " + vector1.degre(vector2));



    }
}
