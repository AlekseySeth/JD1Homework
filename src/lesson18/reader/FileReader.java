package lesson18.reader;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author a.shestovsky
 */
public class FileReader {

    public List<String> readFromFile(File input) {
        List<String> result = new ArrayList<>();

        try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(input)))) {
            while (scanner.hasNextLine()) {
                result.add(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}