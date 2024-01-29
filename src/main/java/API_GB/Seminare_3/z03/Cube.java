package API_GB.Seminare_3.z03;

import java.util.Objects;

/**
 * 3.	 Даны следующие сведения о кубиках: размер каждого кубика (длина ребра в целых сантиметрах),
 * его цвет (красный, желтый, зеленый тд) и материал (деревянный, металлический, картонный и тд.).
 * Найти:
 * - количество кубиков желтого цвета и их суммарный объем;
 * - количество деревянных кубиков с ребром 3 см
 */

public class Cube {
    public Integer getLenght() {
        return lenght;
    }

    public void setLenght(Integer lenght) {
        this.lenght = lenght;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatirial() {
        return matirial;
    }

    public void setMatirial(String matirial) {
        this.matirial = matirial;
    }

    public Cube(Integer lenght, String color, String matirial) {
        this.lenght = lenght;
        this.color = color;
        this.matirial = matirial;
    }

    public Cube() {
    }

    @Override
    public String toString() {
        return "Cube{" +
                "lenght=" + lenght +
                ", color='" + color + '\'' +
                ", matirial='" + matirial + '\'' +
                '}';
    }

    private Integer lenght;
    private String color;
    private String matirial;

    public Integer getVolume() {
        return (int) Math.pow(lenght,3);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cube cube = (Cube) o;
        return Objects.equals(lenght, cube.lenght) && Objects.equals(color, cube.color) && Objects.equals(matirial, cube.matirial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lenght, color, matirial);
    }
}
