package lesson3;

import java.util.Scanner;

/**
 * @author a.shestovsky
 *
 * Вывести числа Фибоначчи до введенного числа
 */

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите число:");
        int number = scanner.nextInt();

        System.out.println("Решение с помощью цикла:");
        int fibonacci = 0;
        int tempFirst = 1;
        int tempSecond = 0;
        while (fibonacci < number) {
            System.out.print(fibonacci + " ");
            fibonacci = tempFirst + tempSecond;
            tempFirst = tempSecond;
            tempSecond = fibonacci;
        }

        System.out.println("\n\nРешение с помощью рекурсии:");
        for (int i = 0; fibonacci(i) < number; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int number) {
        switch (number) {
            case 0: return 0;
            case 1: return 1;
            default: return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }
}