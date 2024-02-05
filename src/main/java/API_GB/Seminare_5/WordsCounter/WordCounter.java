package API_GB.Seminare_5.WordsCounter;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class WordCounter {
    public static void main(String[] args) {
        String openFilePath = "P:\\IT\\JavaProjects\\Seminare\\src\\main\\java\\API_GB\\Seminare_5\\WordsCounter\\EA.txt";
        String exportFilePath = "P:\\IT\\JavaProjects\\Seminare\\src\\main\\java\\API_GB\\Seminare_5\\WordsCounter\\ export_textToCount.txt";

        String text = null;
        try {
            text = readFile(openFilePath, StandardCharsets.UTF_8);
        } catch (
                IOException e) {
            e.printStackTrace();
        }

        //todo: переписать исключение доп символов
        String replaseText = "./?!,;:?U[pPs]-*•«»";
        text = text.toLowerCase().replace("\n", " ")
                .replace(",", " ")
                .replace(".", " ")
                .replaceAll(replaseText, " ");

        String[] textArr = text.split(" ");

        Map<String, Integer> mapWords = getStringIntegerMap(textArr);

        mapPrint(mapWords);


        try (PrintWriter out = new PrintWriter(exportFilePath)) {
            for (Map.Entry<String, Integer> elem : entriesSortedByValues(mapWords)) {

                out.println(elem);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Чтение файла
     *
     * @param path
     * @param encoding
     * @return
     * @throws IOException
     */

    public static String readFile(String path, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }

    /**
     * Print map
     *
     * @param mapWords
     */
    private static void mapPrint(Map<String, Integer> mapWords) {
        for (Map.Entry<String, Integer> elem : entriesSortedByValues(mapWords)) {
            System.out.println(elem);
        }
    }

    /**
     * Подсчёт слов в тексте
     *
     * @param textArr String
     * @return Map<String, Integer>
     */
    private static Map<String, Integer> getStringIntegerMap(String[] textArr) {
        Map<String, Integer> mapWords = new TreeMap<>();

        for (int i = 0; i < textArr.length; i++) {
            if (!mapWords.containsKey(textArr[i])) {
                mapWords.put(textArr[i], 1);
            } else {
                mapWords.put(textArr[i], mapWords.get(textArr[i]) + 1);

            }
        }
        return mapWords;
    }

    /**
     * Sort Map by Value (Integeer)
     *
     * @param map<String, Onteger>
     * @param <K>
     * @param <V>
     * @return SortedSet<Map.Entry < K, V>>
     */
    private static <K, V extends Comparable<? super V>>
    SortedSet<Map.Entry<K, V>> entriesSortedByValues(Map<K, V> map) {
        SortedSet<Map.Entry<K, V>> sortedEntries = new TreeSet<Map.Entry<K, V>>(
                new Comparator<Map.Entry<K, V>>() {
                    @Override
                    public int compare(Map.Entry<K, V> e1, Map.Entry<K, V> e2) {
                        int res = e1.getValue().compareTo(e2.getValue());
                        return res != 0 ? res : 1;
                    }
                }
        );
        sortedEntries.addAll(map.entrySet());
        return sortedEntries;
    }
}
