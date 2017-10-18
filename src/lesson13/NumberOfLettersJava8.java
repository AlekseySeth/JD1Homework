package lesson13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * @author a.shestovsky
 */
public class NumberOfLettersJava8 {

    public static void main(String[] args) throws IOException {

        Map<Character, Integer> result = Files.readAllLines(Paths.get("source.txt"))
                .stream()
                .map(String::toLowerCase)
                .collect(Collectors.joining(""))
                .replaceAll("(\\p{Punct})|(\\p{javaSpaceChar})|(—)", "")
                .chars().mapToObj(c ->(char)c)
                .collect(TreeMap::new, (map, key) -> map.put(key, map.containsKey(key) ? (map.get(key) + 1) : 1), TreeMap::putAll);

        for(Map.Entry e : result.entrySet()) {
            System.out.println(e.getKey() + " - " + e.getValue());
        }
    }
}