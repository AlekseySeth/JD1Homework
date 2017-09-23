package lesson2;

import java.util.Scanner;

/**
 * @author a.shestovsky
 *
 * Вычислить корни квадратного уравнения
 */

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значения a, b, c");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int d = discriminant(a, b, c);

        if (isPositive(d) || isZero(d)){
            System.out.println("x1 = " + calculateX1(a, b, c, d));
            System.out.println("x2 = " + calculateX2(a, b, c, d));
        } else {
            System.out.println("Дискриминант отрицательный");
        }
    }

    public static int discriminant (int a, int b,int c) {
       return b*b - 4 * a * c;
    }

    public static boolean isPositive(int d) {
        return d > 0;
    }

    public static boolean isZero(int d) {
        return d == 0;
    }

    public static double calculateX1(int a, int b, int c, int d) {
        return (- b + Math.sqrt(d)) / (2 * a);
    }

    public static double calculateX2(int a, int b, int c, int d) {
        return (- b - Math.sqrt(d)) / (2 * a);
    }

}
