package lesson4;

import java.util.Arrays;
import java.util.Random;

/**
 * @author a.shestovsky
 * Программа, которая циклически сдвигает элементы массива вправо на одну позицию, и печатает результат.
 */

public class ArrayElementsShift {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrayToShift = new int[10];

        for (int i = 0; i < arrayToShift.length; i++) {
            arrayToShift[i] = random.nextInt(100);
        }

        System.out.println("Original array:\n" + Arrays.toString(arrayToShift));
        int lastElementValue = arrayToShift[arrayToShift.length - 1];

        for (int arrayIndex = arrayToShift.length - 1; arrayIndex > 0; arrayIndex--) {
            arrayToShift[arrayIndex] = arrayToShift[arrayIndex - 1];
        }

        arrayToShift[0] = lastElementValue;
        System.out.println("\nShifted array:\n" + Arrays.toString(arrayToShift));
    }
}