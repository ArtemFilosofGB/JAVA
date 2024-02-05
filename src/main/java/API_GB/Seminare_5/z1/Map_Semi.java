package API_GB.Seminare_5.z1;

import java.util.*;

public class Map_Semi {
    public static void main(String[] args) {
        Map<Character, Integer> mapChar = new TreeMap<>();

//        HashMap - не сортирует
//            LinkedHashMap - сортирует по порядку ввода
//                TreeMap - сортирует по алфавиту

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (!mapChar.containsKey(str.charAt(i))) {
                mapChar.put(str.charAt(i), 1);
            } else {
                mapChar.put(str.charAt(i), mapChar.get(str.charAt(i)) + 1);

            }
        }
        System.out.println("mapChar = " + mapChar);
        for (Map.Entry<Character, Integer> elem : mapChar.entrySet()) {
            System.out.println("elem = " + elem);
        }
        for (Map.Entry<Character, Integer> elem : mapChar.entrySet()) {
            System.out.println(elem.getKey() + " встретился : " + elem.getValue() + " раз");
        }
    }
}