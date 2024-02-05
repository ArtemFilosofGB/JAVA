package API_GB.Seminare_5.z2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>(Arrays.asList(1, 2, 3, 3));

        System.out.println(containsDouble(lst));
    }

    public static boolean containsDouble(List<Integer> lst) {
        Map<Integer, Integer> dubs = new HashMap<>();
        for (Integer i : lst) {
            if (!dubs.containsKey(i)) {
                dubs.put(i, 1);
            } else {
                return true;
            }
        }
        return false;
    }
}
