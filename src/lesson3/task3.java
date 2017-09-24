package lesson3;

import java.util.Scanner;

/**
 * @author a.shestovsky
 * Отобразить статистику осадков за N дней
 */

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество дней:");
        int numberOfDays = scanner.nextInt();

        if (numberOfDays <= 0) {
            System.out.println("Количество дней должно быть целым положительным числом больше нуля");
            return;
        }

        System.out.printf("\nВведите %d целых положительных чисел, отражающих количество осадков за каждый день\n", numberOfDays);

        int sum = 0;
        int maxValue = 0;
        int currentValue;
        for (int i = 0; i < numberOfDays; i++) {
            currentValue = scanner.nextInt();
            sum += currentValue;
            if (currentValue >= maxValue) {
                maxValue = currentValue;
            }
        }

        System.out.printf("\nКоличество дней - %d\n", numberOfDays);
        System.out.printf("Сумма осадков за период - %d\n", sum);
        System.out.println(String.format("Среднее количество осадков за период - %.2f", (double) sum / numberOfDays));
        System.out.printf("Максимальное количество осадков за период - %d\n", maxValue);
    }
}