/**
 * 3.	 Даны следующие сведения о кубиках: размер каждого кубика (длина ребра в целых сантиметрах),
 * его цвет (красный, желтый, зеленый тд) и материал (деревянный, металлический, картонный и тд.).
 * Найти:
 * - количество кубиков желтого цвета и их суммарный объем;
 *            - количество деревянных кубиков с ребром 3 см
 */

package API_GB.Seminare_3.z03;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Cube> listCube = new ArrayList<> (Arrays.asList(
                new Cube(3,"желтый","wood"),
                new Cube(4,"black","metal"),
                new Cube(2,"желтый","metal"),
                new Cube(6,"red","wood"),
                new Cube(6,"red","wood"),
                new Cube(6,"red","wood"),
                new Cube(6,"red","wood"),
                new Cube(6,"red","wood"),
                new Cube(6,"red","wood"),
                new Cube(6,"red","wood"),
                new Cube(10,"blue","paper")));

        System.out.println("listCube = " + listCube);
        int countYellow=0;
        int volumeYellow=0;
        int countWood=0;
        for (int i = 0; i < listCube.size(); i++) {
            if (listCube.get(i).getColor().equals("желтый")){
                countYellow++;
                volumeYellow+=listCube.get(i).getVolume();
            }
            if (listCube.get(i).getMatirial().equals("wood")){
                countWood++;
            }
            System.out.println(listCube.get(i));
        }
        System.out.println("countYellow = " + countYellow);
        System.out.println("volumeYellow = " + volumeYellow);
        System.out.println("countWood = " + countWood);

        System.out.println("unicumCollection(listCube) = " + unicumCollection(listCube));

    }

    /**
     * Удаляет дубликаты в Списке
     * @param cubeList
     * @return Collection
     */
    private static Collection unicumCollection(List<Cube> cubeList) {
        return new HashSet(cubeList);
    }
}
