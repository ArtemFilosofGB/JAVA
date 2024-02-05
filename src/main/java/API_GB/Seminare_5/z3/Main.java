package API_GB.Seminare_5.z3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /**
         * Перево дримских чисел в греческие
         */

        String str = "LVIII";
        String str2 = "XXI";
        String str3 = "MCMXCIV";

        System.out.println("fromRometoGreek(str) = " + fromRometoArabik(str));//58
        System.out.println("fromRometoGreek(str2) = " + fromRometoArabik(str2));//17
        System.out.println("fromRometoGreek(str3) = " + fromRometoArabik(str3));//1994

    }

    /**
     * For Rome number to Arabic number
     * @param str
     * @return Int
     */
    private static int fromRometoArabik(String str) {
        Map<Character, Integer> numbers = new HashMap<>(Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000));

        int sum = numbers.get(str.charAt(str.length()-1));

        for (int i = 0; i < str.length() - 1; i++) {
            if (numbers.get(str.charAt(i)) < numbers.get(str.charAt(i + 1))) {
                sum -= numbers.get(str.charAt(i));
            } else sum += numbers.get(str.charAt(i));
        }
        return sum;
    }
}
