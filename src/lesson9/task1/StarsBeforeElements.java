package lesson9.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author a.shestovsky
 */

public class StarsBeforeElements {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("this", "is", "lots", "of",
                "fun", "for", "every", "Java", "programmer", "test"));
        markLength4(list);
    }

    private static void markLength4(List<String> list) {
        String current;
        int listLimit = list.size();
        for (int counter = 0; counter < listLimit; counter++){
            current = list.get(counter);
            if (current.length() == 4) {
                list.add(counter, "****");
                counter++;
                listLimit++;
            }
        }
        System.out.println(list.toString());
    }
}