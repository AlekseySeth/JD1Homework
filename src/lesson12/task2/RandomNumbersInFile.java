package lesson12.task2;

import java.io.*;
import java.util.*;

/**
 * @author a.shestovsky
 */
public class RandomNumbersInFile {
    private static final String PATH = "src" + File.separator + "lesson12" + File.separator + "task2";
    private static final int NUMBERS_BOUNDARY = 1000;
    private static final int NUMBERS_QUANTITY = 10;

    public static void main(String[] args) {
        File randomNumbersFirst = createRandomNumbersFile("randomNumbersFirst.txt");
        sortNumbersInFile(randomNumbersFirst, "sortedResultFirst.txt");

        File randomNumbersSecond = createRandomNumbersFile("randomNumbersSecond.txt");
        sortNumbersInFile(randomNumbersSecond, "randomNumbersSecond.txt");
    }

    private static File createRandomNumbersFile(String fileName) {
        File file = new File(PATH, fileName);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; i < NUMBERS_QUANTITY; i++) {
                writer.write(new Random().nextInt(NUMBERS_BOUNDARY) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    private static void sortNumbersInFile(File file, String resultFileName) {
        File result = new File(PATH, resultFileName);
        Set<Integer> listOfNumbers = new TreeSet<>();
        try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(file)))) {
            while (scanner.hasNext()) {
                listOfNumbers.add(Integer.valueOf(scanner.next()));
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter(result));
            for (int current : listOfNumbers) {
                writer.write(current + "\n");
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}