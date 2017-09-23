package lesson2;

import java.util.Scanner;

/**
 * @author a.shestovsky
 *
 * Проверить, помещаются ли дома на участке
 */

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размеры a, b, c, d");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int e = 10;
        int f = 10;

        if ((a + c <= e && b <= f && d <= f)
                || (a + d <= e && b <= f && c <= f)
                || (a + c <= f && b <= e && d <= e)
                || (a + d <= f && b <= e && c <= e)) {
            System.out.printf("Дома помещаются на площадке размером %d x %d", e, f);
        } else {
            System.out.printf("Дома не помещаются на площадке размером %d x %d", e, f);
        }
    }
}
