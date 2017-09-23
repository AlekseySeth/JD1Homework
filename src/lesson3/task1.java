package lesson3;

import java.util.Scanner;

/**
 * @author a.shestovsky
 *
 * Вычислить сумму цифр введенного числа
 */

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");

        int number = scanner.nextInt();
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Сумма цифр числа равна " + sum);
    }
}
