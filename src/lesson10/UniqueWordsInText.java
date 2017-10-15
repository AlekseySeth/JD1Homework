package lesson10;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author a.shestovsky
 */

public class UniqueWordsInText {
    public static void main(String[] args) {
        String text = "Any test in text is written in this testing text for test any TEXT in";
        printWords(uniqueWordsCount(text));
    }

    private static Map<String, Integer> uniqueWordsCount(String text) {
        String[] words = text.split(" ");
        Map<String, Integer> result = new TreeMap<>();
        for (String current : words) {
            result.put(current, 0);
        }
        for (String currentWord : words) {
            for (String currentKey : result.keySet()) {
                if (currentWord.equals(currentKey)) {
                    result.put(currentKey, result.get(currentKey) + 1);
                }
            }
        }
        return result;
    }

    private static void printWords(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}