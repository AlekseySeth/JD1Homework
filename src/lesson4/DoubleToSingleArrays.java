package lesson4;

import java.util.Arrays;

/**
 * @author a.shestovsky
 * Написать функцию linearize, которая принимает в качестве параметра двумерный массив и возвращает одномерный массив
 * со всеми элементами двумерного.
 */

public class DoubleToSingleArrays {
    public static void main(String[] args) {
        int[][] doubleArray = new int[][] { {1, 2, 3},
                                            {4, 5},
                                            {6, 7, 8, 9},
                                            {10} };

        int[] singleArray = linearize(doubleArray);
        System.out.println(Arrays.toString(singleArray));
    }

    private static int[] linearize(int[][] doubleArray) {
        int singleArraySize = 0;
        int singleArrayIndex = 0;

        for (int[] outerArrayElement : doubleArray) {
            singleArraySize += outerArrayElement.length;
        }
        int[] singleArray = new int[singleArraySize];

        for (int[] outerArrayElement : doubleArray) {
            for (int innerArrayElement : outerArrayElement) {
                singleArray[singleArrayIndex] = innerArrayElement;
                singleArrayIndex++;
            }
        }
        return singleArray;
    }
}