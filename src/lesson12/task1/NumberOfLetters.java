package lesson12.task1;

import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author a.shestovsky
 */
public class NumberOfLetters {
    private static final int FIRST_LETTER = 1072;
    private static final int LAST_LETTER = 1103;
    private static final String PATH = "src" + File.separator + "lesson12" + File.separator + "task1";

    public static void main(String[] args) {
        File source = new File(PATH, "source.txt");
        File result = new File(PATH, "result.txt");

        printLettersQuantity(lettersCount(source), result);
    }

    private static Map<Character, Integer> lettersCount(File file) {
        Map<Character, Integer> alphabet = new TreeMap<>();
        for (char currentLetter = FIRST_LETTER; currentLetter <= LAST_LETTER; currentLetter++) {
            alphabet.put(currentLetter, 0);
        }
        try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(file)))) {
            while(scanner.hasNext()) {
                String currentWord = scanner.next();
                for (int i = 0; i < currentWord.length(); i++) {
                    char currentLetter = currentWord.toLowerCase().charAt(i);
                    if (Character.isLetter(currentLetter)) {
                        alphabet.put(currentLetter, alphabet.get(currentLetter) + 1);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return alphabet;
    }

    private static void printLettersQuantity(Map<Character, Integer> map, File file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (Map.Entry entry : map.entrySet()) {
                writer.write(entry.getKey() + " - " + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}