package lesson5;

/**
 * @author a.shestovsky
 *
 * Преобразовать строку, содержащую число в римском формате, в число в арабском формате.
 */

public class RomanToArabicNumerals {
    public static void main(String[] args) {
        String romanSource = "MCMLXXXIV"; //1984

        System.out.println("Решение прямым, длинным, стрёмным способом:");
        System.out.println(straightLongBadConverter(romanSource));
        System.out.println("\nРешение нормальным способом:");
        System.out.println(romanToArabicConverter(romanSource));
    }

    private static int straightLongBadConverter(String romanSource) {
        int arabianResult = 0;
        char currentChar, previousChar;

        for (int i = romanSource.length() - 1; i >= 0 ; i--) {
            currentChar = romanSource.charAt(i);
            if (i == 0) {
                switch (currentChar) {
                    case 'I':
                        arabianResult++;
                        break;
                    case 'V':
                        arabianResult += 5;
                        break;
                    case 'X':
                        arabianResult += 10;
                        break;
                    case 'L':
                        arabianResult += 50;
                        break;
                    case 'C':
                        arabianResult += 100;
                        break;
                    case 'D':
                        arabianResult += 500;
                        break;
                    case 'M':
                        arabianResult += 1000;
                        break;
                }
            } else {
                previousChar = romanSource.charAt(i - 1);
                switch (currentChar) {
                    case 'I':
                        arabianResult++;
                        break;
                    case 'V':
                        if (previousChar == 'I') {
                            arabianResult += 4;
                            i--;
                        } else {
                            arabianResult += 5;
                        }
                        break;
                    case 'X':
                        if (previousChar == 'I') {
                            arabianResult += 9;
                            i--;
                        } else {
                            arabianResult += 10;
                        }
                        break;
                    case 'L':
                        if (previousChar == 'X') {
                            arabianResult += 40;
                            i--;
                        } else {
                            arabianResult += 50;
                        }
                        break;
                    case 'C':
                        if (previousChar == 'X') {
                            arabianResult += 90;
                            i--;
                        } else {
                            arabianResult += 100;
                        }
                        break;
                    case 'D':
                        if (previousChar == 'C') {
                            arabianResult += 400;
                            i--;
                        } else {
                            arabianResult += 500;
                        }
                        break;
                    case 'M':
                        if (previousChar == 'C') {
                            arabianResult += 900;
                            i--;
                        } else {
                            arabianResult += 1000;
                        }
                        break;
                }
            }
        }
        return arabianResult;
    }

    private static int romanToArabicConverter (String romanSource) {
        char[] romanArray = new char[] {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] arabianArray = new int[] {1, 5, 10, 50, 100, 500, 1000};
        int arabianResult = 0;
        int currentArabian = 0;
        int nextArabian = 0;
        String romanSourceWithSpace = romanSource + " ";

        for (int indexOfRoman = 0; indexOfRoman < romanSourceWithSpace.length() - 1; indexOfRoman++) {
            for (int indexOfCurrentArabian = 0; indexOfCurrentArabian < romanArray.length; indexOfCurrentArabian++) {
                if (romanSourceWithSpace.charAt(indexOfRoman) == romanArray[indexOfCurrentArabian]) {
                    currentArabian = arabianArray[indexOfCurrentArabian];
                }
            }
            for (int indexOfNextArabian = 0; indexOfNextArabian < romanArray.length; indexOfNextArabian++) {
                if (romanSourceWithSpace.charAt(indexOfRoman + 1) == romanArray[indexOfNextArabian]) {
                    nextArabian = arabianArray[indexOfNextArabian];
                }
            }
            arabianResult += currentArabian >= nextArabian ? currentArabian : - currentArabian;
        }
        return arabianResult;
    }
}
