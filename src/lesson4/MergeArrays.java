package lesson4;

import java.util.Arrays;

/**
 * @author a.shestovsky
 * Слияние массивов.
 */

public class MergeArrays {
    public static void main(String[] args) {
        int[] firstArray = new int[] {1, 2, 3, 4, 5, 6};
        int[] secondArray = new int[] {7, 8, 9, 10};
        int[] resultArray = new int[firstArray.length + secondArray.length];

        int[] minArray = firstArray.length < secondArray.length ? Arrays.copyOf(firstArray, firstArray.length)
                                                                : Arrays.copyOf(secondArray, secondArray.length);

        int[] maxArray = firstArray.length > secondArray.length ? Arrays.copyOf(firstArray, firstArray.length)
                                                                : Arrays.copyOf(secondArray, secondArray.length);
        int mergingArraysIndex = 0;

        for (int resultArrayIndex = 0; resultArrayIndex < resultArray.length; resultArrayIndex++) {
            if (mergingArraysIndex < minArray.length) {
                resultArray[resultArrayIndex] = maxArray[mergingArraysIndex];
                resultArray[resultArrayIndex + 1] = minArray[mergingArraysIndex];
                mergingArraysIndex++;
                resultArrayIndex++;
            } else {
                resultArray[resultArrayIndex] = maxArray[mergingArraysIndex];
                mergingArraysIndex++;
            }
        }
        System.out.println(Arrays.toString(resultArray));
    }
}