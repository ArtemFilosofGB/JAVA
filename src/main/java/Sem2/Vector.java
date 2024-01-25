package Sem2;

/**
 * @author GeekBrains Srminare
 */
public class Vector {

    private double x;
    private double y;
    private double z;

    public Vector() {
        this.x = 1.0;
        this.y = 1.0;
        this.z = 1.0;

    }

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     * @return double
     * @apiNote Длинна вектора
     */
    public double lenght() {
        double result = Math.sqrt(x * x + y * y + z * z);
        return result;
    }


    /**
     * @param vector2
     * @apiNote скалярное произведение ыккторов
     */
    public double scalar(Vector vector2) {

        return x * vector2.x + y * vector2.y + z * vector2.z;
    }

    /**
     * @apiNote метод, вычисляющий векторное произведение с другим вектором:
     * @param vector2
     * @return Vector
     */
    public Vector multyply(Vector vector2) {
        return new Vector(
        y * vector2.getZ() - z * vector2.getY(),
                z * vector2.getX() - x * vector2.z,
                x * vector2.getY() - y * vector2.x);

    }

    /**
     * @apiNote метод, вычисляющий угол между векторами (или косинус угла): косинус угла
     * между векторами равен скалярному произведению векторов, деленному на
     * произведение модулей (длин) векторов
     * @param vector2
     * @return
     */
    public double cos(Vector vector2) {
        return scalar(vector2)/(lenght()*vector2.lenght());
    }

    /**
     * @apiNote Сумма векторов
     * @param vector2
     * @return Vector
     */
    public Vector sum(Vector vector2) {
        return new Vector(x+vector2.getX(),y+vector2.getY(),z+vector2.getZ());
    }

    /**
     * @apiNote Hfp
     * @param vector2
     * @return
     */
    public Vector degre(Vector vector2) {
        return new Vector(x-vector2.getX(),y-vector2.getY(),z-vector2.getZ());
    }
}
