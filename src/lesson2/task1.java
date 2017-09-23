package lesson2;

import java.util.Scanner;

/**
 * @author a.shestovsky
 *
 * Вывести дату следующего дня в формате "День.Месяц.Год"
 */

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        if (isCorrectData(day, month, year)) {
            switch (month) {
                case 4 :
                case 6 :
                case 9 :
                case 11 :
                    if (day == 30) {
                        day = 1;
                        month++;
                    } else {
                        day++;
                    }
                    break;
                case 2 :
                    if ((isLeapYear(year) && day == 29) || (!isLeapYear(year) && day == 28)) {
                        day = 1;
                        month++;
                    } else {
                        day++;
                    }
                    break;
                case 12 :
                    if (day == 31) {
                        day = 1;
                        month = 1;
                        year++;
                    } else {
                        day++;
                    }
                    break;
                default:
                    if (day == 31) {
                        day = 1;
                        month++;
                    } else {
                        day++;
                    }
                    break;
            }
        } else {
            System.out.println("Incorrect date");
            return;
        }
        System.out.println(resultDate(day, month, year));
    }

    public static boolean isLeapYear (int year) {
        return (year % 400) == 0 || (year % 4) == 0 && (year % 100) != 0;
    }

    public static boolean isCorrectData (int day, int month, int year) {
        if (day < 1 || day > 31 || month < 1 || month > 12 || year < 0) {
            return false;
        }
        switch (month){
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                return day > 0 && day <= 30;
            case 2 :
                return  ((isLeapYear(year) && day > 0 && day <= 29) || (!isLeapYear(year) && day > 0 && day <= 28));
            default:
                return (day > 0 && day <= 31);
        }
    }

    public static String resultDate (int day, int month, int year) {
        return day + "." + month + "." + year;
    }
}
