package lesson4;

import java.util.Arrays;

/**
 * @author a.shestovsky
 * Программа, которая удаляет все повторяющиеся целые числа из массива и печатает результат.
 */

public class DeleteDuplicatesInArray {
    public static void main(String[] args) {
        int[] originalArray = new int[] {1, 2, 2, 3, 4, 5, 5, 6, 4, 3, 2, 7, 8, 9, 9, 9};

        int resultArraySize = calculateOriginalElementsCount(originalArray);
        int[] resultArray = new int[resultArraySize];
        int resultArrayIndex = resultArraySize - 1;

        for (int mainIndex = originalArray.length - 1; mainIndex >= 0; mainIndex--) {
            boolean isDuplicate = false;
            for (int indexToCompare = mainIndex - 1; indexToCompare >= 0; indexToCompare--) {
                if (originalArray[mainIndex] == originalArray[indexToCompare]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                resultArray[resultArrayIndex] = originalArray[mainIndex];
                resultArrayIndex--;
            }
        }
        System.out.println(Arrays.toString(resultArray));
    }

    private static int calculateOriginalElementsCount(int[] originalArray) {
        int originalElementsCount = 0;

        for (int mainIndex = 0; mainIndex < originalArray.length; mainIndex++) {
            boolean isDuplicate = false;
            for (int indexToCompare = mainIndex + 1; indexToCompare < originalArray.length; indexToCompare++) {
                if (originalArray[mainIndex] == originalArray[indexToCompare]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                originalElementsCount++;
            }
        }
        return originalElementsCount;
    }
}
